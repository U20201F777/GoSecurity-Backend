package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.EstadoUbicacion;
import upc.edu.pe.gosecurity.repositories.EstadoUbicacionRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.IEstadoUbicacion;


@Service
public class IEstadoUbicacionImplements implements IEstadoUbicacion {

   @Autowired
   private EstadoUbicacionRepository eR;

    @Override
    public void insert(EstadoUbicacion estadoUbicacion) {
        eR.save(estadoUbicacion);
    }

    @Override
    public void delete(int idEstadoUbicacion) {
        eR.deleteById(idEstadoUbicacion);
    }
}
