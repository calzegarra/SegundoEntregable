/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.proyecto.modelo;


public enum EnumAlumno {
 
    ALUMNO_1("Zulma","Rodriguez","Santillan",28242751,24,"Divorciado", "Ingenieria de Sistemas" ),
    ALUMNO_2("Esteban","Piscoya","Villa",28546311,24,"Casado", "Ingenieria de Sistemas" ),
    ALUMNO_3("Saul","Gutierrez","Reyes",93621671,31,"Casado", "Derecho"),
    ALUMNO_4("Tania","Toledo","De la Cruz",38682711,25,"Soltero", "Ingenieria Industrial" ),
    ALUMNO_5("Carlos","Santana","Cardenas",58242711,21,"Viudo", "Ingenieria de Sistemas" ),
    ALUMNO_6("Jorge","Gonzalez","Tanta",91321671,32,"Divorciado", "Turismo" ),
    ALUMNO_7("Xiomara","Sanchez","Vega",18937711,35,"Soltero", "Diseño Grafico" ),
    ALUMNO_9("Carlos","Aguirre","Vega",18937333,31,"Soltero", "Diseño Grafico" ),
    ALUMNO_8("Carlos","Villanueva","Sullon",93257711,28,"Soltero", "Diseño Grafico" );
    
    private String nombre;
    private String apePaterno; 
    private String apeMaterno; 
    private Integer dni; 
    private Integer edad; 
    private String estadoCivil;      
    private String carrera; 

    private EnumAlumno(String nombre, String apePaterno, String apeMaterno, Integer dni, Integer edad, String estadoCivil, String carrera) {
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.dni = dni;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.carrera = carrera;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
