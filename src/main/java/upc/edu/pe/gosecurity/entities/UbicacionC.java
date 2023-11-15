package upc.edu.pe.gosecurity.entities;


import javax.persistence.*;

@Entity
@Table(name = "UbicacionC")
public class UbicacionC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbicacionC;
    @Column(name = "departamento",length = 150, nullable = false)
    private String departamento;
    @Column(name = "ciudad", length = 150, nullable = false)
    private String ciudad;
    @Column(name = "distrito", length = 150, nullable = false)
    private String distrito;
    @Column(name = "direccion", length = 150, nullable = false)
    private String direccion;


    public UbicacionC() {
    }

    public UbicacionC(int idUbicacionC, String departamento, String ciudad, String distrito, String direccion) {
        this.idUbicacionC = idUbicacionC;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.distrito = distrito;
        this.direccion = direccion;
    }

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
