package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.PertenenciasTipo;

import java.util.List;

public interface PTipoInterfaces {
    public void insert(PertenenciasTipo pertenenciasTipo);
    public List<PertenenciasTipo> list();
    public void delete(int idPerteneneciasTipo);
}
