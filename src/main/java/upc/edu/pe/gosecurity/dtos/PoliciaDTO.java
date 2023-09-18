package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.Usuario;

public class PoliciaDTO {
    private int idPolicia;
    private String numeroPlacaPolicia;
    private String fotoRostroPolicia;
    private String fotoIdentPolicia;
    private String rangoPolicia;
    private Usuario usuario;

    /*
    Nota: añadir relaciones notificacion y comisaria

    private Notificacion notificacion;
    private Comisaria comisaria;
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
    Añadir getter and setter

     public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

     public Comisaria getComisaria() {
        return comisaria;
    }

    public void setComisaria(Comisaria comisaria) {
        this.comisaria = comisaria;
    }
     */

}
