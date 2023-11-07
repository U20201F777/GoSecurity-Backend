package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.AyudaDTO;
import upc.edu.pe.gosecurity.dtos.PMarcaDTO;
import upc.edu.pe.gosecurity.entities.PertenenciasMarca;
import upc.edu.pe.gosecurity.servicesInterfaces.PMarcaInterfaces;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PertenenciaMarca")
public class PMarcaController {
    @Autowired
    private PMarcaInterfaces MarR;
    @PostMapping
    public void registrar(@RequestBody PMarcaDTO dto){
        ModelMapper m = new ModelMapper();
        PertenenciasMarca p=m.map(dto,PertenenciasMarca.class);
        MarR.insert(p);
    }

    @GetMapping
    public List<PMarcaDTO> listar(){
        return MarR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PMarcaDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public PMarcaDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        PMarcaDTO dto=m.map(MarR.listId(id), PMarcaDTO.class);
        return dto;
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id ){
        MarR.delete(id);
    }

    @PutMapping
    public void Modificar(@RequestBody PMarcaDTO dto){
        ModelMapper m = new ModelMapper();
        PertenenciasMarca p=m.map(dto,PertenenciasMarca.class);
        MarR.insert(p);
    }

}
