package projetoconsultório.Model;

import java.sql.Date;


public class Medicamento {
    
    private int id;
    private String nome;
    private Date dataValidade;
    private String bula;

    public Medicamento() {
        this.nome = "";
        this.dataValidade = new Date(0);
        this.bula = "";
    }

    public Medicamento(String nome, Date dataValidade, String bula) {
        this.id = id;
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.bula = bula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getBula() {
        return bula;
    }

    public void setBula(String bula) {
        this.bula = bula;
    }
    
    
    
    
    
    
}
