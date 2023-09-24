package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.PertenenciasMarca;
import upc.edu.pe.gosecurity.repositories.PMarcaRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.PMarcaInterfaces;

import java.util.List;

@Service
public class PMarcaImplements implements PMarcaInterfaces {
    @Autowired
    private PMarcaRepository MarR;

    @Override
    public void insert(PertenenciasMarca pertenenciasMarca){
        MarR.save(pertenenciasMarca);
    }
    @Override
    public List<PertenenciasMarca> list(){
        return
                MarR.findAll();
    }
    @Override
    public void delete(int idPertenenciasMarca){

        MarR.deleteById(idPertenenciasMarca);
    }
}
