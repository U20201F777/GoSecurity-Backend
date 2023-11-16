package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Pertenencias")
public class Pertenencias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPertenencias;
    @Column(name = "namePertenencias",length = 100,nullable = false)
    private String namePertenencias;
    @Column(name = "anioPertenencias",nullable = false)
    private LocalDate anioPertenencias;
    @Column(name = "especificacionesPertenencias",length = 100,nullable = false)
    private String especificacionesPertenencias;
    @Column(name = "imagenPertenencias",length = 100,nullable = false)
    private String imagenPertenencias;
    @ManyToOne
    @JoinColumn(name="idPertenenciasColor")
    private PertenenciasColor idPertenenciasColor;
    @ManyToOne
    @JoinColumn(name="idPertenenciasMarca")
    private PertenenciasMarca idPertenenciasMarca;
    @ManyToOne
    @JoinColumn(name="idPertenenciasModelo")
    private PertenenciasModelo idPertenenciasModelo;
    @ManyToOne
    @JoinColumn(name="idPerteneneciasTipo")
    private PertenenciasTipo idPertenenciasTipo;
    @ManyToOne
    @JoinColumn(name = "idCiudadano")
    private Ciudadano idCiudadano;
    @ManyToOne
    @JoinColumn(name = "idUbicacionP")
    private UbicacionP idUbicacionP;
    @ManyToOne
    @JoinColumn(name = "idAyuda")
    private Ayuda idAyuda;
    public Pertenencias() {
    }

    public Pertenencias(int idPertenencias, String namePertenencias, LocalDate anioPertenencias, String especificacionesPertenencias, String imagenPertenencias, PertenenciasColor idPertenenciasColor, PertenenciasMarca idPertenenciasMarca, PertenenciasModelo idPertenenciasModelo, PertenenciasTipo idPertenenciasTipo, Ciudadano idCiudadano, UbicacionP idUbicacionP, Ayuda idAyuda) {
        this.idPertenencias = idPertenencias;
        this.namePertenencias = namePertenencias;
        this.anioPertenencias = anioPertenencias;
        this.especificacionesPertenencias = especificacionesPertenencias;
        this.imagenPertenencias = imagenPertenencias;
        this.idPertenenciasColor = idPertenenciasColor;
        this.idPertenenciasMarca = idPertenenciasMarca;
        this.idPertenenciasModelo = idPertenenciasModelo;
        this.idPertenenciasTipo = idPertenenciasTipo;
        this.idCiudadano = idCiudadano;
        this.idUbicacionP = idUbicacionP;
        this.idAyuda = idAyuda;
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

