/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisc5d419.modelo;

/**
 *
 * @author Usuario
 */
public class Jugador {

    private String nombre;
    private String color;
    private int puntaje;

    public Jugador(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        puntaje = 5;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getPuntaje() {
        return puntaje;
    }

    

}
