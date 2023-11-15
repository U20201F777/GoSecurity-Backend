package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.EstadoUbicacion;

import java.time.LocalDate;


public class UbicacionPDTO {

    private int idUbicacionP;

    private int latitud;

    private int longitud;

    private LocalDate fecha;

    private EstadoUbicacion estadoUbicacion;

    public int getIdUbicacion() {
        return idUbicacionP;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacionP = idUbicacionP;
    }

    public int getIdUbicacionP() {
        return idUbicacionP;
    }

    public void setIdUbicacionP(int idUbicacionP) {
        this.idUbicacionP = idUbicacionP;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public EstadoUbicacion getEstadoUbicacion() {
        return estadoUbicacion;
    }

    public void setEstadoUbicacion(EstadoUbicacion estadoUbicacion) {
        this.estadoUbicacion = estadoUbicacion;
    }
}
