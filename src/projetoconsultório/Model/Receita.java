package projetoconsultório.Model;

import java.sql.Date;
import java.util.ArrayList;

public class Receita {

    private int id;
    private ArrayList<Integer> medicamentos;
    private Date validade;
    private double dosagem;

    public Receita() {
        this.medicamentos = new ArrayList<>();
        this.validade = new Date(0);
        this.dosagem = 0;
    }

    public Receita(int id, ArrayList<Integer> medicamentos, Date validade, double dosagem) {
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

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }

}
