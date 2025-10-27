/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisc5d419.modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class BancoPregunta {

    private ArrayList<Pregunta> listaPregunta;

    public BancoPregunta() {
        listaPregunta = new ArrayList<Pregunta>();
    }

    public void crearPreguntas() {
        agregar(new Pregunta("¿Bruselas es la capital de belgica?", 0));
        agregar(new Pregunta("¿Carlos se va a quedar en ITM?", 0));
        agregar(new Pregunta("¿El tomate es una fruta?", 0));
        agregar(new Pregunta("¿Maria siempre llega temprano?", 1));
        agregar(new Pregunta("¿Es posible acceder a un atributo"
                + "privado directamente desde otra clase ?", 1));
        agregar(new Pregunta("¿La herencia permite reutilizar código en la programación orientada a objetos?", 0));
        agregar(new Pregunta("¿El método main en Java puede tener más de un parámetro?", 0));
        agregar(new Pregunta("¿La encapsulación consiste en ocultar los datos internos de una clase?", 0));
        agregar(new Pregunta("¿La palabra clave 'extends' en Java se usa para implementar una interfaz?", 1));
        agregar(new Pregunta("¿Roma es la capital de Francia?", 1));
        agregar(new Pregunta("¿El polimorfismo permite que un mismo método tenga comportamientos distintos?", 0));
        agregar(new Pregunta("¿Un constructor tiene siempre un valor de retorno entero?", 1));
        agregar(new Pregunta("¿Tokio es la capital de Japón?", 0));
        agregar(new Pregunta("¿La sobrecarga de métodos consiste en tener varios métodos con el mismo nombre pero distintos parámetros?", 0));
        agregar(new Pregunta("¿La palabra clave 'this' se usa para referirse al objeto actual?", 0));
        agregar(new Pregunta("¿Un objeto es una instancia de una clase?", 0));
    }

    public void agregar(Pregunta pregunta) {
        listaPregunta.add(pregunta);
    }

    public Pregunta getPregunta(int posicion) {
        return listaPregunta.get(posicion);
    }

    public int getElementos() {
        return listaPregunta.size();
    }
}
