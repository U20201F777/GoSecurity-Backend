package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;
@Entity
@Table(name = "DenunciasLugarHecho")
public class DenunciasLugarHecho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDenunciasLugarHecho;
    @Column(name = "lugarhecho",length = 100,nullable=false)
    private String nameDenunciasLugarHecho;
    @Column(name = "Denuncia", length = 100, nullable = false)
    private String DistritoDenuncia;
    @Column(name = "Provincia", length = 100, nullable = false)
    private String ProvinciaDenuncia;
    @Column(name = "Lugar", length = 100, nullable = false)
    private String LugarDenuncia;

    public DenunciasLugarHecho() {
    }

    public DenunciasLugarHecho(int idDenunciasLugarHecho, String nameDenunciasLugarHecho, String distritoDenuncia, String provinciaDenuncia, String lugarDenuncia) {
        this.idDenunciasLugarHecho = idDenunciasLugarHecho;
        this.nameDenunciasLugarHecho = nameDenunciasLugarHecho;
        DistritoDenuncia = distritoDenuncia;
        ProvinciaDenuncia = provinciaDenuncia;
        LugarDenuncia = lugarDenuncia;
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
        return DistritoDenuncia;
    }

    public void setDistritoDenuncia(String distritoDenuncia) {
        DistritoDenuncia = distritoDenuncia;
    }

    public String getProvinciaDenuncia() {
        return ProvinciaDenuncia;
    }

    public void setProvinciaDenuncia(String provinciaDenuncia) {
        ProvinciaDenuncia = provinciaDenuncia;
    }

    public String getLugarDenuncia() {
        return LugarDenuncia;
    }

    public void setLugarDenuncia(String lugarDenuncia) {
        LugarDenuncia = lugarDenuncia;
    }
}
