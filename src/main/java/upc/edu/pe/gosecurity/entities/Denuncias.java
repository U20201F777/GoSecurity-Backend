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

    public Denuncias() {
    }

    public Denuncias(int idDenuncias, String nameDenuncias, LocalDate fechaDenunciasHechos, LocalDate fechaDenunciasRegistro, LocalDate fechaDenunciasEmision) {
        this.idDenuncias = idDenuncias;
        this.nameDenuncias = nameDenuncias;
        FechaDenunciasHechos = fechaDenunciasHechos;
        FechaDenunciasRegistro = fechaDenunciasRegistro;
        FechaDenunciasEmision = fechaDenunciasEmision;
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
}



