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
public class Medico extends Funcionario{
    private String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario) {
        super(cpf, rg, matricula, setor, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico: " + super.cpf + "\nRG: " + super.rg + "\nMatricula: " +
                super.matricula + "\nSetor: " + super.setor + "\nSalário: " +
                super.salario + "\nCRM: " + this.crm + "\n.........................";
    }
    
    
}
