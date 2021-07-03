package projetoconsultório.Model;

import java.util.Date;





public class Medico {

    private int id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String especializacao;
    private String sexo;
    private boolean disponibilidade;
    private String crm;

    public Medico() {
        this.nome = "";
        this.cpf = "";
        this.especializacao = "";
        this.sexo = "";
        this.disponibilidade = false;
    }

    public Medico(int id, String nome, String cpf, Date dataNascimento, String especializacao, String sexo, boolean disponibilidade,String crm) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.especializacao = especializacao;
        this.sexo = sexo;
        this.disponibilidade = disponibilidade;
        this.crm = crm;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
   
}
