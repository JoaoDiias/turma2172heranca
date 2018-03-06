
package br.com.satc;

import br.com.satc.objeto.Cliente;
import br.com.satc.objeto.Dependente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author joao.154817
 */
public class MainDataNascimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException { 
     Date data = new Date();
     Date dataNascimento = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dataNascimento = sdf.parse("20/01/2001");
        Cliente pai = new Cliente(data, "Robson", "123", "666");
        Dependente filho = new Dependente(pai, dataNascimento, "Relampago Marquinhos", "456", "987");
        
        System.out.println(filho.getIdade());
        
        
    }
    
}
