package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;


@Entity
@Table(name = "Comisaria")
public class Comisaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComisaria;
    @Column(name = "nombre_c", length = 50, nullable = false)
    private String nombre_c;
    @Column(name = "telefono", length = 15, nullable = false)
    private String telefono;
    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "idUbicacionC")
    private UbicacionC idUbicacionC;

    public Comisaria() {
    }

    public Comisaria(int idComisaria, String nombre_c, String telefono, String direccion, UbicacionC idUbicacionC) {
        this.idComisaria = idComisaria;
        this.nombre_c = nombre_c;
        this.telefono = telefono;
        this.direccion = direccion;
        this.idUbicacionC = idUbicacionC;
    }

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