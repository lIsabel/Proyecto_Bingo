/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.ArrayList;

/**
 *
 * @author Usuario1
 */
public class Jugador {
    private ArrayList<Carton> listaCarton;
    
    public Jugador(){
        listaCarton = new ArrayList<Carton>(); 
    }
    public void agregarCarton(){
        listaCarton.add( new Carton() ); 
    }
    public void marcarNumero(){
        
    }
}
