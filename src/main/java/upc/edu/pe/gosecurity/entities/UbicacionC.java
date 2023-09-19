package upc.edu.pe.gosecurity.entities;


import javax.persistence.*;

@Entity
@Table(name = "UbicacionC")
public class UbicacionC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbicacionC;
    @Column(name = "Departamento",length = 150, nullable = false)
    private String Departamento;
    @Column(name = "Ciudad", length = 150, nullable = false)
    private String Ciudad;
    @Column(name = "Distrito", length = 150, nullable = false)
    private String Distrito;
    @Column(name = "Direccion", length = 150, nullable = false)
    private String Direccion;


    public UbicacionC() {
    }


    public UbicacionC(int idUbicacionC, String departamento, String ciudad, String distrito, String direccion) {
        this.idUbicacionC = idUbicacionC;
        Departamento = departamento;
        Ciudad = ciudad;
        Distrito = distrito;
        Direccion = direccion;
    }

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
