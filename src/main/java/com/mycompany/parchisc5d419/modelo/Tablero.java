/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisc5d419.modelo;

import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Graphics;

/**
 *
 * @author Usuario
 */
public class Tablero {

    private Celda[] tablero;
    private Casa casaJugador1;
    private Casa casaJugador2;

    public Tablero() {
        tablero = new Celda[69];
        iniciar();
    }

    public void iniciar() {
        int x = 351;
        int y = 589;
        for (int indice = 0; indice < 4; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "Negro"));
            y -= 30;
        }
        tablero[4] = new CeldaEspecialColor(new Posicion(x, y), "Salida Amarillo", "Amarillo");
        //tablero[4].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack1.png"), "Negro"));
        y -= 30;

        for (int indice = 5; indice < 8; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "Negro"));
            y -= 30;
        }
        x = 383;
        y = 349;
        for (int indice = 8; indice < 11; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "Negro"));
            x += 30;
        }
        tablero[11] = new CeldaEspecial(new Posicion(x, y), "Zona Segura");
        //tablero[11].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack1.png"), "Negro"));

        x += 30;

        for (int indice = 12; indice < 16; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            x += 30;
        }
        y -= 50;
        x -= 30;
        tablero[16] = new CeldaEspecial(new Posicion(x, y), "Meta Azul");
        //tablero[16].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack1.png"), "negra"));

        y -= 50;
        for (int indice = 17; indice < 21; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            x -= 30;
        }
        tablero[21] = new CeldaEspecial(new Posicion(x, y), "Inicio Azul");
        //tablero[21].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack1.png"), "negra"));
        x -= 30;

        for (int indice = 22; indice < 25; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            x -= 30;
        }

        y -= 35;
        x -= 5;
        for (int indice = 25; indice < 28; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            y -= 30;
        }

        tablero[28] = new CeldaEspecial(new Posicion(x, y), "zona segura");
        //tablero[28].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack1.png"), "negra"));
        y -= 30;

        for (int indice = 29; indice < 33; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            y -= 30;
        }
        x -= 50;
        y += 30;
        for (int indice = 33; indice < 35; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            x -= 50;
        }

        x += 50;
        y += 30;

        for (int indice = 35; indice < 38; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            y += 30;
        }

        tablero[39] = new CeldaEspecial(new Posicion(x, y), "Inicio Rojo");
        //tablero[39].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack1.png"), "negra"));
        y += 30;

        for (int indice = 40; indice < 43; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            y += 30;
        }

        y += 5;
        x -= 40;
        for (int indice = 43; indice < 46; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            x -= 30;
        }

        tablero[46] = new CeldaEspecial(new Posicion(x, y), "zona segura");
        //tablero[46].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack1.png"), "negra"));
        x -= 30;

        for (int indice = 47; indice < 51; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            x -= 30;
        }
        y += 50;
        x += 30;
        tablero[51] = new CeldaEspecial(new Posicion(x, y), "zona segura");
        //tablero[51].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack1.png"), "negra"));
        y += 50;

        for (int indice = 52; indice < 56; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            x += 30;
        }

        tablero[56] = new CeldaEspecial(new Posicion(x, y), "Inicio Verde");
        //tablero[56].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack1.png"), "negra"));
        x += 30;

        for (int indice = 57; indice < 60; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            x += 30;
        }

        y += 35;
        x += 5;

        for (int indice = 60; indice < 63; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            y += 30;
        }

        tablero[63] = new CeldaEspecial(new Posicion(x, y), "Zona Segura");
        //tablero[63].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack1.png"), "negra"));
        y += 30;

        for (int indice = 64; indice < 68; indice++) {
            tablero[indice] = new Celda(new Posicion(x, y));
            //tablero[indice].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack.png"), "negra"));
            y += 30;
        }
        y -= 30;
        x += 50;

        tablero[68] = new CeldaEspecial(new Posicion(x, y), "Zona Segura");
        //tablero[68].setFicha(new Ficha(new Posicion(x, y), new ImageIcon("./src/main/resources/img/pieceblack1.png"), "negra"));

    }//fin iniciar

    public void crearCasas(String colorJugador1) {
        if (colorJugador1.equals("Amarillo")) {
            casaJugador1 = new Casa("Amarillo");
            casaJugador1.setFicha(0, new Ficha(new Posicion(455, 462), new ImageIcon("./src/main/resources/img/pieceyellow.png"), "Amarillo"));
            casaJugador1.setFicha(1, new Ficha(new Posicion(540, 462), new ImageIcon("./src/main/resources/img/pieceyellow.png"), "Amarillo"));
            casaJugador1.setFicha(2, new Ficha(new Posicion(455, 526), new ImageIcon("./src/main/resources/img/pieceyellow.png"), "Amarillo"));
            casaJugador1.setFicha(3, new Ficha(new Posicion(540, 526), new ImageIcon("./src/main/resources/img/pieceyellow.png"), "Amarillo"));
            casaJugador2 = new Casa("Rojo");
            casaJugador2.setFicha(0, new Ficha(new Posicion(40, 54), new ImageIcon("./src/main/resources/img/piecered.png"), "Rojo"));
            casaJugador2.setFicha(1, new Ficha(new Posicion(131, 54), new ImageIcon("./src/main/resources/img/piecered.png"), "Rojo"));
            casaJugador2.setFicha(2, new Ficha(new Posicion(40, 124), new ImageIcon("./src/main/resources/img/piecered.png"), "Rojo"));
            casaJugador2.setFicha(3, new Ficha(new Posicion(131, 124), new ImageIcon("./src/main/resources/img/piecered.png"), "Rojo"));
        }

        if (colorJugador1.equals("Rojo")) {
            casaJugador1 = new Casa("Rojo");
            casaJugador1.setFicha(0, new Ficha(new Posicion(40, 54), new ImageIcon("./src/main/resources/img/piecered.png"), "Rojo"));
            casaJugador1.setFicha(1, new Ficha(new Posicion(131, 54), new ImageIcon("./src/main/resources/img/piecered.png"), "Rojo"));
            casaJugador1.setFicha(2, new Ficha(new Posicion(40, 124), new ImageIcon("./src/main/resources/img/piecered.png"), "Rojo"));
            casaJugador1.setFicha(3, new Ficha(new Posicion(131, 124), new ImageIcon("./src/main/resources/img/piecered.png"), "Rojo"));
            casaJugador2 = new Casa("Amarillo");
            casaJugador2.setFicha(0, new Ficha(new Posicion(455, 462), new ImageIcon("./src/main/resources/img/pieceyellow.png"), "Amarillo"));
            casaJugador2.setFicha(1, new Ficha(new Posicion(540, 462), new ImageIcon("./src/main/resources/img/pieceyellow.png"), "Amarillo"));
            casaJugador2.setFicha(2, new Ficha(new Posicion(455, 526), new ImageIcon("./src/main/resources/img/pieceyellow.png"), "Amarillo"));
            casaJugador2.setFicha(3, new Ficha(new Posicion(540, 526), new ImageIcon("./src/main/resources/img/pieceyellow.png"), "Amarillo"));
        }
        if (colorJugador1.equals("Azul")) {
            casaJugador1 = new Casa("Azul");
            casaJugador1.setFicha(0, new Ficha(new Posicion(455, 54), new ImageIcon("./src/main/resources/img/pieceblue.png"), "Azul"));
            casaJugador1.setFicha(1, new Ficha(new Posicion(540, 54), new ImageIcon("./src/main/resources/img/pieceblue.png"), "Azul"));
            casaJugador1.setFicha(2, new Ficha(new Posicion(455, 124), new ImageIcon("./src/main/resources/img/pieceblue.png"), "Azul"));
            casaJugador1.setFicha(3, new Ficha(new Posicion(540, 124), new ImageIcon("./src/main/resources/img/pieceblue.png"), "Azul"));
            casaJugador2 = new Casa("Verde");
            casaJugador2.setFicha(0, new Ficha(new Posicion(40, 462), new ImageIcon("./src/main/resources/img/piecegreen.png"), "Verde"));
            casaJugador2.setFicha(1, new Ficha(new Posicion(131, 462), new ImageIcon("./src/main/resources/img/piecegreen.png"), "Verde"));
            casaJugador2.setFicha(2, new Ficha(new Posicion(40, 526), new ImageIcon("./src/main/resources/img/piecegreen.png"), "Verde"));
            casaJugador2.setFicha(3, new Ficha(new Posicion(131, 526), new ImageIcon("./src/main/resources/img/piecegreen.png"), "Verde"));

        }

        if (colorJugador1.equals("Verde")) {
            casaJugador1 = new Casa("Verde");
            casaJugador1.setFicha(0, new Ficha(new Posicion(40, 462), new ImageIcon("./src/main/resources/img/piecegreen.png"), "Verde"));
            casaJugador1.setFicha(1, new Ficha(new Posicion(131, 462), new ImageIcon("./src/main/resources/img/piecegreen.png"), "Verde"));
            casaJugador1.setFicha(2, new Ficha(new Posicion(40, 526), new ImageIcon("./src/main/resources/img/piecegreen.png"), "Verde"));
            casaJugador1.setFicha(3, new Ficha(new Posicion(131, 526), new ImageIcon("./src/main/resources/img/piecegreen.png"), "Verde"));
            casaJugador2 = new Casa("Azul");
            casaJugador2.setFicha(0, new Ficha(new Posicion(455, 54), new ImageIcon("./src/main/resources/img/pieceblue.png"), "Azul"));
            casaJugador2.setFicha(1, new Ficha(new Posicion(540, 54), new ImageIcon("./src/main/resources/img/pieceblue.png"), "Azul"));
            casaJugador2.setFicha(2, new Ficha(new Posicion(455, 124), new ImageIcon("./src/main/resources/img/pieceblue.png"), "Azul"));
            casaJugador2.setFicha(3, new Ficha(new Posicion(540, 124), new ImageIcon("./src/main/resources/img/pieceblue.png"), "Azul"));
        }
    }

    public void dibujar(Component componente, Graphics g) {
        casaJugador1.dibujar(componente, g);
        casaJugador2.dibujar(componente, g);

        for (int indice = 0; indice < tablero.length; indice++) {
            if (tablero[indice] != null) {//indica si en esa posicion se creo la celda
                if (tablero[indice].getFicha() != null) {
                    tablero[indice].getFicha().dibujar(componente, g);
                }
            }
        }
    }

    public boolean isContain(int x, int y) {
        for (int index = 0; index < casaJugador1.getCantidadFichas(); index++) {
            if (casaJugador1.getFicha(index) != null) {
                if (casaJugador1.getFicha(index).isContainer(x, y)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public int getIndexFicha(int x, int y){
        for (int index = 0; index < casaJugador1.getCantidadFichas(); index++) {
            if (casaJugador1.getFicha(index) != null) {
                if (casaJugador1.getFicha(index).isContainer(x, y)) {
                    return index;
                }
            }
        } 
     return -1;
     
    }

}
