package com.utpl.centrovideojuegos;

import java.util.Scanner;

public class CentroVideojuegos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String jugador = leer.nextLine();
        System.out.println("Bienvenido " +jugador+ ". Elije uno de los siguientes juegos: Asteroids, HERO, Adventure.");
        String juego = leer.nextLine();
        
        if (("Asteroid".equals(juego)) || (("HERO".equals(juego))) || ("Adventure".equals(juego))) {
            System.out.println("Ingrese su puntaje: ");
            String puntaje = leer.nextLine();
            System.out.println("El puntaje de " +jugador+ " es de: "+puntaje);
            
        } else {
            System.out.println("Los juegos descritos no son existentes. Intentelo de nuevo");
            System.exit(0);
        }
        

        }

    }

