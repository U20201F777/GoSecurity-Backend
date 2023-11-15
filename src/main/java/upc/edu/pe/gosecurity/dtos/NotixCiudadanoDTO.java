package upc.edu.pe.gosecurity.dtos;

public class NotixCiudadanoDTO {
    private String tipo_caso;
    private int DNIciudadano;
    private String nombreP;
    private String nombreDescripción;
    private int idnotificacion;

    public String getTipo_caso() {
        return tipo_caso;
    }

    public void setTipo_caso(String tipo_caso) {
        this.tipo_caso = tipo_caso;
    }

    public int getDNIciudadano() {
        return DNIciudadano;
    }

    public void setDNIciudadano(int DNIciudadano) {
        this.DNIciudadano = DNIciudadano;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getNombreDescripción() {
        return nombreDescripción;
    }

    public void setNombreDescripción(String nombreDescripción) {
        this.nombreDescripción = nombreDescripción;
    }

    public int getIdnotificacion() {
        return idnotificacion;
    }

    public void setIdnotificacion(int idnotificacion) {
        this.idnotificacion = idnotificacion;
    }
}
