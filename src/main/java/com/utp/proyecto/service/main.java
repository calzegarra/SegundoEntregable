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
 * @author CHRISTOPHER
 */
public class main {
        public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        
        // Agregar personas a la lista
        Persona persona1 = new Persona("Reyminson", "Castro", "Cubas",45667889 ,35,"Casado", "Ingenieria de Sistemas");
        Persona persona2 = new Persona("Christopher", "Zegarra", "Mendez",999067889 ,33,"Viudo", "Ingenieria de Software");
        
        //List<Persona> lp = Arrays.asList(persona1,persona2);
        List<Nodo> ln = Arrays.asList(lista.agregarPersona(persona1),lista.agregarPersona(persona2));
        lista.mostrarLista(ln);
    }
}
