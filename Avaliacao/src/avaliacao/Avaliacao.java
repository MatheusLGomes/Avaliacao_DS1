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
        Advogado funcionario1 = new Advogado ("2334", "06770699524", "1604094893", "191919", Setor.JURIDICO, 3000, 22, Genero.MASCULINO, 1234, "Matheus", "71986282035", "Matheus@gmail.com", 
                new Endereco("Travessa Mário Kertéz", "10", "casa","40352020", "Salvador", UnidadeFederativa.BAHIA)) ;
        
        Engenheiro funcionario2 = new Engenheiro("4545", "789456904", "490875423", "232323", Setor.ENGENHARIA, 4000, 26, Genero.FEMININO, 1313, "Amanda", "1232312344", "Amanda@gmail.com",
                new Endereco("RuA Alberto Castro","23" , "casa", "4564598", "Rio Branco", UnidadeFederativa.ACRE));
        
        Medico funcionario3 = new Medico ("5678", "234432567", "123489655", "353535", Setor.SAUDE, 8000, 56, Genero.FEMININO, 4321, "Clarisse", "43543656", "Clarissa@gmail.com", 
                new Endereco("Alameda dos anjos", "134", "Apartamento", "12345681", "Recife", UnidadeFederativa.PERNAMBUCO));
        
        Cliente cliente1 = new Cliente(1234567890, 34, Genero.MASCULINO, 3423, "Gabriel", "71987652345", "Gabriel@gmail.com", 
                new Endereco("Avenida Castro", "65", "casa", "40565633", "São Luís", UnidadeFederativa.MARANHÃO));
        
        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());
        System.out.println(cliente1.toString());
    }
    
}
