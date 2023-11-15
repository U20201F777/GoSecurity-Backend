package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.Ciudadano;

import java.util.List;

public interface ICiudadanoService {
    public void insert(Ciudadano ciudadano);
    public List<Ciudadano> list();
    public Ciudadano listId(int idCiudadano);
    public void delete(int idCiudadano);
    List<Ciudadano> findByNumeroCiudadano(int dniCiudadano);
}
