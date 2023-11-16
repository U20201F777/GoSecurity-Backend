package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.Policia;
import upc.edu.pe.gosecurity.entities.TipoCaso;

public class NotificacionDTO {
    private int idNotificacion;
    private TipoCaso idTipoCaso;
    private Policia idPolicia;

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public TipoCaso getIdTipoCaso() {
        return idTipoCaso;
    }

    public void setIdTipoCaso(TipoCaso idTipoCaso) {
        this.idTipoCaso = idTipoCaso;
    }

    public Policia getIdPolicia() {
        return idPolicia;
    }

    public void setIdPolicia(Policia idPolicia) {
        this.idPolicia = idPolicia;
    }
}