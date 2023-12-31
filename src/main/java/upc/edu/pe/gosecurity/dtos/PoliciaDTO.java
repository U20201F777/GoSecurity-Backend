package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.Comisaria;
import upc.edu.pe.gosecurity.entities.Users;

public class PoliciaDTO {
    private int idPolicia;
    private String numeroPlacaPolicia;
    private String fotoRostroPolicia;
    private String fotoIdentPolicia;
    private String rangoPolicia;
    private Comisaria idComisaria;
    private Users users;

    public int getIdPolicia() {
        return idPolicia;
    }

    public void setIdPolicia(int idPolicia) {
        this.idPolicia = idPolicia;
    }

    public String getNumeroPlacaPolicia() {
        return numeroPlacaPolicia;
    }

    public void setNumeroPlacaPolicia(String numeroPlacaPolicia) {
        this.numeroPlacaPolicia = numeroPlacaPolicia;
    }

    public String getFotoRostroPolicia() {
        return fotoRostroPolicia;
    }

    public void setFotoRostroPolicia(String fotoRostroPolicia) {
        this.fotoRostroPolicia = fotoRostroPolicia;
    }

    public String getFotoIdentPolicia() {
        return fotoIdentPolicia;
    }

    public void setFotoIdentPolicia(String fotoIdentPolicia) {
        this.fotoIdentPolicia = fotoIdentPolicia;
    }

    public String getRangoPolicia() {
        return rangoPolicia;
    }

    public void setRangoPolicia(String rangoPolicia) {
        this.rangoPolicia = rangoPolicia;
    }

    public Comisaria getIdComisaria() {
        return idComisaria;
    }

    public void setIdComisaria(Comisaria idComisaria) {
        this.idComisaria = idComisaria;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
