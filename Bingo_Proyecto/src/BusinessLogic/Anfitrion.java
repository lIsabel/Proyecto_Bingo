/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Usuario1
 */
public class Anfitrion {
//    tiene la posibilidad de cantar los números
    Random rnd= new Random();
    List<Integer> numerosCantados= new ArrayList();
    public Anfitrion(){
        
    }
    public int cantarNumero() throws Exception{
        Integer numRnd=0;
        boolean nmCantado;
        for (int i = 0; i < 5; i++) {
            do {
                nmCantado=true;
                numRnd =(int) (Math.random()*99);
                if(!numerosCantados.contains(numRnd.intValue())){
                    numerosCantados.add(numRnd.intValue());
                    nmCantado=false;
                }
            } while (!nmCantado);
            
        }
        return numRnd;
    }
    public void revisarPatron(){
       boolean esGanador;
       
    }
}
