
package projetoconsultório.Model;

import java.sql.Date;


public class Plano_De_Saude {
    
    private int id;
    private double Valor;
    private Date dataExpiracao;
    private String tipo;
 
    public Plano_De_Saude() {
        this.Valor = 0;
        this.dataExpiracao = new Date(0);
        this.tipo = "";
    }

    public Plano_De_Saude(int id, double Valor, Date dataExpiracao, String tipo) {
        this.id = id;
        this.Valor = Valor;
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
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
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
