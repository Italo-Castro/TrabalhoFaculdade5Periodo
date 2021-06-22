
package projetoconsultório.Model;


public class Usuario {
    
    private int id;
    private String nome;
    private String senha;
    private int nivelPermissao;

    public Usuario(String nome, String senha, int nivelPermissao) {
        this.nome = nome;
        this.senha = senha;
        this.nivelPermissao = nivelPermissao;
    }

    public Usuario() {}

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNivelPermissao() {
        return nivelPermissao;
    }

    public void setNivelPermissao(int nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }
    
    
    
}
