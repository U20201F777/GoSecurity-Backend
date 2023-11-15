package upc.edu.pe.gosecurity.dtos;

public class DenunciasLugarHechoDTO {
    private int idDenunciasLugarHecho;
    private String nameDenunciasLugarHecho;
    private String distritoDenuncia;
    private String provinciaDenuncia;
    private String lugarDenuncia;

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
