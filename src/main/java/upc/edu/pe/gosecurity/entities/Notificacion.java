package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "Notificacion")
public class Notificacion {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idNotificación;
   @ManyToOne
   @JoinColumn(name = "idTipoCaso")
   private TipoCaso idTipoCaso;

    public Notificacion() {
    }

    public Notificacion(int idNotificación, TipoCaso idTipoCaso) {
        this.idNotificación = idNotificación;
        this.idTipoCaso = idTipoCaso;
    }

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
