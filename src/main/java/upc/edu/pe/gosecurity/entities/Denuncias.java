package upc.edu.pe.gosecurity.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Denuncias")
public class Denuncias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDenuncias;
    @Column(name = "nameDenuncias", length = 100, nullable = false)
    private String nameDenuncias;
    @Column(name = "fechaDenunciasHechos", nullable = false)
    private LocalDate fechaDenunciasHechos;
    @Column(name = "fechaDenunciasRegistro", nullable = false)
    private LocalDate fechaDenunciasRegistro;
    @ManyToOne
    @JoinColumn(name = "idDenunciasLugarHecho")
    private DenunciasLugarHecho idDenunciasLugarHecho;
    @ManyToOne
    @JoinColumn(name = "idCiudadano")
    private Ciudadano idCiudadano;
    @ManyToOne
    @JoinColumn(name = "idComisaria")
    private Comisaria idComisaria;
    public Denuncias() {
    }

    public Denuncias(int idDenuncias, String nameDenuncias, LocalDate fechaDenunciasHechos, LocalDate fechaDenunciasRegistro, DenunciasLugarHecho idDenunciasLugarHecho, Ciudadano idCiudadano, Comisaria idComisaria) {
        this.idDenuncias = idDenuncias;
        this.nameDenuncias = nameDenuncias;
        this.fechaDenunciasHechos = fechaDenunciasHechos;
        this.fechaDenunciasRegistro = fechaDenunciasRegistro;
        this.idDenunciasLugarHecho = idDenunciasLugarHecho;
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
        return fechaDenunciasHechos;
    }

    public void setFechaDenunciasHechos(LocalDate fechaDenunciasHechos) {
        this.fechaDenunciasHechos = fechaDenunciasHechos;
    }

    public LocalDate getFechaDenunciasRegistro() {
        return fechaDenunciasRegistro;
    }

    public void setFechaDenunciasRegistro(LocalDate fechaDenunciasRegistro) {
        this.fechaDenunciasRegistro = fechaDenunciasRegistro;
    }

    public DenunciasLugarHecho getIdDenunciasLugarHecho() {
        return idDenunciasLugarHecho;
    }

    public void setIdDenunciasLugarHecho(DenunciasLugarHecho idDenunciasLugarHecho) {
        this.idDenunciasLugarHecho = idDenunciasLugarHecho;
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