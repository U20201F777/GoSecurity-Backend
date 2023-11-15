package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;
@Entity
@Table(name = "DenunciasTipificacion")
public class DenunciasTipificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDenunciasTipificacion;
    @Column(name = "nameDenunciasTipificacion",length = 100,nullable=false)
    private String nameDenunciasTipificacion;
    @Column(name = "tipoDenuncia", length = 100, nullable = false)
    private String tipoDenuncia;
    @Column(name = "modalidadDenuncia", length = 100, nullable = false)
    private String modalidadDenuncia;
    @Column(name = "subtipoDenuncia", length = 100, nullable = false)
    private String subtipoDenuncia;

    public DenunciasTipificacion() {
    }

    public DenunciasTipificacion(int idDenunciasTipificacion, String nameDenunciasTipificacion, String tipoDenuncia, String modalidadDenuncia, String subtipoDenuncia) {
        this.idDenunciasTipificacion = idDenunciasTipificacion;
        this.nameDenunciasTipificacion = nameDenunciasTipificacion;
        this.tipoDenuncia = tipoDenuncia;
        this.modalidadDenuncia = modalidadDenuncia;
        this.subtipoDenuncia = subtipoDenuncia;
    }

    public int getIdDenunciasTipificacion() {
        return idDenunciasTipificacion;
    }

    public void setIdDenunciasTipificacion(int idDenunciasTipificacion) {
        this.idDenunciasTipificacion = idDenunciasTipificacion;
    }

    public String getNameDenunciasTipificacion() {
        return nameDenunciasTipificacion;
    }

    public void setNameDenunciasTipificacion(String nameDenunciasTipificacion) {
        this.nameDenunciasTipificacion = nameDenunciasTipificacion;
    }

    public String getTipoDenuncia() {
        return tipoDenuncia;
    }

    public void setTipoDenuncia(String tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public String getModalidadDenuncia() {
        return modalidadDenuncia;
    }

    public void setModalidadDenuncia(String modalidadDenuncia) {
        this.modalidadDenuncia = modalidadDenuncia;
    }

    public String getSubtipoDenuncia() {
        return subtipoDenuncia;
    }

    public void setSubtipoDenuncia(String subtipoDenuncia) {
        this.subtipoDenuncia = subtipoDenuncia;
    }
}
