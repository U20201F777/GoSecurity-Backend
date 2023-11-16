package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "Policia")
public class Policia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPolicia;
    @Column(name = "numeroPlacaPolicia", length = 15, nullable = false)
    private String numeroPlacaPolicia;
    @Column(name = "fotoRostroPolicia", length = 100, nullable = false)
    private String fotoRostroPolicia;
    @Column(name ="fotoIdentPolicia", length = 100,nullable = false)
    private String fotoIdentPolicia;
    @Column(name = "rangoPolicia", length = 50, nullable = false)
    private String rangoPolicia;
    @ManyToOne
    @JoinColumn(name = "idComisaria")
    private Comisaria idComisaria;
    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Users users;
    public Policia() {
    }

    public Policia(int idPolicia, String numeroPlacaPolicia, String fotoRostroPolicia, String fotoIdentPolicia, String rangoPolicia, Comisaria idComisaria, Users users) {
        this.idPolicia = idPolicia;
        this.numeroPlacaPolicia = numeroPlacaPolicia;
        this.fotoRostroPolicia = fotoRostroPolicia;
        this.fotoIdentPolicia = fotoIdentPolicia;
        this.rangoPolicia = rangoPolicia;
        this.idComisaria = idComisaria;
        this.users = users;
    }

    public int getIdPolicia() {
        return idPolicia;
    }

    public void setIdPolicia(int idPolicia) {
        this.idPolicia = idPolicia;
    }

    public String getNumeroPlacaPolicia() {
        return numeroPlacaPolicia;
    }

    public void setNumeroPlacaPolicia(String numeroPlacaPolicia) {
        this.numeroPlacaPolicia = numeroPlacaPolicia;
    }

    public String getFotoRostroPolicia() {
        return fotoRostroPolicia;
    }

    public void setFotoRostroPolicia(String fotoRostroPolicia) {
        this.fotoRostroPolicia = fotoRostroPolicia;
    }

    public String getFotoIdentPolicia() {
        return fotoIdentPolicia;
    }

    public void setFotoIdentPolicia(String fotoIdentPolicia) {
        this.fotoIdentPolicia = fotoIdentPolicia;
    }

    public String getRangoPolicia() {
        return rangoPolicia;
    }

    public void setRangoPolicia(String rangoPolicia) {
        this.rangoPolicia = rangoPolicia;
    }

    public Comisaria getIdComisaria() {
        return idComisaria;
    }

    public void setIdComisaria(Comisaria idComisaria) {
        this.idComisaria = idComisaria;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
