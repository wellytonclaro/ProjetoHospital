
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SATC
 */
public class Consulta {

    private Triagem triagem;
    private Medico medico;
    private String diagnostico;
    private Boolean atestado;
    private int codigoDoDiagnostico;
    private List<String>medicamentos ;

    public Consulta(Triagem triagem, Medico medico, String diagnostico, Boolean atestado, int codigoDoDiagnostico, List<String> medicamentos) {
        this.triagem = triagem;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.atestado = atestado;
        this.codigoDoDiagnostico = codigoDoDiagnostico;
        this.medicamentos = medicamentos;
    }

    public Triagem getTriagem() {
        return triagem;
    }

    public void setTriagem(Triagem triagem) {
        this.triagem = triagem;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Boolean getAtestado() {
        return atestado;
    }

    public void setAtestado(Boolean atestado) {
        this.atestado = atestado;
    }

    public int getCodigoDoDiagnostico() {
        return codigoDoDiagnostico;
    }

    public void setCodigoDoDiagnostico(int codigoDoDiagnostico) {
        this.codigoDoDiagnostico = codigoDoDiagnostico;
    }

    public List<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        return "Consulta{" + "triagem=" + triagem + ", medico=" + medico + ", diagnostico=" + diagnostico + ", atestado=" + atestado + ", codigoDoDiagnostico=" + codigoDoDiagnostico + ", medicamentos=" + medicamentos + '}';
    }
    
    
    
    
}
