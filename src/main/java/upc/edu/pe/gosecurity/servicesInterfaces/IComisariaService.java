package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.Comisaria;

import java.util.List;

public interface IComisariaService {
    public void insert(Comisaria comisaria);
    public List<Comisaria> list();
    public void delete(int idComisaria);
    public Comisaria listId(int idComisaria);
    public List<String[]> FindByDenunciasComisariaPolicia();
}
