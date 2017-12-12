/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import DataAccess.FileAdmin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Leticia Sánchez
 */
public class Carton {
    
    public static enum TIPOJUEGO{
        CUATRO_ESQUINAS,
        L,
        O,
        CARTON_LLENO;
    }
    private static List<Integer> numercosCarton = new ArrayList();
    private  Integer[][] carton1=new Integer[5][5];
    
    public Carton(){
       
    }

    public Integer[][] getCarton1() {
        return carton1;
    }

    public  void llenarCarton(Integer inicioRango,Integer finalRango,Integer columna){
        Integer numeroRND=0;
        Random random = new Random();
        boolean agregoNumero;
        
        for (int i = 0; i < 5 ; i++) {
            do {
                agregoNumero=false;
                numeroRND =random.nextInt(finalRango - inicioRango + 1) + inicioRango;
                if(!numercosCarton.contains(numeroRND.intValue())){
                    numercosCarton.add(numeroRND.intValue());
                    carton1[columna][i]=numeroRND;
                    agregoNumero=true;
                }

            } while (!agregoNumero);

        }
  }
    public  Carton getCarton(FileAdmin fa) throws Exception{
        if(fa==null){ throw new Exception("El adminsitrador de archivos no debe ser null."); }
        Carton miC = new Carton();
        try {
            // Se extraen todos los registros del archivo.
            Integer[][] registros = fa.extraerRegistros();
            miC.carton1= registros;

        }catch(Exception err) {
            throw new Exception("Error en el metodo getCarton(FileAdmin).\n- " + err.getMessage());
        }
        return miC;
    }
    public  void insertar(FileAdmin fa, Carton elC) throws Exception {
        if(elC==null){ throw new Exception("La instancia del carton no debe ser null."); }
                try{
            String r = fa.getArchivo().getName();
              // tengo que recorrer la lista
              elC.llenarCarton(0,19,0);
              elC.llenarCarton(20,39,1);
              elC.llenarCarton(40,59,2);
              elC.llenarCarton(60,79,3);
              elC.llenarCarton(80,99,4);
           fa.insertarRegistro(r,elC.carton1);
        }catch(Exception err) {
            throw new Exception("Error en el metodo insertar(FileAdmin, Carton).\n- " + err.getMessage());
        }
    }
    public  String toString(){
        return Arrays.deepToString(carton1);
    }
}
