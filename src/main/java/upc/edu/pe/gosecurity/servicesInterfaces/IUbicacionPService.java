package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.UbicacionP;

import java.util.List;

public interface IUbicacionPService {

    public void insert(UbicacionP ubicacionP);
    public List<UbicacionP> list();
    public void delete(int idUbicacionP);
    public UbicacionP listId(int idUbicacionP);

}
