package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.Policia;
import upc.edu.pe.gosecurity.repositories.IPoliciaRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.IPoliciaService;

import java.util.List;

@Service
public class PoliciaServiceImplement implements IPoliciaService {
    @Autowired
    private IPoliciaRepository pR;

    @Override
    public void insert(Policia policia) {
        pR.save(policia);
    }

    @Override
    public List<Policia> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPolicia) {
        pR.deleteById(idPolicia);
    }

    @Override
    public List<Policia> findByNumeroPlacaPolicia(String NroPlaca) {
        return pR.findByNumeroPlacaPolicia(NroPlaca);
    }
}
