package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.NotixCiudadanoDTO;
import upc.edu.pe.gosecurity.dtos.PoliciaDTO;
import upc.edu.pe.gosecurity.entities.Policia;
import upc.edu.pe.gosecurity.servicesInterfaces.IPoliciaService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/policia")
public class PoliciaController {

    @Autowired
    private IPoliciaService pS;

    @PostMapping
    public void registrar(@RequestBody Policia dto) {
        ModelMapper m = new ModelMapper();
        Policia p = m.map(dto, Policia.class);
        pS.insert(p);
    }
    @GetMapping("/listbyUser/{username}")
    public PoliciaDTO listbyUser(@PathVariable ("username")String username){
        ModelMapper m=new ModelMapper();
        PoliciaDTO dto=m.map(pS.listbyUser(username),PoliciaDTO.class);
        return dto;
    }
    @PutMapping
    public void Modificar(@RequestBody PoliciaDTO dto){
        ModelMapper m = new ModelMapper();
        Policia p=m.map(dto,Policia.class);
        pS.insert(p);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }
    @GetMapping("/{id}")
    public PoliciaDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        PoliciaDTO dto=m.map(pS.listId(id), PoliciaDTO.class);
        return dto;
    }
    @GetMapping
    public List<PoliciaDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PoliciaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscarPlaca")
    public List<PoliciaDTO> buscarPlaca(@RequestBody String placa) {
        return pS.findByNumeroPlacaPolicia(placa).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PoliciaDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/Solicitudes")
    @PreAuthorize("hasAuthority('POLICIA') or hasAuthority('ADMIN')")
    public List<NotixCiudadanoDTO> solicitudNoAtendida(){
        List<String[]> lista=pS.casosPorTipo();
        List<NotixCiudadanoDTO> listaDTO=new ArrayList<>();
        for (String[] data:lista){
            NotixCiudadanoDTO dto= new NotixCiudadanoDTO();
            dto.setDniCiudadano(data[0]);
            dto.setNombrePertenencia(data[1]);
            dto.setCantAtendido(Integer.parseInt(data[2]));
            dto.setCantNoAtendido(Integer.parseInt(data[3]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}