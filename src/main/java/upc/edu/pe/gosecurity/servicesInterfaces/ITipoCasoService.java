package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.TipoCaso;

import java.util.List;

public interface ITipoCasoService {
    public void insert(TipoCaso tipoCaso);
    public List<TipoCaso> list();
    public void delete(int idTipoCaso);
    public TipoCaso listId(int idTipoCaso);
}
