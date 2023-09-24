package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.Pertenencias;

import java.util.List;

public interface PertenenciasInterfaces {
    public void insert(Pertenencias pertenencias);
    public List<Pertenencias> list();
    public void delete(int idPertenencias);
    public Pertenencias ListId(int idPertenencias);
}

