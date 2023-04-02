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

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, idade, genero, id, nome, telefone, email, endereco);
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
        return " Dados do(a) Medico(a): " +
                "\nCPF: " + super.cpf + 
                "\nRG: " + super.rg + 
                "\nMatricula: " + super.matricula +
                "\nSetor: " + super.setor +
                "\nSalario: " + super.salario + 
                "\nIdade: " + super.idade + 
                "\nGênero: " + super.genero +
                "\nCRM: " + this.crm + 
                "\nID: " + super.id + 
                "\nNome: " + super.nome +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\n---------------------------------------\nEndereço:\n" + super.endereco.logradouro +
                "\nNumero: " + super.endereco.numero + 
                "\nComplemento:" + super.endereco.complemento +
                "\nCEP: " + super.endereco.cep +
                "\nCidade:" + super.endereco.cidade +
                "\nUF: " + super.endereco.uf +
                
                "\n.........................";
    }
    
    
}
