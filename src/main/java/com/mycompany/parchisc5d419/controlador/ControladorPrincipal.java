/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisc5d419.controlador;

import com.mycompany.parchisc5d419.vista.GUICredito;
import com.mycompany.parchisc5d419.vista.GUIHistoria;
import com.mycompany.parchisc5d419.vista.GUIInstrucciones;
import com.mycompany.parchisc5d419.vista.GUIJugador;
import com.mycompany.parchisc5d419.vista.GUIPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipal implements ActionListener {

    private GUIPrincipal guiPrincipal;
    private GUICredito guiCredito;
    private GUIInstrucciones guiInstrucciones;
    private GUIHistoria guiHistoria;
    private ControladorJuego controladorJuego;
    private GUIJugador guiJugador;

    public ControladorPrincipal() {
        guiPrincipal = new GUIPrincipal(this);
        guiPrincipal.setVisible(true);
        guiCredito = new GUICredito(this);
        guiInstrucciones = new GUIInstrucciones(this);
        guiHistoria = new GUIHistoria(this);
        guiJugador=new GUIJugador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Jugar":
                guiPrincipal.setVisible(false);
                guiJugador.setVisible(true);
                //controladorJuego = new ControladorJuego(guiPrincipal);
                break;
            case "Continuar":
                System.out.println(guiJugador.getCbColor());
                System.out.println(guiJugador.getTxJugador1());
                System.out.println(guiJugador.getTxJugador2());
                controladorJuego = new ControladorJuego(guiPrincipal,guiJugador.getCbColor(),guiJugador.getTxJugador1(),guiJugador.getTxJugador2());
                break;
            case "Instrucciones":
                guiPrincipal.setVisible(false);
                guiInstrucciones.setVisible(true);
                break;
            case "AtrasInstrucciones":
                guiInstrucciones.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
            case "Historia":
                guiPrincipal.setVisible(false);
                guiHistoria.setVisible(true);
                break;
            case "AtrasHistoria":
                guiHistoria.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
            case "Creditos":
                guiPrincipal.setVisible(false);
                guiCredito.setVisible(true);
                break;
            case "AtrasCreditos":
                guiCredito.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
            case "Salir":
                System.exit(0);
                break;
        }
    }

}//fin clase
