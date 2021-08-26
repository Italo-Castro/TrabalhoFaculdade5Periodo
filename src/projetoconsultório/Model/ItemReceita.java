package projetoconsultório.Model;


public class ItemReceita {

    private int id;
    private int idItemReceita;
    private Medicamento idMedicamento;
    private Receita idReceita;
    private String dosagem;
    private String observacao;

    public ItemReceita() {
        
    }

    
   

    public ItemReceita(int id, int idItemReceita, Medicamento idMedicamento, Receita idReceita, String dosagem,String observacao) {
        this.id = id;
        this.idItemReceita = idItemReceita;
        this.idMedicamento = idMedicamento;
        this.idReceita = idReceita;
        this.dosagem = dosagem;
        this.observacao = observacao;
    }
    
    public int getId() {
           return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Medicamento getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Medicamento idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public Receita getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(Receita idReceita) {
        this.idReceita = idReceita;
    }

    public int getIdItemReceita() {
        return idItemReceita;
    }

    public void setIdItemReceita(int idItemReceita) {
        this.idItemReceita = idItemReceita;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
  
    
    

    
}
