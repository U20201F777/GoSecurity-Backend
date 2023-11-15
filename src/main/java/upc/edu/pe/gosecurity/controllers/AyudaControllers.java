package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.AyudaDTO;
import upc.edu.pe.gosecurity.entities.Ayuda;
import upc.edu.pe.gosecurity.servicesInterfaces.IAyudaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ayuda")
public class AyudaControllers {
    @Autowired
    private IAyudaService aS;
    @PostMapping
    public void registrar(@RequestBody AyudaDTO dto){
        ModelMapper m= new ModelMapper();
        Ayuda p=m.map(dto, Ayuda.class);
        aS.insert(p);
    }
    @PutMapping
    public void modificar(@RequestBody AyudaDTO dto){
        ModelMapper m= new ModelMapper();
        Ayuda p=m.map(dto, Ayuda.class);
        aS.insert(p);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        aS.delete(id);
    }
    @GetMapping("/{id}")
    public AyudaDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        AyudaDTO dto=m.map(aS.listId(id), AyudaDTO.class);
        return dto;
    }
    @GetMapping
    public List<AyudaDTO> list() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AyudaDTO.class);
        }).collect(Collectors.toList());
    }

}