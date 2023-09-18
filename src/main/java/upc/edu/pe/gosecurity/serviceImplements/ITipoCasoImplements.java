package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.TipoCaso;
import upc.edu.pe.gosecurity.repositories.TipoCasoRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.ITipoCasoService;

import java.util.List;

@Service
public class ITipoCasoImplements implements ITipoCasoService {
    @Autowired
    private TipoCasoRepository tR;

    @Override
    public void insert(TipoCaso tipoCaso) {
        tR.save(tipoCaso);
    }

    @Override
    public List<TipoCaso> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTipoCaso) {
        tR.deleteById(idTipoCaso);
    }

    @Override
    public TipoCaso listId(int idTipoCaso) {
        return tR.findById(idTipoCaso).orElse(new TipoCaso());
    }
}