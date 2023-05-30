/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.service;

import com.utp.proyecto.modelo.Alumno;
import com.utp.proyecto.modelo.Nodo;

public class ListaEnlazada {   
    private Nodo inicio;
    private int y;
    private Alumno[] elementos;
    
    // Constructor
    public ListaEnlazada() {
        this.inicio = null;           
        this.y = 0;
    }
 
    public boolean estaVacia() {
        return (inicio == null);
    }
    
     // Método para insertar un nuevo alumno de forma ordenada por carrera
    public void insertarInicialOrdenado(Alumno alumno) {
        Nodo nuevoNodo = new Nodo(alumno);
        // Caso especial: lista vacía o el primer nodo tiene una carrera mayor que el nuevo nodo
        if (estaVacia() || inicio.getAlumno().getCarrera().compareTo(alumno.getCarrera()) >= 0) {
            nuevoNodo.setSiguiente(inicio);
            inicio = nuevoNodo;
            y++;
        } else {
            Nodo actual = inicio;
            // Buscar la posición de inserción
            while (actual.getSiguiente() != null && actual.getSiguiente().getAlumno().getCarrera().compareTo(alumno.getCarrera()) < 0) {
                actual = actual.getSiguiente();
            }
            
            // Insertar el nuevo nodo después del nodo actual
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);    
            y++;
        }
    }


   // Método para insertar un nuevo alumno de forma ordenada por carrera
    public void insertarFinalOrdenado(Alumno alumno) {
        Nodo nuevoNodo = new Nodo(alumno);
        // Caso especial: lista vacía o el primer nodo tiene una carrera mayor que el nuevo nodo
        if (estaVacia() || inicio.getAlumno().getCarrera().compareTo(alumno.getCarrera()) > 0) {
            nuevoNodo.setSiguiente(inicio);
            inicio = nuevoNodo;
            y++;
        } else {
            Nodo actual = inicio;
            // Buscar la posición de inserción
            while (actual.getSiguiente() != null && actual.getSiguiente().getAlumno().getCarrera().compareTo(alumno.getCarrera()) <= 0) {
                actual = actual.getSiguiente();
            }    
            // Insertar el nuevo nodo después del nodo actual
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);      
            y++;
        }
    }
  
     public Boolean eliminaNodoxInicio(){
        Boolean nodoEliminado = Boolean.FALSE;
        if(inicio != null){
            inicio = inicio.getSiguiente();
            nodoEliminado= Boolean.TRUE;
            y--;
        }
        return nodoEliminado;
    }
     

     public Boolean eliminaNodoxFinal(){
        Boolean nodoEliminado = Boolean.FALSE;
             
        if(inicio != null){
            if(inicio.getSiguiente() == null){ 
                inicio = null;       
                nodoEliminado = Boolean.TRUE;
                y--;              
            }else{
                Nodo actual = inicio;
                Nodo anterior = null;
                while(actual.getSiguiente()!= null){
                    anterior = actual;
                    actual = actual.getSiguiente();
                }
                anterior.setSiguiente(null);
                nodoEliminado = Boolean.TRUE;
                y--;
            }
        } 
        return nodoEliminado;
    }
    
    public Alumno[] mostrarListaEnlazada() {     
        Nodo actual = inicio;
        elementos = new Alumno[y];
        int i = 0;
        while (actual != null) {
            elementos[i] = actual.getAlumno();
            actual = actual.getSiguiente();
            i++;
        }
        return elementos;
    }
    
}
