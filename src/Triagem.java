
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
public class Triagem {

    private Enfermeira enfermeira;
    private Paciente paciente;
    private String pressao;
    private float temperatura;
    private String sintoma;
    private float peso;
    private float altura;
    private float IMC;
    private boolean febre;
    private List <String>alergias;

    public Triagem(Enfermeira enfermeira, Paciente paciente, String pressao, float temperatura, String sintoma, float peso, float altura, float IMC, boolean febre, List<String> alergias) {
        this.enfermeira = enfermeira;
        this.paciente = paciente;
        this.pressao = pressao;
        this.temperatura = temperatura;
        this.sintoma = sintoma;
        this.peso = peso;
        this.altura = altura;
        this.IMC = IMC;
        this.febre = febre;
        this.alergias = alergias;
    }

    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public boolean isFebre() {
        return febre;
    }

    public void setFebre(boolean febre) {
        this.febre = febre;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    @Override
    public String toString() {
        return "Triagem{" + "enfermeira=" + enfermeira + ", paciente=" + paciente + ", pressao=" + pressao + ", temperatura=" + temperatura + ", sintoma=" + sintoma + ", peso=" + peso + ", altura=" + altura + ", IMC=" + IMC + ", febre=" + febre + ", alergias=" + alergias + '}';
    }
    
    
    
    
}
