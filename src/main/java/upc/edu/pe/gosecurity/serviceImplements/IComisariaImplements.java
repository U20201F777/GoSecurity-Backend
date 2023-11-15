package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.Comisaria;
import upc.edu.pe.gosecurity.repositories.ComisariaRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.IComisariaService;

import java.util.List;
@Service
public class IComisariaImplements implements IComisariaService {

    @Autowired
    private ComisariaRepository cR;
    @Override
    public void insert(Comisaria comisaria) {
        cR.save(comisaria);
    }

    @Override
    public List<Comisaria> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idComisaria) {
        cR.deleteById(idComisaria);
    }

    @Override
    public Comisaria listId(int idComisaria) {
        return cR.findById(idComisaria).orElse(new Comisaria());
    }

    @Override
    public List<String[]> FindByDenunciasComisariaPolicia() {
        return cR.FindByDenunciasComisariaPolicia();
    }

}
