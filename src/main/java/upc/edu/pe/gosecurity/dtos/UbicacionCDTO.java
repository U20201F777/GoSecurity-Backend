package upc.edu.pe.gosecurity.dtos;

public class UbicacionCDTO {

    private int idUbicacionC;

    private String Departamento;

    private String Ciudad;

    private String Distrito;

    private String Direccion;

    public int getIdUbicacionC() {
        return idUbicacionC;
    }

    public void setIdUbicacionC(int idUbicacionC) {
        this.idUbicacionC = idUbicacionC;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String distrito) {
        Distrito = distrito;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
