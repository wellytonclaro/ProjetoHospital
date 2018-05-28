
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SATC
 */
public class Atestado {
    private Date dataDoAtestado;
    private Date fimDoAtestado;
    private Consulta consulta;
    private int quantidadeDias;

    public Atestado(Date dataDoAtestado, Date fimDoAtestado, Consulta consulta, int quantidadeDias) {
        this.dataDoAtestado = dataDoAtestado;
        this.fimDoAtestado = fimDoAtestado;
        this.consulta = consulta;
        this.quantidadeDias = quantidadeDias;
    }

    public Date getDataDoAtestado() {
        return dataDoAtestado;
    }

    public void setDataDoAtestado(Date dataDoAtestado) {
        this.dataDoAtestado = dataDoAtestado;
    }

    public Date getFimDoAtestado() {
        return fimDoAtestado;
    }

    public void setFimDoAtestado(Date fimDoAtestado) {
        this.fimDoAtestado = fimDoAtestado;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    @Override
    public String toString() {
        return "Atestado{" + "dataDoAtestado=" + dataDoAtestado + ", fimDoAtestado=" + fimDoAtestado + ", consulta=" + consulta + ", quantidadeDias=" + quantidadeDias + '}';
    }
    
    
}
