package upc.edu.pe.gosecurity.entities;


import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "UbicacionP")
public class UbicacionP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbicacionP;
    @Column(name = "latitud", length = 50, nullable = false)
    private int latitud;
    @Column(name = "logitud", length = 50, nullable = false)
    private int longitud;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "idEstadoUbicacion")
    private EstadoUbicacion idEstadoUbicacion;

    public UbicacionP() {
    }

    public UbicacionP(int idUbicacionP, int latitud, int longitud, LocalDate fecha, EstadoUbicacion idEstadoUbicacion) {
        this.idUbicacionP = idUbicacionP;
        this.latitud = latitud;
        this.longitud = longitud;
        this.fecha = fecha;
        this.idEstadoUbicacion = idEstadoUbicacion;
    }

    public int getIdUbicacionP() {
        return idUbicacionP;
    }

    public void setIdUbicacionP(int idUbicacionP) {
        this.idUbicacionP = idUbicacionP;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public EstadoUbicacion getIdEstadoUbicacion() {
        return idEstadoUbicacion;
    }

    public void setIdEstadoUbicacion(EstadoUbicacion idEstadoUbicacion) {
        this.idEstadoUbicacion = idEstadoUbicacion;
    }
}
