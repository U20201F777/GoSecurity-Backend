package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.CiudadanoDTO;
import upc.edu.pe.gosecurity.entities.Ciudadano;
import upc.edu.pe.gosecurity.servicesInterfaces.ICiudadanoService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ciudadano")
public class CiudadanoController {

    @Autowired
    private ICiudadanoService cS;
    @PostMapping
    public void registrar(@RequestBody CiudadanoDTO dto){
        ModelMapper m= new ModelMapper();
        Ciudadano c=m.map(dto, Ciudadano.class);
        cS.insert(c);
    }
    @PostMapping("/insert")
    public void insertNew(@RequestBody CiudadanoDTO dto){
        ModelMapper m=new ModelMapper();
        Ciudadano a=m.map(dto, Ciudadano.class);
        cS.insert(a);
    }
    @GetMapping("/listByUser/{username}")
    public CiudadanoDTO listByUser(@PathVariable ("username")String username){
        ModelMapper m=new ModelMapper();
        CiudadanoDTO dto=m.map(cS.listbyUser(username),CiudadanoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody CiudadanoDTO dto){
        ModelMapper m = new ModelMapper();
        Ciudadano p=m.map(dto,Ciudadano.class);
        cS.insert(p);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public CiudadanoDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        CiudadanoDTO dto=m.map(cS.listId(id), CiudadanoDTO.class);
        return dto;
    }
    @GetMapping
    public List<CiudadanoDTO> listar() {
        return cS.list().stream().map(x ->{
            ModelMapper m=new ModelMapper();
            return m.map(x, CiudadanoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/buscar")
    public List<CiudadanoDTO> buscar(@RequestParam int dniCiudadano) {
        return cS.findByNumeroCiudadano(dniCiudadano).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CiudadanoDTO.class);
        }).collect(Collectors.toList());
    }
}
