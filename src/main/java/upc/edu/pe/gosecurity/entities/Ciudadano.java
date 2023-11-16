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
    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Users users;

    public Ciudadano() {
    }

    public Ciudadano(int idCiudadano, String numeroCiudadano, Users users) {
        this.idCiudadano = idCiudadano;
        this.numeroCiudadano = numeroCiudadano;
        this.users = users;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
