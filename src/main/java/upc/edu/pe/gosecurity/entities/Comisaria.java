package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;


@Entity
@Table(name = "Comisaria")
public class Comisaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComisaria;
    @Column(name = "Nombre_c", length = 50, nullable = false)
    private String Nombre_c;
    @Column(name = "teleono", length = 15, nullable = false)
    private String Telefono;
    @Column(name = "Direccion", length = 50, nullable = false)
    private String Direccion;
    @ManyToOne
    @JoinColumn(name = "idUbicacionC")
    private UbicacionC UbicacionC;

    public Comisaria() {
    }

    public Comisaria(int idComisaria, String nombre_c, String telefono, String direccion, UbicacionC idUbicacionC) {
        this.idComisaria = idComisaria;
        Nombre_c = nombre_c;
        Telefono = telefono;
        Direccion = direccion;
        this.UbicacionC = idUbicacionC;
    }

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
        return UbicacionC;
    }

    public void setUbicacionC(UbicacionC idUbicacionC) {
        this.UbicacionC = idUbicacionC;
    }
}