/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisc5d419.controlador;

import com.mycompany.parchisc5d419.modelo.AreaJuego;
import com.mycompany.parchisc5d419.modelo.Ficha;
import com.mycompany.parchisc5d419.modelo.Posicion;
import com.mycompany.parchisc5d419.vista.GUIJuego;
import com.mycompany.parchisc5d419.vista.GUIPrincipal;
import com.mycompany.parchisc5d419.vista.PanelControl;
import com.mycompany.parchisc5d419.vista.PanelJuego;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class ControladorJuego implements ActionListener, MouseListener {

    private GUIJuego guiJuego;
    private PanelJuego panelJuego;
    private PanelControl panelControl;
    private GUIPrincipal guiPrincipal;
    private Ficha ficha;
    private AreaJuego areaJuego;

    //Turnos
    private int turnoActual = 0; // 0 = Jugador 1, 1 = Jugador 2
    private String[] jugadores = {"Jugador 1", "Jugador 2"};
    private String[] colores = {"Amarillo", "Azul"};

    public ControladorJuego(GUIPrincipal guiPrincipal) {
        this.guiPrincipal = guiPrincipal;
        guiJuego = new GUIJuego(this);
        guiJuego.setVisible(true);
        panelJuego = guiJuego.getPanelJuego();
        panelControl = guiJuego.getPanelControl();
        areaJuego = new AreaJuego();
        ficha = new Ficha(new Posicion(100, 100), new ImageIcon("./src/main/resources/img/pieceyellow.png"), "Amarillo");
        //(453,468)
    }

    public void dibujar(Component c, Graphics g) {
        ficha.dibujar(c, g);
        areaJuego.dibujar(c, g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Dado":
                int dado = (int) (Math.random() * 6) + 1;
                System.out.println("\n========== TURNO ==========");
                System.out.println("Jugador: " + jugadores[turnoActual]);
                System.out.println("Color: " + colores[turnoActual]);
                System.out.println("Resultado dado: " + dado);
                System.out.println("==========================\n");

                //Cambia de turno
                turnoActual = (turnoActual + 1) % 2;
                break;
            case "Atras":
                guiJuego.dispose();
                guiPrincipal.setVisible(true);
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("X " + e.getX() + "Y " + e.getY());
        ficha.getPosicion().setX(e.getX());
        ficha.getPosicion().setY(e.getY());
        panelJuego.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
