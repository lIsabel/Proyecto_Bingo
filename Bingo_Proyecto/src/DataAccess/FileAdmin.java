/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author An&iacute;bal Gonz&aacute;lez Herrera.
 * @version 20161201
 */
public final class FileAdmin {
    private File a=null;
    
    /**
     * Instancia el archivo con el valor ingresado.
     * @param archivo Nombre y direcci&oacute;n del archivo a utilizar.
     * @throws Exception En caso de errores.
     */
    protected void setArchivo(String archivo) throws Exception{
        if(archivo==null){ throw new Exception("El archivo origen es null."); }
        if(archivo.equals("")){ throw new Exception("El archivo origen esta vacio."); }
        
        File f = new File(archivo);
        
        if(!f.exists()){ 
            PrintWriter writer = new PrintWriter(archivo);
            writer.close();
        }
       
        if(f.isDirectory()){ throw new Exception("El archivo origen no puede ser una carpeta."); }
        
        a=f;
    }
    
    /**
     * Retorna en archivo origen.
     * @return <code>File</code> Archivo origen.
     */
    public File getArchivo(){ return a; }
    
    /**
     * Constructor principal de la clase FileAdmin
     * @param archivo Nombre y direcci&oacute;n del archivo a utilizar.
     * @throws Exception En caso de errores.
     */
    public FileAdmin(String archivo) throws Exception{
        setArchivo(archivo);
    }
    
    /**
     * M&eacute;todo que recorre todo el archivo y estrae todos los registros.
     * @return <code>String[]</code> Vector de tipo String con todos los registros del archivo.
     * @throws Exception En caso de errores.
     */
    public Integer[][] extraerRegistros() throws Exception{
        BufferedReader lector=null;
//        List<String> lstTemp = new ArrayList<>();
        Integer matriz[][]= new Integer[5][5];
          try{
            // Instanciacion del lector de archivos y apertura del archivo.
            lector = new BufferedReader( new FileReader( getArchivo() ) );
            // Se lee la primer línea del archivo.
            String linea = lector.readLine();
            int numlinea=0;
            // Si no es null significa que no es fin de archivo
            // y entoces recorremos el archivo para extraer los datos.
            while( linea != null ){
                String a[]=linea.split(",");
                for(int i=0;i<a.length;i++){
                    matriz[numlinea][i]=Integer.parseInt(a[i]);
                }
                linea = lector.readLine();
            numlinea++;
            }
          }
        catch(Exception err){
            throw new Exception("Error al extraer los registros.\n- " + err.getMessage());
        }
        finally{
            // Se cierra el buffer.
            try{
                if(lector!=null){
                    lector.close();
                }
            } catch(Exception e) {
                throw new Exception("Error inesperado al cerrar el buffer.\n- " + e.getMessage());
            }
        }
        
        // Se convierte la lista a vector para retornarlo.
        return matriz;
    }
    
    /**
     * M&eacute;todo que escribe el registro en el archivo.
     * @param r Registro a escribrir en el archivo.
     * @throws Exception En caso de errores.
     */
    public void insertarRegistro(String r,Integer[][] numeros) throws Exception{
        try{
            BufferedWriter bfr= new BufferedWriter(new FileWriter(r));
            for(int i=0; i< numeros.length; i++){
             for(int j=0; j< numeros.length; j++){
                 String numeroGuardar=numeros[i][j].toString();
                  if(j!=numeros.length-1){
                    numeroGuardar+=",";
                } 
                 bfr.write(numeroGuardar);
               
             } 
             if(i!=numeros.length-1)
             {
                bfr.newLine();
             }
            }
            bfr.flush();
        }
        catch(Exception err){
            throw new Exception("Error al escribir el registro en el archivo.\n- " + err.getMessage());
        }
    }
}
