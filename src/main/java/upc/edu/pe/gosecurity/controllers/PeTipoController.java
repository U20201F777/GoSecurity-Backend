package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.PTipoDTO;
import upc.edu.pe.gosecurity.entities.PertenenciasTipo;
import upc.edu.pe.gosecurity.servicesInterfaces.PTipoInterfaces;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PertenenciaTipo")
public class PeTipoController {
    @Autowired
    private PTipoInterfaces TR;
    @PostMapping
    public void registrar(@RequestBody PTipoDTO dto){
        ModelMapper m = new ModelMapper();
        PertenenciasTipo p=m.map(dto,PertenenciasTipo.class);
        TR.insert(p);
    }
    @PutMapping
    public void Modificar(@RequestBody PTipoDTO dto){
        ModelMapper m = new ModelMapper();
        PertenenciasTipo p=m.map(dto,PertenenciasTipo.class);
        TR.insert(p);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id ){
        TR.delete(id);
    }
    @GetMapping
    public List<PTipoDTO> listar(){
        return TR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PTipoDTO.class);
        }).collect(Collectors.toList());
    }
}
