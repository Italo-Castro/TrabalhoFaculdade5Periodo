package projetoconsultório.Model;

import java.util.Date;
import java.util.ArrayList;

public class Receita {

    private int id;
    private ArrayList<Medicamento> medicamentos;
    private Date validade;
    private String dosagem;
    private Date dataReceita;

    public Receita() {
        this.medicamentos = new ArrayList<>();
        this.validade = new Date(0);
        this.dosagem = "";
    }

    public Receita(int id, ArrayList<Medicamento> medicamentos, Date validade, String dosagem) {
        this.id = id;
        this.medicamentos = medicamentos;
        this.validade = validade;
        this.dosagem = dosagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public Date getDataReceita() {
        return dataReceita;
    }

    public void setDataReceita(Date dataReceita) {
        this.dataReceita = dataReceita;
    }

}
