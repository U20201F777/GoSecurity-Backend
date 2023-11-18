package upc.edu.pe.gosecurity.dtos;

import java.time.LocalDate;

public class NotixCiudadanoDTO {
    private String dniCiudadano;
    private int cantAtendido;
    private int cantNoAtendido;

    public String getDniCiudadano() {
        return dniCiudadano;
    }

    public void setDniCiudadano(String dniCiudadano) {
        this.dniCiudadano = dniCiudadano;
    }

    public int getCantNoAtendido() {
        return cantNoAtendido;
    }

    public void setCantNoAtendido(int cantNoAtendido) {
        this.cantNoAtendido = cantNoAtendido;
    }

    public int getCantAtendido() {
        return cantAtendido;
    }

    public void setCantAtendido(int cantAtendido) {
        this.cantAtendido = cantAtendido;
    }
}
