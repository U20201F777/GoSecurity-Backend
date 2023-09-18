package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.Notificacion;

import java.util.List;

public interface INotificacionService {
    public void insert(Notificacion notificacion);
    public List<Notificacion> list();
    public void delete(int idNotificacion);
    public Notificacion listId(int idNotificacion);
}
