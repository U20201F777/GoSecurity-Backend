package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombreUsuario", length = 100,nullable =false, unique = true)
    private String nombreUsuario;
    @Column(name = "apellidoUsuario", length = 100,nullable = false)
    private String apellidoUsuario;
    @Column(name ="fechaNacimientoUsuario", nullable = false)
    private LocalDate fechaNacimientoUsuario;
    @Column(name = "correoUsuario", length = 100, nullable = false)
    private String correoUsuario;
    @Column(name = "contrasenaUsuario", length = 30, nullable = false)
    private String contrasenaUsuario;
    @Column(name = "generoUsuario", nullable = false)
    private char generoUsuario;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Usuario")
    private List<Role> roles;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, LocalDate fechaNacimientoUsuario, String correoUsuario, String contrasenaUsuario, char generoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.correoUsuario = correoUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.generoUsuario = generoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public LocalDate getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(LocalDate fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public char getGeneroUsuario() {
        return generoUsuario;
    }

    public void setGeneroUsuario(char generoUsuario) {
        this.generoUsuario = generoUsuario;
    }
}
