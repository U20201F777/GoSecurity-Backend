package upc.edu.pe.gosecurity.entities;


import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "UbicacionP")
public class UbicacionP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbicacionP;
    @Column(name = "Latitud", length = 50, nullable = false)
    private int Latitud;
    @Column(name = "Logitud", length = 50, nullable = false)
    private int Longitud;
    @Column(name = "Fecha", nullable = false)
    private LocalDate Fecha;
    @ManyToOne
    @JoinColumn(name = "idEstadoUbicacion")
    private EstadoUbicacion estadoUbicacion;


    public UbicacionP() {
    }

    public UbicacionP(int idUbicacionP, int latitud, int longitud, LocalDate fecha, EstadoUbicacion estadoUbicacion) {
        this.idUbicacionP = idUbicacionP;
        Latitud = latitud;
        Longitud = longitud;
        Fecha = fecha;
        this.estadoUbicacion = estadoUbicacion;
    }

    public int getIdUbicacionP() {
        return idUbicacionP;
    }

    public void setIdUbicacionP(int idUbicacionP) {
        this.idUbicacionP = idUbicacionP;
    }

    public int getLatitud() {
        return Latitud;
    }

    public void setLatitud(int latitud) {
        Latitud = latitud;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int longitud) {
        Longitud = longitud;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public EstadoUbicacion getEstadoUbicacion() {
        return estadoUbicacion;
    }

    public void setEstadoUbicacion(EstadoUbicacion estadoUbicacion) {
        this.estadoUbicacion = estadoUbicacion;
    }
}
