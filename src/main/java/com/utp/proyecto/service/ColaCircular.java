/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.service;

import com.utp.proyecto.modelo.Alumno;

/**
 * Cola Circular
 */
public class ColaCircular {        
    private int capacidad;
    private int inicio;    
    private int fin;    
    private Alumno[] elementos;
    
    public ColaCircular(int capacidad) {  
        this.capacidad = capacidad;            
        this.inicio = -1;
        this.fin = -1; 
        this.elementos = new Alumno[capacidad];
    }
             
    public boolean estaVacia() {  
       return inicio == -1;
    }
 
    public boolean estaLlena() { 
        boolean lleno = Boolean.FALSE; 
        // Para definir si la cola esta llena, entonces..
        // O bien el INICIO esta en la posicion 0 y el FIN esta en la posicion final de la cola
        // O bien el FIN es esta ubicado una posicion anterior al inicio(Es decir, cola llenada completamente)
        if ((inicio == 0 && fin == capacidad - 1) || (fin == (inicio - 1))){     
            lleno = Boolean.TRUE;
        }   
        return lleno;      
    }
          
        
    public Boolean encolar(Alumno alumno) {
        boolean encola = Boolean.FALSE;         
        if (!estaLlena()) {         
            if (inicio == -1) {                   
                inicio = 0;  
            }            
            fin = (fin + 1) % capacidad;   
            elementos[fin] = alumno; 
            encola = Boolean.TRUE;  
        }            
        return encola;
    }
        
        
    public void desencolar() {
        if (estaVacia()) {         
            System.out.println("La cola está vacía. No se puede desencolar.");      
        } else {   
            elementos[inicio] = null;   
            if (inicio == fin) {
                inicio = -1;      
                fin = -1;    
            } else {              
                inicio = (inicio + 1) % capacidad;         
            }        
        }
    }
        
    public Alumno[] mostrarRegistrosEnCola() {         
        return elementos;  
    }
}
