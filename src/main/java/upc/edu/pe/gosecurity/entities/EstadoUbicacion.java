package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name="EstadoUbicacion")
public class EstadoUbicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstadoUbicacion;

    @Column(name = "estado", nullable = false)
    private Boolean estado;


    public EstadoUbicacion() {
    }

    public EstadoUbicacion(int idEstadoUbicacion, Boolean estado) {
        this.idEstadoUbicacion = idEstadoUbicacion;
        this.estado = estado;
    }

    public int getIdEstadoUbicacion() {
        return idEstadoUbicacion;
    }

    public void setIdEstadoUbicacion(int idEstadoUbicacion) {
        this.idEstadoUbicacion = idEstadoUbicacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
