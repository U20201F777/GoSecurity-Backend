package upc.edu.pe.gosecurity.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.DenunciasLugarHechoDTO;
import upc.edu.pe.gosecurity.entities.DenunciasLugarHecho;
import upc.edu.pe.gosecurity.servicesInterfaces.IDenunciasLugarHechoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/denunciaslugarhecho")

public class DenunciasLugarHechoController {
    @Autowired
    private IDenunciasLugarHechoService pS;
    @PostMapping
    public void registrar(@RequestBody DenunciasLugarHechoDTO dto){
        ModelMapper m = new ModelMapper();
        DenunciasLugarHecho d=m.map(dto, DenunciasLugarHecho.class);
        pS.insert(d);
    }
    @PutMapping
    public void Modificar(@RequestBody DenunciasLugarHechoDTO dto){
        ModelMapper m = new ModelMapper();
        DenunciasLugarHecho p=m.map(dto,DenunciasLugarHecho.class);
        pS.insert(p);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public DenunciasLugarHechoDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        DenunciasLugarHechoDTO dto=m.map(pS.listId(id), DenunciasLugarHechoDTO.class);
        return dto;
    }
    @GetMapping
    public List<DenunciasLugarHechoDTO> Listar(){
        return pS.LIST().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DenunciasLugarHechoDTO.class);
        }).collect(Collectors.toList());
    }

}
