/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_practica;

import static BusinessLogic.ProbarBingo.bombos;
import static BusinessLogic.ProbarBingo.imprimeixCartro;
import static BusinessLogic.ProbarBingo.mostrarUsats;
import static BusinessLogic.ProbarBingo.ordenar;
import static BusinessLogic.ProbarBingo.sorteig_Bingo;
import java.util.Scanner;

/**
 *
 * @author Usuario1
 */
public class Bingo_Practica {
public static void main(String[] args) {
 int bombo = 0, aux, acertat;
    boolean ordenar = true;
    int[][] cartro = new int[3][9];
    int[] sorteig = new int[90];
    Scanner ranlat2 = new Scanner(System.in);
 
    boolean blnFin = false;
 
    while(!blnFin){
        ordenar(cartro);
        bombo = bombos(cartro);
        imprimeixCartro(cartro);
        int numSorteig = sorteig_Bingo(cartro, sorteig);
        mostrarUsats(sorteig, numSorteig);
        imprimeixCartro(cartro);
        System.out.println("");
 
        sorteig = new int[90];
        System.out.println("Desea seguir jugando? (s/n)");
 
        if((ranlat2.next().charAt(0))=='n') {
            blnFin=true;
 
        }
 
    }
    System.out.println("FIN!!!");
}
}