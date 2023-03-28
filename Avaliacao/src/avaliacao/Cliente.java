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
public class Cliente extends Fisica {
    private int protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(int protocoloAtendimento, int idade, Genero genero) {
        super(idade, genero);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    
    
    
    @Override
    public String toString() {
        return "Cliente: " + super.idade + "\nGênero: " + super.genero + 
                "\nProtocolo de Atendimento: " + this.protocoloAtendimento ;
                }
    
    
}
