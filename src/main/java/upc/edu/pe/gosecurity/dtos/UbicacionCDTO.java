package upc.edu.pe.gosecurity.dtos;

public class UbicacionCDTO {

    private int idUbicacionC;

    private String departamento;

    private String ciudad;

    private String distrito;

    private String direccion;

    public int getIdUbicacionC() {
        return idUbicacionC;
    }

    public void setIdUbicacionC(int idUbicacionC) {
        this.idUbicacionC = idUbicacionC;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
