package upc.edu.pe.gosecurity.dtos;

public class DenunciasTipificacionDTO {
    private int idDenunciasTipificacion;
    private String nameDenunciasTipificacion;
    private String tipoDenuncia;
    private String modalidadDenuncia;
    private String subtipoDenuncia;

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
