package upc.edu.pe.gosecurity.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Denuncias")
public class Denuncias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDenuncias;
    @Column(name = "Nombre", length = 100, nullable = false)
    private String nameDenuncias;
    @Column(name = "Fecha_Hechos", nullable = false)
    private LocalDate FechaDenunciasHechos;
    @Column(name = "Fecha_Registro", nullable = false)
    private LocalDate FechaDenunciasRegistro;
    @Column(name = "Fecha_Emision", nullable = false)
    private LocalDate FechaDenunciasEmision;
    @ManyToOne
    @JoinColumn(name = "idDenunciasLugarHecho")
    private DenunciasLugarHecho idDenunciasLugarHecho;
    @ManyToOne
    @JoinColumn(name = "idDenunciasTipificacion")
    private DenunciasTipificacion idDenunciasTipificacion;
    @ManyToOne
    @JoinColumn(name = "idCiudadano")
    private Ciudadano idCiudadano;
    @ManyToOne
    @JoinColumn(name = "idComisaria")
    private Comisaria idComisaria;
    public Denuncias() {
    }

    public Denuncias(int idDenuncias, String nameDenuncias, LocalDate fechaDenunciasHechos, LocalDate fechaDenunciasRegistro, LocalDate fechaDenunciasEmision, DenunciasLugarHecho idDenunciasLugarHecho, DenunciasTipificacion idDenunciasTipificacion, Ciudadano idCiudadano, Comisaria idComisaria) {
        this.idDenuncias = idDenuncias;
        this.nameDenuncias = nameDenuncias;
        FechaDenunciasHechos = fechaDenunciasHechos;
        FechaDenunciasRegistro = fechaDenunciasRegistro;
        FechaDenunciasEmision = fechaDenunciasEmision;
        this.idDenunciasLugarHecho = idDenunciasLugarHecho;
        this.idDenunciasTipificacion = idDenunciasTipificacion;
        this.idCiudadano = idCiudadano;
        this.idComisaria = idComisaria;
    }

    public int getIdDenuncias() {
        return idDenuncias;
    }

    public void setIdDenuncias(int idDenuncias) {
        this.idDenuncias = idDenuncias;
    }

    public String getNameDenuncias() {
        return nameDenuncias;
    }

    public void setNameDenuncias(String nameDenuncias) {
        this.nameDenuncias = nameDenuncias;
    }

    public LocalDate getFechaDenunciasHechos() {
        return FechaDenunciasHechos;
    }

    public void setFechaDenunciasHechos(LocalDate fechaDenunciasHechos) {
        FechaDenunciasHechos = fechaDenunciasHechos;
    }

    public LocalDate getFechaDenunciasRegistro() {
        return FechaDenunciasRegistro;
    }

    public void setFechaDenunciasRegistro(LocalDate fechaDenunciasRegistro) {
        FechaDenunciasRegistro = fechaDenunciasRegistro;
    }

    public LocalDate getFechaDenunciasEmision() {
        return FechaDenunciasEmision;
    }

    public void setFechaDenunciasEmision(LocalDate fechaDenunciasEmision) {
        FechaDenunciasEmision = fechaDenunciasEmision;
    }

    public DenunciasLugarHecho getIdDenunciasLugarHecho() {
        return idDenunciasLugarHecho;
    }

    public void setIdDenunciasLugarHecho(DenunciasLugarHecho idDenunciasLugarHecho) {
        this.idDenunciasLugarHecho = idDenunciasLugarHecho;
    }

    public DenunciasTipificacion getIdDenunciasTipificacion() {
        return idDenunciasTipificacion;
    }

    public void setIdDenunciasTipificacion(DenunciasTipificacion idDenunciasTipificacion) {
        this.idDenunciasTipificacion = idDenunciasTipificacion;
    }

    public Ciudadano getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(Ciudadano idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public Comisaria getIdComisaria() {
        return idComisaria;
    }

    public void setIdComisaria(Comisaria idComisaria) {
        this.idComisaria = idComisaria;
    }
}



