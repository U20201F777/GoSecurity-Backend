package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.PModeloDTO;
import upc.edu.pe.gosecurity.entities.PertenenciasModelo;
import upc.edu.pe.gosecurity.servicesInterfaces.PModeloInterfaces;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PertenenciaModelo")
public class PModeloController {
    @Autowired
    private PModeloInterfaces ModR;
    @PostMapping
    public void registrar(@RequestBody PModeloDTO dto){
        ModelMapper m = new ModelMapper();
        PertenenciasModelo p=m.map(dto,PertenenciasModelo.class);
        ModR.insert(p);
    }
    @PutMapping
    public void Modificar(@RequestBody PModeloDTO dto){
        ModelMapper m = new ModelMapper();
        PertenenciasModelo p=m.map(dto,PertenenciasModelo.class);
        ModR.insert(p);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id ){
        ModR.delete(id);
    }
    @GetMapping("/{id}")
    public PModeloDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        PModeloDTO dto=m.map(ModR.listId(id), PModeloDTO.class);
        return dto;
    }
    @GetMapping
    public List<PModeloDTO> listar(){
        return ModR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PModeloDTO.class);
        }).collect(Collectors.toList());
    }
}
