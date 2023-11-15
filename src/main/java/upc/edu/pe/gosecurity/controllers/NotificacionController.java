package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.NotificacionDTO;
import upc.edu.pe.gosecurity.entities.Notificacion;
import upc.edu.pe.gosecurity.servicesInterfaces.INotificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Notificacion")
public class NotificacionController {
    @Autowired
    private INotificacionService nS;
    @PostMapping
    public void Registrar(@RequestBody NotificacionDTO dto){
        ModelMapper m= new ModelMapper();
        Notificacion p=m.map(dto, Notificacion.class);
        nS.insert(p);
    }
    @GetMapping
    public List<NotificacionDTO> list() {
        return nS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, NotificacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        nS.delete(id);
    }

    @GetMapping("/{id}")
    public NotificacionDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        NotificacionDTO dto = m.map(nS.listId(id), NotificacionDTO.class);
        return dto;
    }
    @PutMapping
    public void Modificar(@RequestBody NotificacionDTO dto){
        ModelMapper m= new ModelMapper();
        Notificacion p=m.map(dto, Notificacion.class);
        nS.insert(p);
    }
}
