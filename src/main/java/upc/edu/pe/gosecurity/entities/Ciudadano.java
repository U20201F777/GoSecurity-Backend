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
    private Usuario usuario;

    public Ciudadano() {
    }

    public Ciudadano(int idCiudadano, String numeroCiudadano, Usuario usuario) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
