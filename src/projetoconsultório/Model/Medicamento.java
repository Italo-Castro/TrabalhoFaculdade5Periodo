package projetoconsultório.Model;

import java.sql.Date;


public class Medicamento {
    
    private int id;
    private String nome;


    public Medicamento() {
       
    }

    public Medicamento(String nome, Date dataValidade) {
        this.id = id;
        this.nome = nome; 
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

}
