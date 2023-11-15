package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.PertenenciaDTO;
import upc.edu.pe.gosecurity.entities.Pertenencias;
import upc.edu.pe.gosecurity.serviceImplements.PertenenciasImplements;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Pertenencia")
public class PertenenciaController {
    @Autowired
    private PertenenciasImplements PR;
    @PostMapping
    public void registrar(@RequestBody PertenenciaDTO dto){
        ModelMapper m = new ModelMapper();
        Pertenencias p=m.map(dto,Pertenencias.class);
        PR.insert(p);
    }
    @PutMapping
    public void Modificar(@RequestBody PertenenciaDTO dto){
        ModelMapper m = new ModelMapper();
        Pertenencias p=m.map(dto,Pertenencias.class);
        PR.insert(p);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id ){
        PR.delete(id);
    }
    @GetMapping("/{id}")
    public PertenenciaDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PertenenciaDTO dto=m.map(PR.ListId(id), PertenenciaDTO.class);
        return dto;
    }
    @GetMapping
    public List<PertenenciaDTO> listar(){
        return PR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PertenenciaDTO.class);
        }).collect(Collectors.toList());
    }
}
