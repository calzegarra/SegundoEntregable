/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.service;

import com.utp.proyecto.modelo.Alumno;


public class Cola {
    private Alumno[] cola;
    private int tamaño;
    private int pri;
    private int ult; 
    
    public Cola(int n) {
        cola = new Alumno[n];
        colaVacia();
    }
        
    //Metodo para reiniciar los indices
    public void colaVacia() {   
        pri =-1;
        ult =-1;
    }
        
    public boolean estaVacia() {
        return pri == -1;
    }
             
    //Metodo PUSH
    public Boolean incluir(Alumno alumno) {
        boolean enCola = Boolean.FALSE;
        if (ult < cola.length - 1) {
           ult++;
           enCola = Boolean.TRUE;
           cola[ult] = alumno;
           if (pri == -1)
               pri = 0;
        }
        return enCola;
    } 
    
    //Metodo POP
    public Boolean desencolar() {
        boolean desencolado = Boolean.FALSE;
         if (!estaVacia()) {
            desencolado = Boolean.TRUE;
            cola[pri] = null;      
            pri++;
            if(pri > ult){
                colaVacia();
                desencolado = Boolean.FALSE;
            }
        }
        return desencolado;
    }
    
    //Retorna el arreglo de la cola
    public Alumno[] mostrarCola() {
        return cola;
    }
    
    //Devuelve la cantidad del tamaño de la cola
    public int cantidad() {
        return cola.length;
    }
}
