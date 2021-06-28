package projetoconsultório.Model;

import java.io.Serializable;

public class Paciente {

    private int id;
    private String nome;
    private String cpf; 
    private String sexo;
    private Endereco idEndereco;
    private PlanoDeSaude idPlanoSaude;

    public Paciente() {
        
       idEndereco = new Endereco();
       idPlanoSaude = new PlanoDeSaude();
       
    }

    
    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Endereco getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Endereco idEndereco) {
        this.idEndereco = idEndereco;
    }

    public PlanoDeSaude getIdPlanoSaude() {
        return idPlanoSaude;
    }

    public void setIdPlanoSaude(PlanoDeSaude idPlanoSaude) {
        this.idPlanoSaude = idPlanoSaude;
    }

   

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
