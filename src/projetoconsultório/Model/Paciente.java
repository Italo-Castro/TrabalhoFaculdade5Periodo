
package projetoconsultório.Model;


public class Paciente {
    private int id;
    private String nome;
    private int idEndereco;
    private int idPlanoSaude;
    private String sexo;

    public Paciente() {
        this.nome = "";
        this.idEndereco = 0;
        this.idPlanoSaude = 0;
        this.sexo = "";    
    }

    public Paciente(int id, String nome, int idEndereco, int idPlanoSaude, String sexo) {
        this.id = id;
        this.nome = nome;
        this.idEndereco = idEndereco;
        this.idPlanoSaude = idPlanoSaude;
        this.sexo = sexo;
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

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdPlanoSaude() {
        return idPlanoSaude;
    }

    public void setIdPlanoSaude(int idPlanoSaude) {
        this.idPlanoSaude = idPlanoSaude;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
