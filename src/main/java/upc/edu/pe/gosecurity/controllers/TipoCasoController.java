package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.TipoCasoDTO;
import upc.edu.pe.gosecurity.entities.TipoCaso;
import upc.edu.pe.gosecurity.servicesInterfaces.ITipoCasoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TipoCasos")
public class TipoCasoController {
    @Autowired
    private ITipoCasoService tS;
    @PostMapping
    public void Registrar(@RequestBody TipoCasoDTO dto){
        ModelMapper m= new ModelMapper();
        TipoCaso p=m.map(dto, TipoCaso.class);
        tS.insert(p);
    }
    @PutMapping
    public void Modificar(@RequestBody TipoCasoDTO dto){
        ModelMapper m= new ModelMapper();
        TipoCaso p=m.map(dto, TipoCaso.class);
        tS.insert(p);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        tS.delete(id);
    }
    @GetMapping("/{id}")
    public TipoCasoDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        TipoCasoDTO dto = m.map(tS.listId(id), TipoCasoDTO.class);
        return dto;
    }
    @GetMapping
    public List<TipoCasoDTO> list() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoCasoDTO.class);
        }).collect(Collectors.toList());
    }
}
