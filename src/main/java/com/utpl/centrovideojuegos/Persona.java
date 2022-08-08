
package com.utpl.centrovideojuegos;


public class Persona {
    
    public String nombre;
    public String apellido;
    public int edad;
    public int numeroCelular;
    
    public Persona (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroCelular = numeroCelular;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getNumeroCeular(){
        return numeroCelular;
    }
}
