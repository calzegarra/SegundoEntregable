/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.service;

import com.utp.proyecto.modelo.Alumno;
import com.utp.proyecto.modelo.Nodo;

/**
 * Pilas con Listas enlazadas
 */
public class Pila {
    private Nodo tope;
    private Alumno elementos[];
    private int y;

    public Pila() {
        this.tope = null;
        this.y = 0;
    }
    
    public boolean estaVacia() {
        return tope == null;
    }    
    
    public void apilar(Alumno alumno) {
        Nodo nuevoNodo = new Nodo(alumno);
        if (estaVacia()) {
            tope = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(tope);
            tope = nuevoNodo;
        }
        y++;
        System.out.println("Alumno " + alumno.getNombre() + " apilado correctamente.");
    }
    
    public void desapilar() {
        if (!estaVacia()) {
            Nodo nodoDesapilado = tope;
            tope = tope.getSiguiente();
            System.out.println("Alumno " + nodoDesapilado.getAlumno().getNombre() + " desapilado correctamente.");
            y--;
        }
    }
    
    
    public Alumno[] mostrarPilaEnNodo() {
        Nodo nodoActual = tope; 
        int i = 0;
        elementos = new Alumno[y];
        while (nodoActual != null) {
            elementos[i]= nodoActual.getAlumno();
            nodoActual = nodoActual.getSiguiente();
            i++;
        }
        return elementos;
    }
}
