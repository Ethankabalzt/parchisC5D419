/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisc5d419.modelo;

/**
 *
 * @author Usuario
 */
public class Pregunta {
    private String enunciado;
    private int respuesta;

    public Pregunta() {
    }
    
    public Pregunta(String enunciado, int respuesta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
    
    
    
    
}
