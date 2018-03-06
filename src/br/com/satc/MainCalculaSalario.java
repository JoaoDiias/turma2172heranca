
package br.com.satc;

import br.com.satc.objeto.Funcionario;

/**
 *
 * @author joao.154817
 */
public class MainCalculaSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Funcionario funcionario = new Funcionario("Professor", 30, 20);
       
       System.out.println(funcionario.getSalario());
    }
    
}
