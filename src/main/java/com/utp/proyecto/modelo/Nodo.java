/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.modelo;

public class Nodo {
    private Alumno alumno;
    private Nodo siguiente;
    
    public Nodo(Alumno alumno) {
        this.alumno = alumno;
        this.siguiente = null;
    }
    
    // Métodos getter y setter
    public Alumno getAlumno() {
        return alumno;
    }
    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}