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
    public void Registrar(@RequestBody AyudaDTO dto){
        ModelMapper m= new ModelMapper();
        Ayuda p=m.map(dto, Ayuda.class);
        aS.insert(p);
    }
    @GetMapping
    public List<AyudaDTO> list() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AyudaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        aS.delete(id);
    }
    @PutMapping
    public void Modificar(@RequestBody AyudaDTO dto){
        ModelMapper m= new ModelMapper();
        Ayuda p=m.map(dto, Ayuda.class);
        aS.insert(p);
    }
}