/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.BibliotecaApp.main;

import autonoma.biblioteca.models.Biblioteca;
import autonoma.biblioteca.views.VentanaPrincipal;

/**
 *
 * @author marti
 */
public class BibliotecaApp {
    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}
