package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;

@Entity
@Table(name = "PertenenciasColor")
public class PertenenciasColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPertenenciasColor;
    @Column(name = "namePertenenciasColor",length = 100,nullable = false)
    private String namePertenenciasColor;

    public PertenenciasColor() {
    }

    public PertenenciasColor(int idPertenenciasColor, String namePertenenciasColor) {
        this.idPertenenciasColor = idPertenenciasColor;
        this.namePertenenciasColor = namePertenenciasColor;
    }

    public int getIdPertenenciasColor() {
        return idPertenenciasColor;
    }

    public void setIdPertenenciasColor(int idPertenenciasColor) {
        this.idPertenenciasColor = idPertenenciasColor;
    }

    public String getNamePertenenciasColor() {
        return namePertenenciasColor;
    }

    public void setNamePertenenciasColor(String namePertenenciasColor) {
        this.namePertenenciasColor = namePertenenciasColor;
    }
}

