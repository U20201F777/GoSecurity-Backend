package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.PertenenciasMarca;

import java.util.List;

public interface PMarcaInterfaces {
    public void insert(PertenenciasMarca pertenenciasMarca);
    public List<PertenenciasMarca> list();
    public void delete(int idPertenenciasMarca);
    public PertenenciasMarca ListId(int idPertenenciasMarca);

    List<PertenenciasMarca>findByNamePertenenciasMarca(String namePertenenciasMarca);
}

