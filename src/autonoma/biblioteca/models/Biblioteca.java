/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

import java.util.ArrayList;

/**
 *
 * @author Maria Paz Puerta
 */
public class Biblioteca {
    ArrayList<Libro> libros;
    
    public Biblioteca() {
        this.libros=new ArrayList<>();
    }
    public String mostrarLibros() {
        String resultado = "";
        for (int i = 0; i < libros.size(); i++) {
            resultado = resultado + "ID: " + libros.get(i).getId() + ", Título: " + libros.get(i).getTitulo() + "\n";
        }
        return resultado;
    }

    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    public Libro buscarLibro(long id) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                return libros.get(i);
            }
        }
        return null;
    }

    public boolean actualizarLibro(long id, Libro nuevoLibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.set(i, nuevoLibro);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarLibro(long id) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        ArrayList<Libro> ordenados = new ArrayList<>();
        for (int i = 0; i < libros.size(); i++) {
            ordenados.add(libros.get(i));
        }
        for (int i = 0; i < ordenados.size() - 1; i++) {
            for (int j = i + 1; j < ordenados.size(); j++) {
                if (ordenados.get(i).getTitulo().compareTo(ordenados.get(j).getTitulo()) > 0) {
                    Libro temp = ordenados.get(i);
                    ordenados.set(i, ordenados.get(j));
                    ordenados.set(j, temp);
                }
            }
        }
        return ordenados;
    }
}
    
    
    
    



