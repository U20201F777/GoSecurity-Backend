package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.DenunciasDTO;
import upc.edu.pe.gosecurity.dtos.DenunciasxCiudadanoDTO;
import upc.edu.pe.gosecurity.entities.Denuncias;
import upc.edu.pe.gosecurity.servicesInterfaces.IDenunciasService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/denuncias")
public class DenunciasController {
    @Autowired
    private IDenunciasService pS;
    @PostMapping
    public void registrar(@RequestBody DenunciasDTO dto){
        ModelMapper m = new ModelMapper();
        Denuncias d=m.map(dto, Denuncias.class);
        pS.insert(d);
    }
    @GetMapping
    public List<DenunciasDTO> Listar(){
        return pS.LIST().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DenunciasDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}") 
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }
    @GetMapping("/{id}")
    public DenunciasDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        DenunciasDTO dto=m.map(pS.listId(id), DenunciasDTO.class);
        return dto;
    }
    @PutMapping
    public void Modificar(@RequestBody DenunciasDTO dto){
        ModelMapper m = new ModelMapper();
        Denuncias p=m.map(dto,Denuncias.class);
        pS.insert(p);
    }
    @GetMapping("/DenunciasxCiudadano")
    public List<DenunciasxCiudadanoDTO> DenunciasxCiudadano(){
        List<String[]> lista=pS.DenunciasxCiudadano();
        List<DenunciasxCiudadanoDTO> listaDTO=new ArrayList<>();
        for (String[] data:lista){
            DenunciasxCiudadanoDTO dto= new DenunciasxCiudadanoDTO();
            dto.setIdDenuncias(Integer.parseInt(data[0]));
            dto.setDNIciudadano(Integer.parseInt(data[1]));
            dto.setCantDenuncias(Integer.parseInt(data[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
