package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name="EstadoUbicacion")
public class EstadoUbicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstadoUbicacion;

    @Column(name = "Estado", nullable = false)
    private Boolean Estado;


    public EstadoUbicacion() {
    }

    public EstadoUbicacion(int idEstadoUbicacion, Boolean estado) {
        this.idEstadoUbicacion = idEstadoUbicacion;
        Estado = estado;
    }

    public int getIdEstadoUbicacion() {
        return idEstadoUbicacion;
    }

    public void setIdEstadoUbicacion(int idEstadoUbicacion) {
        this.idEstadoUbicacion = idEstadoUbicacion;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean estado) {
        Estado = estado;
    }
}
