/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.modelo;

public class Alumno implements Comparable<Alumno>{
    private String codigo;
    private String nombre;
    private String apellido; 
    private Integer edad; 
    private String carrera; 
    private double promedio;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Alumno(String codigo, String nombre, String apellido, Integer edad, String carrera, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }



    @Override
    public int compareTo(Alumno otro) {
        // Ordenar por promedio de forma descendente
        if (this.promedio < otro.getPromedio()) {
            return 1;
        } else if (this.promedio > otro.getPromedio()) {
            return -1;
        } else {
            return 0;
        }
    }
    
}       
