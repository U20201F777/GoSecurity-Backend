package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.TipoCaso;

public class NotificacionDTO {
    private int idNotificación;
    private TipoCaso idTipoCaso;

    public int getIdNotificación() {
        return idNotificación;
    }

    public void setIdNotificación(int idNotificación) {
        this.idNotificación = idNotificación;
    }

    public TipoCaso getIdTipoCaso() {
        return idTipoCaso;
    }

    public void setIdTipoCaso(TipoCaso idTipoCaso) {
        this.idTipoCaso = idTipoCaso;
    }
}