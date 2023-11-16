package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "Notificacion")
public class Notificacion {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idNotificacion;
   @ManyToOne
   @JoinColumn(name = "idTipoCaso")
   private TipoCaso idTipoCaso;
   @ManyToOne
   @JoinColumn(name= "idPolicia")
   private Policia idPolicia;

    public Notificacion() {
    }

    public Notificacion(int idNotificacion, TipoCaso idTipoCaso, Policia idPolicia) {
        this.idNotificacion = idNotificacion;
        this.idTipoCaso = idTipoCaso;
        this.idPolicia = idPolicia;
    }

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
