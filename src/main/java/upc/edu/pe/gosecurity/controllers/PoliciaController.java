package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.AyudaDTO;
import upc.edu.pe.gosecurity.dtos.NotixCiudadanoDTO;
import upc.edu.pe.gosecurity.dtos.PoliciaDTO;
import upc.edu.pe.gosecurity.entities.Ayuda;
import upc.edu.pe.gosecurity.entities.Policia;
import upc.edu.pe.gosecurity.servicesInterfaces.IPoliciaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("policia")
public class PoliciaController {

    @Autowired
    private IPoliciaService pS;

    @PostMapping
    public void registrar(@RequestBody Policia dto) {
        ModelMapper m = new ModelMapper();
        Policia p = m.map(dto, Policia.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PoliciaDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PoliciaDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public PoliciaDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        PoliciaDTO dto=m.map(pS.listId(id), PoliciaDTO.class);
        return dto;
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }
    @PutMapping
    public void Modificar(@RequestBody PoliciaDTO dto){
        ModelMapper m= new ModelMapper();
        Policia p=m.map(dto, Policia.class);
        pS.insert(p);
    }

    @PostMapping("/buscarPlaca")
    public List<PoliciaDTO> buscarPlaca(@RequestBody String placa) {
        return pS.findByNumeroPlacaPolicia(placa).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PoliciaDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/NotixCiudadano")
    public List<NotixCiudadanoDTO> NotificacionxCiudadano(){
        List<String[]> lista=pS.finByDescripcionNotixCiudadano();
        List<NotixCiudadanoDTO> listaDTO=new ArrayList<>();
        for (String[] data:lista){
            NotixCiudadanoDTO dto= new NotixCiudadanoDTO();
            dto.setTipo_caso(data[0]);
            dto.setDNIciudadano(Integer.parseInt(data[1]));
            dto.setNombreP(data[2]);
            dto.setNombreDescripción(data[3]);
            dto.setIdnotificacion(Integer.parseInt(data[4]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}