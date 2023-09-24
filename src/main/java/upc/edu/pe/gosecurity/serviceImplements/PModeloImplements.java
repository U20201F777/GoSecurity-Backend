package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.PertenenciasModelo;
import upc.edu.pe.gosecurity.repositories.PModeloRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.PModeloInterfaces;

import java.util.List;

@Service
public class PModeloImplements implements PModeloInterfaces {
    @Autowired
    private PModeloRepository ModR;
    @Override
    public void insert(PertenenciasModelo pertenenciasModelo){
        ModR.save(pertenenciasModelo);
    }
    @Override
    public List<PertenenciasModelo> list(){
        return
                ModR.findAll();
    }
    @Override
    public void delete(int idPertenenciasModelo){
        ModR.deleteById(idPertenenciasModelo);
    }
}

