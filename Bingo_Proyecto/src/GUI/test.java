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
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import BusinessLogic.Carton;
import BusinessLogic.Anfitrion;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Usuario1
 */
public class test {

    private static List<Integer> numercosCarton = new ArrayList();
//    private static Integer carton[][]=new Integer[5][5];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);

        System.out.println("Fecha Actual: "+ dia + "/" + (mes) + "/" + año);
        System.out.printf("Hora Actual: %02d:%02d:%02d %n", hora, minuto, segundo);
        System.out.println("-------------Fecha desglosada----------------");
//        System.out.println("El año es: "+ año);
//        System.out.println("El mes es: "+ mes);
//        System.out.println("El día es: "+ dia);
//        System.out.printf("La hora es: %02d %n", hora);
//        System.out.printf("El minuto es: %02d %n", minuto);
//        System.out.printf("El segundo es: %02d %n", segundo);
         String fecha1 = Integer.toString(año)+Integer.toString(mes)+Integer.toString(dia);
         String hora1 = Integer.toString(hora)+Integer.toString(minuto)+Integer.toString(segundo);
        System.out.printf("CBD"+fecha1+hora1+".cbd");
//        int num=5;
//        
//        int numMayor=3;
//        if(numMayor>num){
//            num=numMayor;
//        }
//           System.out.println("El numero mayor es :" +num);
    }
//        Carton miCarton = new Carton();
//        Anfitrion anf = new Anfitrion();
//          numercosCarton.clear();
//          miCarton.llenarCarton(0,19,0);
//          miCarton.llenarCarton(20,39,1);
//          miCarton.llenarCarton(40,59,2);
//          miCarton.llenarCarton(60,79,3);
//          miCarton.llenarCarton(80,99,4);
//          
//
//        System.out.println(miCarton.toString());
//        System.out.println("El número es :"+anf.cantarNumero());
////       System.out.println();
////        System.out.println("--------------------------");
////       	System.out.println("B    I    N    G    O");
////	System.out.println(""+carton[0][0]+"   "+carton[0][1]+"   "+carton[0][2]+"   "+carton[0][3]+"   "+carton[0][4]+"\n");
////	System.out.println("");
////	System.out.println(""+carton[1][0]+"   "+carton[1][1]+"   "+carton[1][2]+"   "+carton[1][3]+"   "+carton[1][4]+"\n");
////	System.out.println("");
////	System.out.println(""+carton[2][0]+"   "+carton[2][1]+"  LIBRE  "+carton[2][3]+"   "+carton[2][4]+"\n");
////	System.out.println("");
////	System.out.println(""+carton[3][0]+"   "+carton[3][1]+"   "+carton[3][2]+"   "+carton[3][3]+"   "+carton[3][4]+"\n");
////	System.out.println("");
////	System.out.println(""+carton[4][0]+"   "+carton[4][1]+"   "+carton[4][2]+"   "+carton[4][3]+"   "+carton[4][4]+"\n");
////        System.out.println("--------------------------");
////        System.out.println();
    }

