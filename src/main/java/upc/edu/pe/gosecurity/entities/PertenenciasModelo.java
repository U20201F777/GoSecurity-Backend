package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "PertenenciaModelo")
public class PertenenciasModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPertenenciasModelo;
    @Column (name = "namePertenenciasModelo",length = 100,nullable = false)
    private String namePertenenciasModelo;

    public PertenenciasModelo() {
    }

    public PertenenciasModelo(int idPertenenciasModelo, String namePertenenciasModelo) {
        this.idPertenenciasModelo = idPertenenciasModelo;
        this.namePertenenciasModelo = namePertenenciasModelo;
    }

    public int getIdPertenenciasModelo() {
        return idPertenenciasModelo;
    }

    public void setIdPertenenciasModelo(int idPertenenciasModelo) {
        this.idPertenenciasModelo = idPertenenciasModelo;
    }

    public String getNamePertenenciasModelo() {
        return namePertenenciasModelo;
    }

    public void setNamePertenenciasModelo(String namePertenenciasModelo) {
        this.namePertenenciasModelo = namePertenenciasModelo;
    }
}

