package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipoCaso")
public class TipoCaso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoCaso;
    @Column(name = "TipoCaso", length = 50, nullable = false)
    private String TipoCaso;
    @Column(name = "Estado", length = 25, nullable = false)
    private String Estado;
    public TipoCaso() {
    }

    public TipoCaso(int idTipoCaso, String tipoCaso, String estado) {

        this.idTipoCaso = idTipoCaso;
        TipoCaso = tipoCaso;
        Estado = estado;
    }

    public int getIdTipoCaso() {
        return idTipoCaso;
    }

    public void setIdTipoCaso(int idTipoCaso) {
        this.idTipoCaso = idTipoCaso;
    }

    public String getTipoCaso() {
        return TipoCaso;
    }

    public void setTipoCaso(String tipoCaso) {
        TipoCaso = tipoCaso;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}