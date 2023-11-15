package upc.edu.pe.gosecurity.dtos;

public class TipoCasoDTO {
    private int idTipoCaso;
    private String TipoCaso;
    private String Estado;
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

    public void setEstado(String estado_notificacion) {
        Estado = estado_notificacion;
    }
}
