/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.BibliotecaApp.main;

import autonoma.biblioteca.models.Autor;
import autonoma.biblioteca.models.Biblioteca;
import autonoma.biblioteca.models.Libro;
import autonoma.biblioteca.views.VentanaPrincipal;


public class BibliotecaApp {
    
    public static void main(String[] args) {
        //  Se crean los objetos principales
        Biblioteca biblioteca = new Biblioteca();
        Autor autor = new Autor(" ", " ", " ", " ", " ");
        Libro libro = new Libro(" ", autor);
        biblioteca.agregarLibro(libro);
        

        //  Luego se muestra la ventana principal con los datos ingresados
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(biblioteca, libro, autor);
        ventanaPrincipal.setVisible(true);
    }
}
