/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.Random;

/**
 *
 * @author Usuario1
 */
public class Anfitrion {
//    tiene la posibilidad de cantar los números
    Random rnd= new Random();
    
    public Anfitrion(){
        
    }
    public int cantarNumero() throws Exception{
        int numAzar=0;
        boolean cantado=false;
        int temp=0;
        numAzar= (int) (Math.random()*99);
        temp=numAzar;
        if(numAzar==temp){
            cantado= true;
            throw new Exception("El número ya fue cantado, porfavor genere otro número");
        }
        return numAzar;
    }
    public void revisarPatron(){
        
    }
}
