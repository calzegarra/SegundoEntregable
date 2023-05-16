/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.service;

import com.utp.proyecto.modelo.Nodo;
import com.utp.proyecto.modelo.Persona;
import java.util.*;
/**
 * Implementar una Lista Enlazada con nodos que se insertan de Manera ordenada 
 * en relacion a un atributo de la clase lista de acuerdo al tema que le toca (Alumnos)
 * Las colas y las Pilas deben tener las siguientes funcionalidades:
 *   - Simulacion de eliminación de objetos
 *   - Simulacion de insercion de objetos
 *   - Opción para mostrar los datos completos 
 * Implementar una cola con Arreglos Estaticos
 * Implementar una Pila con listas enlazadas simples
 * Implementar una cola circular con arreglos estaticos (INVESTIGACION)
 * Implementar una cola con Prioridad con listas enlazadas (INVESTIGACION)
 * 
 * @author CHRISTOPHER
 */
public class ListaCircular {
    private Nodo inicio;
    
    // Constructor
    public ListaCircular() {
        inicio = null;
    }
    
    // Método para agregar una persona al final de la lista
    public Nodo agregarPersona(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);
        if (inicio == null) {
            // La lista está vacía
            inicio = nuevoNodo;
            nuevoNodo.setSiguiente(inicio);
        } else {
            // Recorre la lista hasta el último nodo
            Nodo actual = inicio;
            while (actual.getSiguiente() != inicio) {
                actual = actual.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista
            actual.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(inicio);
        }
        return inicio;
    }
    
       public void mostrarLista(List<Nodo> listas) {  
           if (listas.isEmpty()) {
              System.out.println("La lista está vacía."); 
           }else {    
               for (Nodo actual : listas) {  
                   System.out.println("NODO: " + actual.getSiguiente());     
                   System.out.println("Nombre: " + actual.getPersona().getNombre());               
                   System.out.println("Apellido: " + actual.getPersona().getApePaterno());      
                   System.out.println("Edad: " + actual.getPersona().getEdad());               
                   System.out.println("-------------------------");                                       
               }               
           } 
       }
  }
       
/*
    // Método para mostrar los elementos de la lista
    public void mostrarLista() {
        if (inicio == null) {
            System.out.println("La lista está vacía.");
        } else {
            Nodo actual = inicio;
            
            do {
                System.out.println("Nombre: " + actual.getPersona().getNombre());
                System.out.println("Apellido: " + actual.getPersona().getApellido());
                System.out.println("Edad: " + actual.getPersona().getEdad());
                System.out.println("-------------------------");
                
}

}*/
        