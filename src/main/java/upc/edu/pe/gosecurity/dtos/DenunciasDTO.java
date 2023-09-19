package upc.edu.pe.gosecurity.dtos;

import java.time.LocalDate;

public class DenunciasDTO {
    private int idDenuncias;
    private String nameDenuncias;
    private LocalDate FechaDenunciasHechos;
    private LocalDate FechaDenunciasRegistro;
    private LocalDate FechaDenunciasEmision;

    public int getIdDenuncias() {
        return idDenuncias;
    }

    public void setIdDenuncias(int idDenuncias) {
        this.idDenuncias = idDenuncias;
    }

    public String getNameDenuncias() {
        return nameDenuncias;
    }

    public void setNameDenuncias(String nameDenuncias) {
        this.nameDenuncias = nameDenuncias;
    }

    public LocalDate getFechaDenunciasHechos() {
        return FechaDenunciasHechos;
    }

    public void setFechaDenunciasHechos(LocalDate fechaDenunciasHechos) {
        FechaDenunciasHechos = fechaDenunciasHechos;
    }

    public LocalDate getFechaDenunciasRegistro() {
        return FechaDenunciasRegistro;
    }

    public void setFechaDenunciasRegistro(LocalDate fechaDenunciasRegistro) {
        FechaDenunciasRegistro = fechaDenunciasRegistro;
    }

    public LocalDate getFechaDenunciasEmision() {
        return FechaDenunciasEmision;
    }

    public void setFechaDenunciasEmision(LocalDate fechaDenunciasEmision) {
        FechaDenunciasEmision = fechaDenunciasEmision;
    }
}
