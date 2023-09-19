package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.EstadoUbicacionDTO;
import upc.edu.pe.gosecurity.entities.EstadoUbicacion;
import upc.edu.pe.gosecurity.servicesInterfaces.IEstadoUbicacion;

@RestController
@RequestMapping("/EstadoUbicacion")
public class EstadoUbicacionControllers {

    @Autowired
    private IEstadoUbicacion eS;
    @PostMapping
    public void Registrar(@RequestBody EstadoUbicacionDTO dto){
        ModelMapper m= new ModelMapper();
        EstadoUbicacion p=m.map(dto, EstadoUbicacion.class);
        eS.insert(p);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        eS.delete(id);
    }
}



