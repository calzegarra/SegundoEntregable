/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.modelo;

/**
 *
 * @author CHRISTOPHER
 */
public class Nodo {
    private Persona persona;
    private Nodo siguiente;
    
    public Nodo(Persona persona) {
        this.persona = persona;
        this.siguiente = null;
    }
    
    // Métodos getter y setter
    public Persona getPersona() {
        return persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}