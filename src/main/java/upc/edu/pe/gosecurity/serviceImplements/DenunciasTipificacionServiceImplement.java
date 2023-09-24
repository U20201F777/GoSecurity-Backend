package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.DenunciasTipificacion;
import upc.edu.pe.gosecurity.repositories.IDenunciasTipificacionRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.IDenunciasTipificacionService;

import java.util.List;

@Service
public class DenunciasTipificacionServiceImplement implements IDenunciasTipificacionService {
    @Autowired
    private IDenunciasTipificacionRepository pR;

    @Override
    public void insert(DenunciasTipificacion denunciasTipificacion) {
        pR.save(denunciasTipificacion);
    }

    @Override
    public List<DenunciasTipificacion> LIST() {
        return pR.findAll();
    }

    @Override
    public void delete(int idDenunciasTipificacion) {
        pR.deleteById(idDenunciasTipificacion);
    }

}
