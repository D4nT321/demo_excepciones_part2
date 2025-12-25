package com.dante;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {

        try {
            leerArchivo("datos.txt");
        } catch (IOException e) {
            System.out.println("Ocurrio un error al leer el archivo: " + e.getMessage());
        }
        System.out.println("Programa finalizado");
      
    }

    public static void leerArchivo(String nombreArchivo) throws IOException { 
        //IOException es la clase padre de FileNotFoundException 
        //por lo que con capturar IOException ya estamos capturando ambas excepciones
        // Ademas son checked exceptions, por lo que obligatoriamente deben ser capturadas
        // o declaradas en la firma del metodo
       BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
       String linea;
       while ((linea = lector.readLine()) != null) {
        System.out.println(linea);
        
       }
         lector.close();

       
    }
    
}