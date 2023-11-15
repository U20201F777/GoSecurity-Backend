package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.UbicacionC;

public class ComisariaDTO {

    private int idComisaria;

    private String Nombre_c;

    private String Telefono;

    private String Direccion;

    private UbicacionC ubicacionC;

    public int getIdComisaria() {
        return idComisaria;
    }

    public void setIdComisaria(int idComisaria) {
        this.idComisaria = idComisaria;
    }

    public String getNombre_c() {
        return Nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        Nombre_c = nombre_c;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public UbicacionC getUbicacionC() {
        return ubicacionC;
    }

    public void setUbicacionC(UbicacionC ubicacionC) {
        this.ubicacionC = ubicacionC;
    }
}
