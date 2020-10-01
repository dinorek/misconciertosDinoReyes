package cl.inacap.misconciertos.dto;

import java.util.Date;

public class Evento {
    private String banda;
    private Date fecha;
    private String genero;
    private Integer valorEntrada;

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(Integer valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    private Integer calificacion;


}
