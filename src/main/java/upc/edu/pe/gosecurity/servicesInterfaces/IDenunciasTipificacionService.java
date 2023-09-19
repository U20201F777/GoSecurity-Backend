package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.DenunciasTipificacion;

import java.util.List;

public interface IDenunciasTipificacionService {
    void insert(DenunciasTipificacion denunciasTipificacion);
    public List<DenunciasTipificacion> LIST();
    public void delete(int idDenunciasTipificacion);
    public DenunciasTipificacion listId(int idDenunciasTipificacion);
    List<DenunciasTipificacion> findByNameDenunciasTipificacion(String nameDenunciasTipificacion);



}
