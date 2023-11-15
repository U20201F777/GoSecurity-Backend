package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "Ciudadano")
public class Ciudadano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCiudadano;
    @Column(name = "numeroCiudadano", length = 9,nullable = false)
    private String numeroCiudadano;

    public Ciudadano() {
    }

    public Ciudadano(int idCiudadano, String numeroCiudadano) {
        this.idCiudadano = idCiudadano;
        this.numeroCiudadano = numeroCiudadano;
    }

    public int getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(int idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public String getNumeroCiudadano() {
        return numeroCiudadano;
    }

    public void setNumeroCiudadano(String numeroCiudadano) {
        this.numeroCiudadano = numeroCiudadano;
    }
}
