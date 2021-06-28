package projetoconsultório.Model;



public class Endereco {
    
    private int id;
    private String rua;
    private String bairro;
    private String estado;
    private String cidade;
    private String cep;

    public Endereco() {
        this.rua = "";
        this.bairro = "";
        this.estado = "";
        this.cidade = "";
        this.cep = "";
    }

    public Endereco(int id, String rua, String bairro, String estado, String cidade, String cep) {
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
    
}
