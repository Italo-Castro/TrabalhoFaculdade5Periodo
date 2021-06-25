package projetoconsultório.Model;

import java.sql.Date;

public class PlanoDeSaude {

    private int id;
    private double valor;
    private Date dataExpiracao;
    private String tipo;

    public PlanoDeSaude() {
        this.valor = 0;
        this.dataExpiracao = new Date(0);
        this.tipo = "";
    }

    public PlanoDeSaude(int id, double Valor, Date dataExpiracao, String tipo) {
        this.id = id;
        this.valor = Valor;
        this.dataExpiracao = dataExpiracao;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double Valor) {
        this.valor = Valor;
    }

    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
