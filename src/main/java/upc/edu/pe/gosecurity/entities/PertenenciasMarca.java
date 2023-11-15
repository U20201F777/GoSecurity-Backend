package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "PertenenciasMarca")
public class PertenenciasMarca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPertenenciasMarca;
    @Column(name = "namePertenenciasMarca",length = 100,nullable = false)
    private String namePertenenciasMarca;

    public PertenenciasMarca() {
    }

    public PertenenciasMarca(int idPertenenciasMarca, String namePertenenciasMarca) {
        this.idPertenenciasMarca = idPertenenciasMarca;
        this.namePertenenciasMarca = namePertenenciasMarca;
    }

    public int getIdPertenenciasMarca() {
        return idPertenenciasMarca;
    }

    public void setIdPertenenciasMarca(int idPertenenciasMarca) {
        this.idPertenenciasMarca = idPertenenciasMarca;
    }

    public String getNamePertenenciasMarca() {
        return namePertenenciasMarca;
    }

    public void setNamePertenenciasMarca(String namePertenenciasMarca) {
        this.namePertenenciasMarca = namePertenenciasMarca;
    }
}

