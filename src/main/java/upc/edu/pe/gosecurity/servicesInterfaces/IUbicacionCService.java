package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.TipoCaso;
import upc.edu.pe.gosecurity.entities.UbicacionC;

import java.util.List;

public interface IUbicacionCService {
    public void insert(UbicacionC ubicacionC);
    public List<UbicacionC> list();
    public void delete(int idUbicacionc);
    public UbicacionC listId(int idUbicacionC);
}
