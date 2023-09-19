package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.Denuncias;

import java.util.List;

public interface IDenunciasService {
    public void insert(Denuncias denuncias);
    public List<Denuncias> LIST();
    public void delete(int idDenuncias);
    public Denuncias listId(int idDenuncias);
    List<Denuncias> findByNameDenuncias (String nameDenuncias);



}
