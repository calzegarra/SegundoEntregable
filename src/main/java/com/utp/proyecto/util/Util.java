/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.util;

import com.utp.proyecto.modelo.Persona;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class Util {

    public List<String> listarAtributos(String atr1, String atr2) {
       List<String> lista =  new ArrayList<>(); 
       lista.add(ordPorItem(atr1));        
       lista.add(ordPorItem(atr2));
       return lista;
    }
        
    public String ordPorItem(String item) {
        String ordPorCol;
        switch (item) {     
                case "Nombre":
                    ordPorCol = "nombre";

                break;
                case "Apellido Paterno":
                    ordPorCol = "apePaterno";
                  
                break;
                case "Apellido Materno":
                    ordPorCol = "apeMaterno";
                     
                break;
                case "DNI":
                    ordPorCol = "dni";
                     
                break;  
                case "Edad":
                    ordPorCol = "edad";
                                
                break;
                case "Estado Civil":
                    ordPorCol = "estadoCivil";
                       
                break;
                case "Carrera":
                    ordPorCol = "carrera";
                break; 
            default:
                throw new AssertionError();       
            }   
        return ordPorCol;
   }   
    
        
    public int comparar(Persona p1, Persona p2, List<String> attributos) {
        for (String atr : attributos) {
            try {
                Field field = p1.getClass().getDeclaredField(atr);
                field.setAccessible(true);
                Object valor1 = field.get(p1);
                Object valor2 = field.get(p2);
                int resultado = ((Comparable) valor1).compareTo(valor2);
                if (resultado != 0) {
                    return resultado;
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }    
}
