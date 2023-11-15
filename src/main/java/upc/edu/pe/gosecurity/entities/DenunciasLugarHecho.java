package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;
@Entity
@Table(name = "DenunciasLugarHecho")
public class DenunciasLugarHecho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDenunciasLugarHecho;
    @Column(name = "nameDenunciasLugarHecho",length = 100,nullable=false)
    private String nameDenunciasLugarHecho;
    @Column(name = "distritoDenuncia", length = 100, nullable = false)
    private String distritoDenuncia;
    @Column(name = "provinciaDenuncia", length = 100, nullable = false)
    private String provinciaDenuncia;
    @Column(name = "lugarDenuncia", length = 100, nullable = false)
    private String lugarDenuncia;

    public DenunciasLugarHecho() {
    }

    public DenunciasLugarHecho(int idDenunciasLugarHecho, String nameDenunciasLugarHecho, String distritoDenuncia, String provinciaDenuncia, String lugarDenuncia) {
        this.idDenunciasLugarHecho = idDenunciasLugarHecho;
        this.nameDenunciasLugarHecho = nameDenunciasLugarHecho;
        this.distritoDenuncia = distritoDenuncia;
        this.provinciaDenuncia = provinciaDenuncia;
        this.lugarDenuncia = lugarDenuncia;
    }

    public int getIdDenunciasLugarHecho() {
        return idDenunciasLugarHecho;
    }

    public void setIdDenunciasLugarHecho(int idDenunciasLugarHecho) {
        this.idDenunciasLugarHecho = idDenunciasLugarHecho;
    }

    public String getNameDenunciasLugarHecho() {
        return nameDenunciasLugarHecho;
    }

    public void setNameDenunciasLugarHecho(String nameDenunciasLugarHecho) {
        this.nameDenunciasLugarHecho = nameDenunciasLugarHecho;
    }

    public String getDistritoDenuncia() {
        return distritoDenuncia;
    }

    public void setDistritoDenuncia(String distritoDenuncia) {
        this.distritoDenuncia = distritoDenuncia;
    }

    public String getProvinciaDenuncia() {
        return provinciaDenuncia;
    }

    public void setProvinciaDenuncia(String provinciaDenuncia) {
        this.provinciaDenuncia = provinciaDenuncia;
    }

    public String getLugarDenuncia() {
        return lugarDenuncia;
    }

    public void setLugarDenuncia(String lugarDenuncia) {
        this.lugarDenuncia = lugarDenuncia;
    }
}
