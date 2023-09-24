package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.PoliciaDTO;
import upc.edu.pe.gosecurity.entities.Policia;
import upc.edu.pe.gosecurity.servicesInterfaces.IPoliciaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("policia")
public class PoliciaController {

    @Autowired
    private IPoliciaService pS;
    @PostMapping
    public void registrar(@RequestBody Policia dto){
        ModelMapper m= new ModelMapper();
        Policia p=m.map(dto, Policia.class);
        pS.insert(p);
    }
    @GetMapping
    public List<PoliciaDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PoliciaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }
}
