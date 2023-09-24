package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.UbicacionPDTO;
import upc.edu.pe.gosecurity.entities.UbicacionP;
import upc.edu.pe.gosecurity.servicesInterfaces.IUbicacionPService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/UbicacionP")
public class UbicacionPControllers {
    @Autowired
    private IUbicacionPService uS;
    @PostMapping
    public void Registrar(@RequestBody UbicacionPDTO dto){
        ModelMapper m= new ModelMapper();
        UbicacionP p=m.map(dto, UbicacionP.class);
        uS.insert(p);
    }
    @GetMapping
    public List<UbicacionPDTO> list() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UbicacionPDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        uS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody UbicacionPDTO dto){
        ModelMapper m = new ModelMapper();
        UbicacionP u = m.map(dto,UbicacionP.class);
        uS.insert(u);
    }

}
