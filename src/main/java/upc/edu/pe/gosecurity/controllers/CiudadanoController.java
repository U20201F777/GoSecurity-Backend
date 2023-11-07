package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.AyudaDTO;
import upc.edu.pe.gosecurity.dtos.CiudadanoDTO;
import upc.edu.pe.gosecurity.dtos.DenunciasDTO;
import upc.edu.pe.gosecurity.entities.Ciudadano;
import upc.edu.pe.gosecurity.entities.Denuncias;
import upc.edu.pe.gosecurity.servicesInterfaces.ICiudadanoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("ciudadano")
public class CiudadanoController {

    @Autowired
    private ICiudadanoService cS;
    @PostMapping
    public void registrar(@RequestBody Ciudadano dto){
        ModelMapper m= new ModelMapper();
        Ciudadano c=m.map(dto, Ciudadano.class);
        cS.insert(c);
    }
    @GetMapping("/{id}")
    public CiudadanoDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        CiudadanoDTO dto=m.map(cS.listId(id), CiudadanoDTO.class);
        return dto;
    }
    @PutMapping
    public void Modificar(@RequestBody DenunciasDTO dto){
        ModelMapper m = new ModelMapper();
        Ciudadano p=m.map(dto,Ciudadano.class);
        cS.insert(p);
    }
    @GetMapping
    public List<CiudadanoDTO> listar() {
        return cS.list().stream().map(x ->{
            ModelMapper m=new ModelMapper();
            return m.map(x, CiudadanoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cS.delete(id);
    }
}
