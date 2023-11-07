package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.PertenenciasModelo;
import upc.edu.pe.gosecurity.entities.TipoCaso;

import java.util.List;

public interface PModeloInterfaces {
    public void insert(PertenenciasModelo pertenenciasModelo);
    public List<PertenenciasModelo> list();
    public void delete(int idPertenenciasModelo);
    public PertenenciasModelo listId(int idPertenenciasModelo);
}
