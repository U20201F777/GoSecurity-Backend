package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.Policia;

import java.util.List;

public interface IPoliciaService {
    public void insert(Policia policia);
    public List<Policia> list();
    public Policia listId(int idPolicia);
    public void delete(int idPolicia);
    List<Policia> findByNumeroPlacaPolicia(String NroPlaca);
    public Policia listbyUser(String username);
    public List<String[]> casosPorTipo();
}
