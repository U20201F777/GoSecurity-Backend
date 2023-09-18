package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.Notificacion;
import upc.edu.pe.gosecurity.repositories.NotificacionRepository;
import upc.edu.pe.gosecurity.serviceinterfaces.INotificacionService;

import java.util.List;

@Service
public class NotificacionImplements implements INotificacionService {
    @Autowired
    private NotificacionRepository nR;
    @Override
    public void insert(Notificacion notificacion) {
        nR.save(notificacion);
    }

    @Override
    public List<Notificacion> list() {
        return nR.findAll();
    }

    @Override
    public void delete(int idNotificacion) {
        nR.deleteById(idNotificacion);
    }

    @Override
    public Notificacion listId(int idNotificacion) {
        return nR.findById(idNotificacion).orElse(new Notificacion());
    }
}