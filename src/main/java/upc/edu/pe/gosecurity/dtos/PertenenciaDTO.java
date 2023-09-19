package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.PertenenciasColor;
import upc.edu.pe.gosecurity.entities.PertenenciasMarca;
import upc.edu.pe.gosecurity.entities.PertenenciasModelo;
import upc.edu.pe.gosecurity.entities.PertenenciasTipo;

import java.time.LocalDate;

public class PertenenciaDTO {
    private int idPertenencias;
    private String namePertenencias;
    private LocalDate AnioPertenencias;
    private String EspecificacionesPertenencias;
    private String ImagenPertenencias;
    private String CodigoPertenencias;
    private int SeriePertenencias;
    private PertenenciasColor pertenenciasColor;
    private PertenenciasMarca pertenenciasMarca;
    private PertenenciasModelo pertenenciasModelo;
    private PertenenciasTipo pertenenciasTipo;


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
        return AnioPertenencias;
    }

    public void setAnioPertenencias(LocalDate anioPertenencias) {
        AnioPertenencias = anioPertenencias;
    }

    public String getEspecificacionesPertenencias() {
        return EspecificacionesPertenencias;
    }

    public void setEspecificacionesPertenencias(String especificacionesPertenencias) {
        EspecificacionesPertenencias = especificacionesPertenencias;
    }

    public String getImagenPertenencias() {
        return ImagenPertenencias;
    }

    public void setImagenPertenencias(String imagenPertenencias) {
        ImagenPertenencias = imagenPertenencias;
    }

    public String getCodigoPertenencias() {
        return CodigoPertenencias;
    }

    public void setCodigoPertenencias(String codigoPertenencias) {
        CodigoPertenencias = codigoPertenencias;
    }

    public int getSeriePertenencias() {
        return SeriePertenencias;
    }

    public void setSeriePertenencias(int seriePertenencias) {
        SeriePertenencias = seriePertenencias;
    }

    public PertenenciasColor getPertenenciasColor() {
        return pertenenciasColor;
    }

    public void setPertenenciasColor(PertenenciasColor pertenenciasColor) {
        this.pertenenciasColor = pertenenciasColor;
    }

    public PertenenciasMarca getPertenenciasMarca() {
        return pertenenciasMarca;
    }

    public void setPertenenciasMarca(PertenenciasMarca pertenenciasMarca) {
        this.pertenenciasMarca = pertenenciasMarca;
    }

    public PertenenciasModelo getPertenenciasModelo() {
        return pertenenciasModelo;
    }

    public void setPertenenciasModelo(PertenenciasModelo pertenenciasModelo) {
        this.pertenenciasModelo = pertenenciasModelo;
    }

    public PertenenciasTipo getPertenenciasTipo() {
        return pertenenciasTipo;
    }

    public void setPertenenciasTipo(PertenenciasTipo pertenenciasTipo) {
        this.pertenenciasTipo = pertenenciasTipo;
    }
}

