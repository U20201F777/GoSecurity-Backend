package upc.edu.pe.gosecurity.dtos;

public class DenunciasxCiudadanoDTO {
    private int idDenuncias;
    private int DNIciudadano;
    private int CantDenuncias;

    public int getIdDenuncias() {
        return idDenuncias;
    }

    public void setIdDenuncias(int idDenuncias) {
        this.idDenuncias = idDenuncias;
    }

    public int getDNIciudadano() {
        return DNIciudadano;
    }

    public void setDNIciudadano(int DNIciudadano) {
        this.DNIciudadano = DNIciudadano;
    }

    public int getCantDenuncias() {
        return CantDenuncias;
    }

    public void setCantDenuncias(int cantDenuncias) {
        CantDenuncias = cantDenuncias;
    }
}
