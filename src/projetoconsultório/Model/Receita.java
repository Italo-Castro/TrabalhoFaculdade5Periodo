package projetoconsultório.Model;

import java.util.ArrayList;

public class Receita {

    private int id;
    private ArrayList<Integer> medicamentos;
    private String validade;
    private double dosagem;

    public Receita() {
        this.medicamentos = new ArrayList<>();
        this.validade = "";
        this.dosagem = 0;
    }

    public Receita(int id, ArrayList<Integer> medicamentos, String validade, double dosagem) {
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

    public ArrayList<Integer> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Integer> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }

}
