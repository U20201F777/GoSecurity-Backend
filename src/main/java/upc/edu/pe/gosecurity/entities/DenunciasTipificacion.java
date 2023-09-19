package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;
@Entity
@Table(name = "DenunciasTipificacion")
public class DenunciasTipificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDenunciasTipificacion;
    @Column(name = "tipificacion",length = 100,nullable=false)
    private String nameDenunciasTipificacion;
    @Column(name = "Tipo_t", length = 100, nullable = false)
    private String Tipo_tDenuncia;
    @Column(name = "Modalidad", length = 100, nullable = false)
    private String ModalidadDenuncia;
    @Column(name = "Subtipo", length = 100, nullable = false)
    private String SubtipoDenuncia;

    public DenunciasTipificacion() {
    }

    public DenunciasTipificacion(int idDenunciasTipificacion, String nameDenunciasTipificacion, String tipo_tDenuncia, String modalidadDenuncia, String subtipoDenuncia) {
        this.idDenunciasTipificacion = idDenunciasTipificacion;
        this.nameDenunciasTipificacion = nameDenunciasTipificacion;
        Tipo_tDenuncia = tipo_tDenuncia;
        ModalidadDenuncia = modalidadDenuncia;
        SubtipoDenuncia = subtipoDenuncia;
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

    public String getTipo_tDenuncia() {
        return Tipo_tDenuncia;
    }

    public void setTipo_tDenuncia(String tipo_tDenuncia) {
        Tipo_tDenuncia = tipo_tDenuncia;
    }

    public String getModalidadDenuncia() {
        return ModalidadDenuncia;
    }

    public void setModalidadDenuncia(String modalidadDenuncia) {
        ModalidadDenuncia = modalidadDenuncia;
    }

    public String getSubtipoDenuncia() {
        return SubtipoDenuncia;
    }

    public void setSubtipoDenuncia(String subtipoDenuncia) {
        SubtipoDenuncia = subtipoDenuncia;
    }
}
