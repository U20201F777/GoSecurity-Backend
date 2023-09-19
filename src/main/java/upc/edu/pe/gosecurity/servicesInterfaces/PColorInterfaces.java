package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.PertenenciasColor;

import java.util.List;

public interface PColorInterfaces {
    public void insert(PertenenciasColor pertenenciasColor);
    public List<PertenenciasColor> list();
    public void delete(int idPertenenciasColor);
    public PertenenciasColor ListId(int idPertenenciasColor);

    List<PertenenciasColor>findByNamePertenenciasColor(String namePertenenciasColor);
}

