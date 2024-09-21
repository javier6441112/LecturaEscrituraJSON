/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecturajson2;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

/**
 *
 * @author lestu
 */
public class LecturaJSON2 {

    public static void main(String[] args) {
        ObjectMapper map = new ObjectMapper();
    
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("javier Isaac Sandoval Perez");
        estudiante.setGenero("hombre");
        estudiante.setSeccion("A");
        estudiante.setCarnet("7690-23-5643");
        
        try {
            map.writeValue(new File("estudiante.txt"),estudiante);
        } catch (Exception e) {
            System.out.println("este es el error del metodo json"+e);
        }
        
        try {
             Estudiante estudiante2 = map.readValue(new File("estudiante.txt"),Estudiante.class);
            System.out.println("nombre "+estudiante2.getNombre());
            System.out.println("carnet "+estudiante2.getCarnet());
            System.out.println("seccion "+estudiante2.getSeccion());
            System.out.println("genero "+estudiante2.getGenero());
        
        } catch (Exception e) {
        }
        
    }
}
