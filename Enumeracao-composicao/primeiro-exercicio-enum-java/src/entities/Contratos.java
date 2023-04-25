package entities;

import java.util.Date;

public class Contratos {

    private Integer horas;
    private Date data;
    private Double valorPorHora;

    public Contratos() {
    }

    public Contratos(Integer horas, Date data, Double valorPorHora) {
        this.horas = horas;
        this.data = data;
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    } 

    public Double valorTotal() {
        return valorPorHora*horas;
    }
       
    
}
