package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.UbicacionC;

public class ComisariaDTO {

    private int idComisaria;

    private String nombre_c;

    private String telefono;

    private String direccion;

    private UbicacionC idUbicacionC;

    public int getIdComisaria() {
        return idComisaria;
    }

    public void setIdComisaria(int idComisaria) {
        this.idComisaria = idComisaria;
    }

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public UbicacionC getIdUbicacionC() {
        return idUbicacionC;
    }

    public void setIdUbicacionC(UbicacionC idUbicacionC) {
        this.idUbicacionC = idUbicacionC;
    }
}
