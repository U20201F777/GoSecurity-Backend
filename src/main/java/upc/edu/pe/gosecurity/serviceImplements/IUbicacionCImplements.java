package upc.edu.pe.gosecurity.serviceImplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.UbicacionC;
import upc.edu.pe.gosecurity.repositories.UbicacionCRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.IUbicacionCService;

import java.util.List;
@Service
public class IUbicacionCImplements implements IUbicacionCService {

    @Autowired
    private UbicacionCRepository uR;
    @Override
    public void insert(UbicacionC ubicacionC) {
        uR.save(ubicacionC);
    }

    @Override
    public List<UbicacionC> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUbicacionC) {
        uR.deleteById(idUbicacionC);
    }

    @Override
    public UbicacionC listId(int idUbicacionC) {
        return uR.findById(idUbicacionC).orElse(new UbicacionC());
    }
}
