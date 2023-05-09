/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.service;

import com.utp.proyecto.modelo.Persona;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author CHRISTOPHER
 */
public class main {
        public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        
        // Agregar personas a la lista
        Persona persona1 = new Persona("Reyminson", "Castro", "Cubas",45667889 ,35,"Casado", "Ingenieria de Sistemas");
        lista.agregarPersona(persona1);
        lista.mostrarLista();
        lista = new ListaCircular();
        Persona persona2 = new Persona("Christopher", "Zegarra", "Mendez",999067889 ,33,"Viudo", "Ingenieria de Software");
        lista.agregarPersona(persona2);
        /*
        Persona persona3 = new Persona("Carlos", "Gonzalez", 40);
        lista.agregarPersona(persona3);*/
        
        // Mostrar los elementos de la lista
        lista.mostrarLista();
    }
}
