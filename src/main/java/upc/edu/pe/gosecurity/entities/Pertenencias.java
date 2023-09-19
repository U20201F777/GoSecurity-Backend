package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Pertenencias")
public class Pertenencias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPertenencias;
    @Column(name = "Nombre_P",length = 100,nullable = false)
    private String namePertenencias;
    @Column(name = "Ano_antiguedad",nullable = false)
    private LocalDate AnioPertenencias;
    @Column(name = "Especificaciones_ad",length = 100,nullable = false)
    private String EspecificacionesPertenencias;
    @Column(name = "Imagen_P",length = 100,nullable = false)
    private String ImagenPertenencias;
    @Column(name = "Codigo_P",length = 100,nullable = false)
    private String CodigoPertenencias;
    @Column(name = "Serie",nullable = false)
    private int SeriePertenencias;
    @ManyToOne
    @JoinColumn(name="idPertenenciasColor")
    private PertenenciasColor pertenenciasColor;
    @ManyToOne
    @JoinColumn(name="idPertenenciasMarca")
    private PertenenciasMarca pertenenciasMarca;
    @ManyToOne
    @JoinColumn(name="idPertenenciasModelo")
    private PertenenciasModelo pertenenciasModelo;
    @ManyToOne
    @JoinColumn(name="idPerteneneciasTipo")
    private PertenenciasTipo pertenenciasTipo;
    @ManyToOne
    @JoinColumn(name = "idCiudadano")
    private Ciudadano idCiudadano;
    public Pertenencias() {
    }

    public Pertenencias(int idPertenencias, String namePertenencias, LocalDate anioPertenencias, String especificacionesPertenencias, String imagenPertenencias, String codigoPertenencias, int seriePertenencias, PertenenciasColor pertenenciasColor, PertenenciasMarca pertenenciasMarca, PertenenciasModelo pertenenciasModelo, PertenenciasTipo pertenenciasTipo, Ciudadano idCiudadano) {
        this.idPertenencias = idPertenencias;
        this.namePertenencias = namePertenencias;
        AnioPertenencias = anioPertenencias;
        EspecificacionesPertenencias = especificacionesPertenencias;
        ImagenPertenencias = imagenPertenencias;
        CodigoPertenencias = codigoPertenencias;
        SeriePertenencias = seriePertenencias;
        this.pertenenciasColor = pertenenciasColor;
        this.pertenenciasMarca = pertenenciasMarca;
        this.pertenenciasModelo = pertenenciasModelo;
        this.pertenenciasTipo = pertenenciasTipo;
        this.idCiudadano = idCiudadano;
    }

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

    public Ciudadano getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(Ciudadano idCiudadano) {
        this.idCiudadano = idCiudadano;
    }
}

