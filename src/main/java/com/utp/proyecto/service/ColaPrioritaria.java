/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.service;

import com.utp.proyecto.modelo.Alumno;
import com.utp.proyecto.modelo.Nodo;


public class ColaPrioritaria {
    private Nodo frente;
    private Alumno[] elementos;           
    private int y;

        
    public ColaPrioritaria() {
        this.frente = null;
        this.y = 0;
    }
        
    public boolean estaVacia() {
        return (frente == null);
    }    
    
    public void encolado(Alumno alumno) {
        Nodo nuevoNodo = new Nodo(alumno);
        if (estaVacia() || alumno.getPromedio() < 17) {
            Nodo actual = frente;
            while (actual.getSiguiente() != null) {      
                actual= actual.getSiguiente();
            }
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
            y++;
        } else {
            Nodo actual = frente;
            while (actual.getSiguiente() != null && actual.getSiguiente().getAlumno().getPromedio() >= 17) {
                actual = actual.getSiguiente();
            }
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
            y++;
        }        
    }
    
    public void desencolar(){
        if (!estaVacia()) {
            Nodo nodoEliminado = frente;
            frente = frente.getSiguiente();
            y--;
        }
    }
        
    public Alumno[] mostrarCola() {
        Nodo actual = frente;
        elementos = new Alumno[y];
        int i = 0;
        while (actual != null) {
            elementos[i] = actual.getAlumno();
            actual = actual.getSiguiente();
            i++;
        }
        return elementos;
    }
    
        
    public void encolar(Alumno alumno) {
        Nodo nuevoNodo = new Nodo(alumno);
        if (estaVacia() || alumno.getPromedio() > frente.getAlumno().getPromedio()) {
            nuevoNodo.setSiguiente(frente);
            frente = nuevoNodo;
            y++;
        } else {
            Nodo actual = frente;
            while (actual.getSiguiente() != null && alumno.getPromedio() <= actual.getSiguiente().getAlumno().getPromedio()) {
                actual = actual.getSiguiente();
            }
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
            y++;
        }        
    }
}
