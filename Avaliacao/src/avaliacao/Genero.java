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
public enum Genero {
  FEMININO('F',"Feminino"),
  MASCULINO ('M', "Masculino");

    protected char sigla;
    protected String texto;

    private Genero(char sigla, String texto) {
        this.sigla = sigla;
        this.texto = texto;
    }

    public char getSigla() {
        return sigla;
    }

    public String getTexto() {
        return texto;
    }

      
  
}

