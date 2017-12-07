/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import DataAccess.FileAdmin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

/**
 *
 * @author Leticia Sánchez
 */
public class Carton {

    public static void insertar(FileAdmin fa, Carton elC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static enum TIPOJUEGO{
        CUATRO_ESQUINAS,
        L,
        O,
        CARTON_LLENO;
    }
    private static final int carton[][]= new int[5][5];
    private TIPOJUEGO t;
    
    public Carton(){
        
    }
    public void generarCarton(){
    for(int i=0;i<carton.length;i++){
            for(int j=0;j<carton[i].length;j++){
              carton[0][j] = (int) (Math.random()*19);
              carton[1][j] = (int) (Math.random()*20+19);
              carton[2][j] = (int) (Math.random()*40+19);
              carton[3][j] = (int) (Math.random()*60+19);
              carton[4][j] = (int) (Math.random()*80+19);

            }
        }
    }
    public static Carton[][] getCarton(FileAdmin fa) throws Exception{
        if(fa==null){ throw new Exception("El adminsitrador de archivos no debe ser null."); }
        Carton[][] miC = null;
        try {
            // Se extraen todos los registros del archivo.
            String[] registros = fa.extraerRegistros();
            // Control de la posicion del vector.
            // Se recorren uno a uno para buscar el contacto.
            for (String r : registros) {
                // Se separan los datos del registro separados por ",".
                String[] datos = r.split(",");
            }
        }catch(Exception err) {
            throw new Exception("Error en el metodo getContactos(FileAdmin).\n- " + err.getMessage());
        }
        return miC;
    }
}
