package upc.edu.pe.gosecurity.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.UbicacionCDTO;
import upc.edu.pe.gosecurity.entities.UbicacionC;
import upc.edu.pe.gosecurity.servicesInterfaces.IUbicacionCService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/UbicacionC")
public class UbicacionCControllers {

    @Autowired
    private IUbicacionCService uS;
    @PostMapping
    public void Registrar(@RequestBody UbicacionCDTO dto){
        ModelMapper m= new ModelMapper();
        UbicacionC u =m.map(dto, UbicacionC.class);
        uS.insert(u);
    }
    @PutMapping
    public void modificar(@RequestBody UbicacionCDTO dto){
        ModelMapper m = new ModelMapper();
        UbicacionC u = m.map(dto,UbicacionC.class);
        uS.insert(u);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        uS.delete(id);
    }
    @GetMapping("/{id}")
    public UbicacionCDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        UbicacionCDTO dto=m.map(uS.listId(id), UbicacionCDTO.class);
        return dto;
    }
    @GetMapping
    public List<UbicacionCDTO> list() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UbicacionCDTO.class);
        }).collect(Collectors.toList());
    }
}
