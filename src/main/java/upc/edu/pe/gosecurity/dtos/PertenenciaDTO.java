package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.*;

import java.time.LocalDate;

public class PertenenciaDTO {
    private int idPertenencias;
    private String namePertenencias;
    private LocalDate anioPertenencias;
    private String especificacionesPertenencias;
    private String imagenPertenencias;
    private PertenenciasColor idPertenenciasColor;
    private PertenenciasMarca idPertenenciasMarca;
    private PertenenciasModelo idPertenenciasModelo;
    private PertenenciasTipo idPertenenciasTipo;
    private Ciudadano idCiudadano;
    private UbicacionP idUbicacionP;
    private Ayuda idAyuda;

    public int getIdPertenencias() {
        return idPertenencias;
    }

    public void setIdPertenencias(int idPertenencias) {
        this.idPertenencias = idPertenencias;
    }

    public String getNamePertenencias() {
        return namePertenencias;
    }

    public void setNamePertenencias(String namePertenencias) {
        this.namePertenencias = namePertenencias;
    }

    public LocalDate getAnioPertenencias() {
        return anioPertenencias;
    }

    public void setAnioPertenencias(LocalDate anioPertenencias) {
        this.anioPertenencias = anioPertenencias;
    }

    public String getEspecificacionesPertenencias() {
        return especificacionesPertenencias;
    }

    public void setEspecificacionesPertenencias(String especificacionesPertenencias) {
        this.especificacionesPertenencias = especificacionesPertenencias;
    }

    public String getImagenPertenencias() {
        return imagenPertenencias;
    }

    public void setImagenPertenencias(String imagenPertenencias) {
        this.imagenPertenencias = imagenPertenencias;
    }

    public PertenenciasColor getIdPertenenciasColor() {
        return idPertenenciasColor;
    }

    public void setIdPertenenciasColor(PertenenciasColor idPertenenciasColor) {
        this.idPertenenciasColor = idPertenenciasColor;
    }

    public PertenenciasMarca getIdPertenenciasMarca() {
        return idPertenenciasMarca;
    }

    public void setIdPertenenciasMarca(PertenenciasMarca idPertenenciasMarca) {
        this.idPertenenciasMarca = idPertenenciasMarca;
    }

    public PertenenciasModelo getIdPertenenciasModelo() {
        return idPertenenciasModelo;
    }

    public void setIdPertenenciasModelo(PertenenciasModelo idPertenenciasModelo) {
        this.idPertenenciasModelo = idPertenenciasModelo;
    }

    public PertenenciasTipo getIdPertenenciasTipo() {
        return idPertenenciasTipo;
    }

    public void setIdPertenenciasTipo(PertenenciasTipo idPertenenciasTipo) {
        this.idPertenenciasTipo = idPertenenciasTipo;
    }

    public Ciudadano getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(Ciudadano idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public UbicacionP getIdUbicacionP() {
        return idUbicacionP;
    }

    public void setIdUbicacionP(UbicacionP idUbicacionP) {
        this.idUbicacionP = idUbicacionP;
    }

    public Ayuda getIdAyuda() {
        return idAyuda;
    }

    public void setIdAyuda(Ayuda idAyuda) {
        this.idAyuda = idAyuda;
    }
}