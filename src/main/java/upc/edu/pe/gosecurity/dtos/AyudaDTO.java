package upc.edu.pe.gosecurity.dtos;

import upc.edu.pe.gosecurity.entities.TipoCaso;

import java.time.LocalDate;

public class AyudaDTO {
    private int idAyuda;
    private LocalDate fechaAyuda;
    private TipoCaso idTipoCaso;

    public int getIdAyuda() {
        return idAyuda;
    }

    public void setIdAyuda(int idAyuda) {
        this.idAyuda = idAyuda;
    }

    public LocalDate getFechaAyuda() {
        return fechaAyuda;
    }

    public void setFechaAyuda(LocalDate fechaAyuda) {
        this.fechaAyuda = fechaAyuda;
    }

    public TipoCaso getIdTipoCaso() {
        return idTipoCaso;
    }

    public void setIdTipoCaso(TipoCaso idTipoCaso) {
        this.idTipoCaso = idTipoCaso;
    }
}
