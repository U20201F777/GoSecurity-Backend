package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.DenunciasTipificacionDTO;
import upc.edu.pe.gosecurity.entities.DenunciasTipificacion;
import upc.edu.pe.gosecurity.servicesInterfaces.IDenunciasTipificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/denunciastipificacion")
public class DenunciasTipificacionController {
    @Autowired
    private IDenunciasTipificacionService pS;
    @PostMapping
    public void registrar(@RequestBody DenunciasTipificacionDTO dto){
        ModelMapper m = new ModelMapper();
        DenunciasTipificacion d=m.map(dto, DenunciasTipificacion.class);
        pS.insert(d);

    }
    @GetMapping
    public List<DenunciasTipificacionDTO> Listar(){
        return pS.LIST().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, DenunciasTipificacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }
    @PutMapping
    public void Modificar(@RequestBody DenunciasTipificacionDTO dto){
        ModelMapper m = new ModelMapper();
        DenunciasTipificacion p=m.map(dto,DenunciasTipificacion.class);
        pS.insert(p);
    }
}
