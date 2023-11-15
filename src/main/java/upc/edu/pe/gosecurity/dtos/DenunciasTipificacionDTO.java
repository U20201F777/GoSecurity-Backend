package upc.edu.pe.gosecurity.dtos;

public class DenunciasTipificacionDTO {
    private int idDenunciasTipificacion;
    private String nameDenunciasTipificacion;
    private String Tipo_tDenuncia;
    private String ModalidadDenuncia;
    private String SubtipoDenuncia;

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
