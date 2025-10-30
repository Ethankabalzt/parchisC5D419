/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisc5d419.modelo;

import java.awt.Component;
import java.awt.Graphics;

/**
 *
 * @author Usuario
 */
public class AreaJuego {
    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;

    public AreaJuego(String colorJugador1, String nombreJugador1, String nombreJugador2) {
        tablero=new Tablero();
        crearJugadores(colorJugador1,nombreJugador1,nombreJugador2);
        tablero.crearCasas(colorJugador1);
    }
    
    public void crearJugadores(String colorJugador1, String nombreJugador1, String nombreJugador2){
        switch(colorJugador1){
            case "Amarillo":
                jugador1=new Jugador(nombreJugador1,colorJugador1);
                jugador2=new Jugador(nombreJugador2,"Rojo");
                break;
            case "Azul":
                jugador1=new Jugador(nombreJugador1,colorJugador1);
                jugador2=new Jugador(nombreJugador2,"Verde");
                break;
            case "Rojo":
                jugador1=new Jugador(nombreJugador1,colorJugador1);
                jugador2=new Jugador(nombreJugador2,"Amarillo");
                break;
            case "Verde":
                jugador1=new Jugador(nombreJugador1,colorJugador1);
                jugador2=new Jugador(nombreJugador2,"Azul");
                break;
        }
    }
    
    public void dibujar(Component componente, Graphics g){
    tablero.dibujar(componente, g);
    }
    
    
}
