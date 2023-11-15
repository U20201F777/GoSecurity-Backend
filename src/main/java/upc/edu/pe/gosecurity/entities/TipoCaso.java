package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipoCaso")
public class TipoCaso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoCaso;
    @Column(name = "tipoCaso", length = 50, nullable = false)
    private String tipoCaso;
    @Column(name = "estado", length = 25, nullable = false)
    private String estado;
    public TipoCaso() {
    }

    public TipoCaso(int idTipoCaso, String tipoCaso, String estado) {
        this.idTipoCaso = idTipoCaso;
        this.tipoCaso = tipoCaso;
        this.estado = estado;
    }

    public int getIdTipoCaso() {
        return idTipoCaso;
    }

    public void setIdTipoCaso(int idTipoCaso) {
        this.idTipoCaso = idTipoCaso;
    }

    public String getTipoCaso() {
        return tipoCaso;
    }

    public void setTipoCaso(String tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}