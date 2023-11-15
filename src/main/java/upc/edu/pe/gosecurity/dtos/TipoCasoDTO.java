package upc.edu.pe.gosecurity.dtos;

public class TipoCasoDTO {
    private int idTipoCaso;
    private String tipoCaso;
    private String estado;
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
