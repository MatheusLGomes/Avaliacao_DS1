/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario {
    private String oab;

    public Advogado() {
    }

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario) {
        super(cpf, rg, matricula, setor, salario);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "Advogado:" + super.cpf + "\nRG: " + super.rg + "\nMatricula: " 
                + super.matricula + "\nSetor: " + super.setor + "\nSalario: " +
                super.salario + "\nOAB: " + this.oab + "\n..........................................";
    }
    
    
    
}
