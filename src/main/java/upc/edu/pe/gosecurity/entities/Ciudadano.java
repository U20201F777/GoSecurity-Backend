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
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Users usuario;

    public Ciudadano() {
    }

    public Ciudadano(int idCiudadano, String numeroCiudadano, Users usuario) {
        this.idCiudadano = idCiudadano;
        this.numeroCiudadano = numeroCiudadano;
        this.usuario = usuario;
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

    public Users getUsuario() {
        return usuario;
    }

    public void setUsuario(Users usuario) {
        this.usuario = usuario;
    }
}
