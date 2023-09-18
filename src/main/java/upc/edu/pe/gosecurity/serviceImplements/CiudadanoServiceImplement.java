package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.Ciudadano;
import upc.edu.pe.gosecurity.repositories.ICiudadanoRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.ICiudadanoService;

import java.util.List;

@Service
public class CiudadanoServiceImplement implements ICiudadanoService {
    @Autowired
    private ICiudadanoRepository cR;

    @Override
    public void insert(Ciudadano ciudadano) {
        cR.save(ciudadano);
    }

    @Override
    public List<Ciudadano> list() {
        return cR.findAll();
    }
}
