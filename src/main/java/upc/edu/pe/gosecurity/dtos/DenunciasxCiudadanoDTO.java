package upc.edu.pe.gosecurity.dtos;

public class DenunciasxCiudadanoDTO {
    private int idDenuncias;
    private int dniCiudadano;
    private int cantDenuncias;

    public int getIdDenuncias() {
        return idDenuncias;
    }

    public void setIdDenuncias(int idDenuncias) {
        this.idDenuncias = idDenuncias;
    }

    public int getDniCiudadano() {
        return dniCiudadano;
    }

    public void setDniCiudadano(int dniCiudadano) {
        this.dniCiudadano = dniCiudadano;
    }

    public int getCantDenuncias() {
        return cantDenuncias;
    }

    public void setCantDenuncias(int cantDenuncias) {
        this.cantDenuncias = cantDenuncias;
    }
}
