/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Usuario1
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = null;
        FileReader fr= null;
        BufferedReader br= null;
        int carton1[][]=new int[5][5]; 
//        int cartonTemp[][]= new int[5][5];
        int vector[]= new int[5];

//    	ArrayList<Integer> cbd = new ArrayList<Integer>();
        //Se utiliza un generador de numeros aleatorios clase random
        for(int i=0;i<carton1.length;i++){
            for(int j=0;j<carton1[i].length;j++){  
              carton1[0][j] = (int) (Math.random()*19);
              vector=carton1[j];
//              cartonTemp[0][j]=carton1[0][j];
              carton1[1][j] = (int) (Math.random()*20+19);
              carton1[2][j] = (int) (Math.random()*40+19);
              carton1[3][j] = (int) (Math.random()*60+19);
              carton1[4][j] = (int) (Math.random()*80+19);
//              cartonTemp=carton1;

            }
            
            for (int[] carton11 : carton1) {
                for (int j = 0; j < carton11.length; j++) {
                    for(int y=0;y<vector.length;y++){
                        if(carton1[j]==vector){
                            carton1[0][j] = (int) (Math.random()*19);
//              carton1[1][j] = (int) (Math.random()*20+19);
//              carton1[2][j] = (int) (Math.random()*40+19);
//              carton1[3][j] = (int) (Math.random()*60+19);
//              carton1[4][j] = (int) (Math.random()*80+19);
                        }
                        else{
                            vector=carton1[j];
                        }
                    }
                    
//            }   
//          }
                }
            }
  }
       System.out.println();
        System.out.println("--------------------------");
       	System.out.println("B    I    N    G    O");
	System.out.println(""+carton1[0][0]+"   "+carton1[0][1]+"   "+carton1[0][2]+"   "+carton1[0][3]+"   "+carton1[0][4]+"\n");
	System.out.println("");
	System.out.println(""+carton1[1][0]+"   "+carton1[1][1]+"   "+carton1[1][2]+"   "+carton1[1][3]+"   "+carton1[1][4]+"\n");
	System.out.println("");
	System.out.println(""+carton1[2][0]+"   "+carton1[2][1]+"  LIBRE  "+carton1[2][3]+"   "+carton1[2][4]+"\n");
	System.out.println("");
	System.out.println(""+carton1[3][0]+"   "+carton1[3][1]+"   "+carton1[3][2]+"   "+carton1[3][3]+"   "+carton1[3][4]+"\n");
	System.out.println("");
	System.out.println(""+carton1[4][0]+"   "+carton1[4][1]+"   "+carton1[4][2]+"   "+carton1[4][3]+"   "+carton1[4][4]+"\n");
        System.out.println("--------------------------");
        System.out.println();
    }
  }
