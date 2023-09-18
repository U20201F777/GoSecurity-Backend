package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "Policia")
public class Policia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPolicia;
    @Column(name = "numeroPlacaPolicia", length = 15, nullable = false)
    private String numeroPlacaPolicia;
    @Column(name = "fotoRostroPolicia", length = 100, nullable = false)
    private String fotoRostroPolicia;
    @Column(name ="fotoIdentPolicia", length = 100,nullable = false)
    private String fotoIdentPolicia;
    @Column(name = "rangoPolicia", length = 50, nullable = false)
    private String rangoPolicia;
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    /*
    @OneToOne
    @JoinColumn(name = "idNotificacion")
    private Notificacion notificacion;

    @OneToOne
    @JoinColumn(name = "idComisaria")
    private Comisaria comisaria;
     */

    public Policia() {
    }

    public Policia(int idPolicia, String numeroPlacaPolicia, String fotoRostroPolicia, String fotoIdentPolicia, String rangoPolicia, Usuario usuario) {
        this.idPolicia = idPolicia;
        this.numeroPlacaPolicia = numeroPlacaPolicia;
        this.fotoRostroPolicia = fotoRostroPolicia;
        this.fotoIdentPolicia = fotoIdentPolicia;
        this.rangoPolicia = rangoPolicia;
        this.usuario = usuario;
    }

    /*
    Nota: Contructores para implementar las relaciones 1 a 1 con Notificaciones y Comisaria , se debe remplazar o generar

      public Policia(int idPolicia, String numeroPlacaPolicia, String fotoRostroPolicia, String fotoIdentPolicia, String rangoPolicia, Usuario usuario, Notificacion notificacion, Comisaria comisaria) {
        this.idPolicia = idPolicia;
        this.numeroPlacaPolicia = numeroPlacaPolicia;
        this.fotoRostroPolicia = fotoRostroPolicia;
        this.fotoIdentPolicia = fotoIdentPolicia;
        this.rangoPolicia = rangoPolicia;
        this.usuario = usuario;
        this.Notificacion = notificacion;
        this.Comisaria = comisaria;
    }
     */

    public int getIdPolicia() {
        return idPolicia;
    }

    public void setIdPolicia(int idPolicia) {
        this.idPolicia = idPolicia;
    }

    public String getNumeroPlacaPolicia() {
        return numeroPlacaPolicia;
    }

    public void setNumeroPlacaPolicia(String numeroPlacaPolicia) {
        this.numeroPlacaPolicia = numeroPlacaPolicia;
    }

    public String getFotoRostroPolicia() {
        return fotoRostroPolicia;
    }

    public void setFotoRostroPolicia(String fotoRostroPolicia) {
        this.fotoRostroPolicia = fotoRostroPolicia;
    }

    public String getFotoIdentPolicia() {
        return fotoIdentPolicia;
    }

    public void setFotoIdentPolicia(String fotoIdentPolicia) {
        this.fotoIdentPolicia = fotoIdentPolicia;
    }

    public String getRangoPolicia() {
        return rangoPolicia;
    }

    public void setRangoPolicia(String rangoPolicia) {
        this.rangoPolicia = rangoPolicia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /*
    Notas: getter and setter de Notificación y comisaria

     public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

      public Comisaria getComisaria() {
        return notificacion;
    }

    public void setComisaria(Comisaria comisaria) {
        this.comisaria = comisaria;
    }
     */
}
