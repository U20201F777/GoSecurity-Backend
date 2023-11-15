package upc.edu.pe.gosecurity.dtos;

public class DenunciasLugarHechoDTO {
    private int idDenunciasLugarHecho;
    private String nameDenunciasLugarHecho;
    private String DistritoDenuncia;
    private String ProvinciaDenuncia;
    private String LugarDenuncia;

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
