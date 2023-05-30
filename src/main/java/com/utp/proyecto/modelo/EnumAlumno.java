/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.modelo;


public enum EnumAlumno {
 
    ALUMNO_1("U20122980","Reyminson", "Castro",27, "Ingenieria de Sistemas", 17.5),
    ALUMNO_2("U20121971","Christopher", "Zegarra",31, "Ingenieria de Software", 18),
    ALUMNO_3("U20125718","Camila", "Diaz",25, "Derecho", 19.5),
    ALUMNO_4("U20120011","Eliane", "Ramos",22, "Arquitectura", 15),
    ALUMNO_5("U20123133","Carlos", "Pacheco",24, "Arquitectura", 16),
    ALUMNO_6("U20122261","Renato", "Loayza",24,"Arte", 13.7),
    ALUMNO_7("U20127133","Manuel", "Quispe",21, "Arte", 13.7);
    
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

    private EnumAlumno(String codigo, String nombre, String apellido, Integer edad, String carrera, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

}
