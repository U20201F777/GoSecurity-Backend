package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.PColorDTO;
import upc.edu.pe.gosecurity.entities.PertenenciasColor;
import upc.edu.pe.gosecurity.servicesInterfaces.PColorInterfaces;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PertenenciaColor")
public class PColorController {
    @Autowired
    private PColorInterfaces CR;
    @PostMapping
    public void registrar(@RequestBody PColorDTO dto){
        ModelMapper m = new ModelMapper();
        PertenenciasColor p=m.map(dto,PertenenciasColor.class);
        CR.insert(p);
    }
    @PutMapping
    public void Modificar(@RequestBody PColorDTO dto){
        ModelMapper m = new ModelMapper();
        PertenenciasColor p=m.map(dto,PertenenciasColor.class);
        CR.insert(p);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id ){
        CR.delete(id);
    }

    @GetMapping
    public List<PColorDTO> listar(){
        return CR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PColorDTO.class);
        }).collect(Collectors.toList());
    }
}
