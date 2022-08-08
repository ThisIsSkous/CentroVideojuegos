
package com.utpl.centrovideojuegos;


public class Jugador extends Persona{
    
    String nick;
    float puntaje;

    public Jugador(String nick, String nombre, String apellido, int edad, int numeroCelular) {
        super(nombre, apellido, edad);
        this.nick = nick;
        this.puntaje = puntaje;
    }

    public String getNick() {
        return nick;
    }
    
    public float getPuntaje(){
   return puntaje;  
    }
}
       

        
        
    

    

