package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "SolicitarAyuda")
public class Ayuda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAyuda;
    @Column(name = "fechaAyuda", nullable = false)
    private LocalDate fechaAyuda;
    @ManyToOne
    @JoinColumn(name = "idTipoCaso")
    private TipoCaso idTipoCaso;

    public Ayuda() {
    }

    public Ayuda(int idAyuda, LocalDate fechaAyuda, TipoCaso idTipoCaso) {
        this.idAyuda = idAyuda;
        this.fechaAyuda = fechaAyuda;
        this.idTipoCaso = idTipoCaso;
    }

    public int getIdAyuda() {
        return idAyuda;
    }

    public void setIdAyuda(int idAyuda) {
        this.idAyuda = idAyuda;
    }

    public LocalDate getFechaAyuda() {
        return fechaAyuda;
    }

    public void setFechaAyuda(LocalDate fechaAyuda) {
        this.fechaAyuda = fechaAyuda;
    }

    public TipoCaso getIdTipoCaso() {
        return idTipoCaso;
    }

    public void setIdTipoCaso(TipoCaso idTipoCaso) {
        this.idTipoCaso = idTipoCaso;
    }
}
