package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.Users;

public class CiudadanoDTO {
    private int idCiudadano;
    private String numeroCiudadano;
    private Users users;

    public int getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(int idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public String getNumeroCiudadano() {
        return numeroCiudadano;
    }

    public void setNumeroCiudadano(String numeroCiudadano) {
        this.numeroCiudadano = numeroCiudadano;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
