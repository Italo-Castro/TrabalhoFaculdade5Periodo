package projetoconsultório.Model;

import java.util.Date;
import java.util.ArrayList;

public class Receita {

    private int id;
    private ArrayList<Medicamento> medicamentos;
    private Date validade;
    private String dosagem;
    private Date dataReceita;
    private Medico idMedico;

    public Receita(){};
     
    public Receita(int id, ArrayList<Medicamento> medicamentos, Date validade, String dosagem, Date dataReceita, Medico idMedico) {
        this.id = id;
        this.medicamentos = medicamentos;
        this.validade = validade;
        this.dosagem = dosagem;
        this.dataReceita = dataReceita;
        this.idMedico = idMedico;
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

    public Medico getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Medico idMedico) {
        this.idMedico = idMedico;
    }
    
}
