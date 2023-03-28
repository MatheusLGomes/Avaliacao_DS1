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
public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro() {
    }

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario) {
        super(cpf, rg, matricula, setor, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro: " + super.cpf +
                "\nRG: " + super.rg + 
                "\nMatricula: " +  super.matricula + 
                 "\nSetor: " + super.setor +
                "\nSalário: " + super.salario + "\nCrea: " + this.crea + "\n............................";
    }
    
    
}
