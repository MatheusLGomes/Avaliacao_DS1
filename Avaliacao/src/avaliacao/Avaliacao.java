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
public class Avaliacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario1 = new Advogado("5555", "123456789", "12457878", "9595", Setor.JURIDICO, 3500);
        
        Funcionario funcionario2 = new Medico("4040", "123789456", "456789123", "4569", Setor.SAUDE, 8000);
        Funcionario funcionario3 = new Engenheiro("7894","456983172","456789121", "8989", Setor.ENGENHARIA, 4000);
        
        
        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());
        
    }
    
}
