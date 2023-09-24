package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.PertenenciasColor;
import upc.edu.pe.gosecurity.repositories.PColorRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.PColorInterfaces;

import java.util.List;

@Service
public class PColorImplements implements PColorInterfaces {
    @Autowired
    private PColorRepository CR;

    @Override
    public void insert(PertenenciasColor pertenenciasColor){
        CR.save(pertenenciasColor);
    }
    @Override
    public List<PertenenciasColor> list(){
    return
            CR.findAll();
    }
    @Override
    public void delete(int idPertenenciasColor){
        CR.deleteById(idPertenenciasColor);
    }
}
