package upc.edu.pe.gosecurity.dtos;

public class DCPxDTO {
    private int id_comisaria;

    private String nombre_c;

    private int Cant_policia;

    private int Cant_denuncias;


    public int getId_comisaria() {
        return id_comisaria;
    }

    public void setId_comisaria(int id_comisaria) {
        this.id_comisaria = id_comisaria;
    }

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public int getCant_policia() {
        return Cant_policia;
    }

    public void setCant_policia(int cant_policia) {
        Cant_policia = cant_policia;
    }

    public int getCant_denuncias() {
        return Cant_denuncias;
    }

    public void setCant_denuncias(int cant_denuncias) {
        Cant_denuncias = cant_denuncias;
    }
}
