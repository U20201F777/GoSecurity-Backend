package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.Ciudadano;

import java.util.List;

public interface ICiudadanoService {
    public void insert(Ciudadano ciudadano);
    public List<Ciudadano> list();
    public void delete(int idCiudadano);
    public Ciudadano listId(int idCiudadano);
    List<Ciudadano> findByNumeroCiudadano(String dniCiudadano);
}
