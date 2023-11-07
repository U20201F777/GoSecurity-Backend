package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.DenunciasLugarHecho;

import java.util.List;

public interface IDenunciasLugarHechoService {
    void insert(DenunciasLugarHecho denunciasLugarHecho);
    public List<DenunciasLugarHecho> LIST();
    public void delete(int idDenunciasLugarHecho);
    public DenunciasLugarHecho listId(int idDenunciasLugarHecho);
}
