/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

import java.util.ArrayList;

/**
 *
 * @author martin Taborda A
 * @since 20250312
 * @version 1.0.0
 */
public class Biblioteca {
    /// Atributos
    /**
     * Arreglo de libros
     */
    ArrayList<Libro> libros;
    
    /// Constructor
    public Biblioteca() {
        this.libros=new ArrayList<>();
    }
    
    /**
     * Genera y devuelve una cadena texto con la información de los libros almacenados en la lista
     * libros.
     * 
     * @return Retorna la información sobre los libros como el id y el título
     */
    public String mostrarLibros() {
        String resultado = "";
        for (int i = 0; i < libros.size(); i++) {
            resultado = resultado + "ID: " + libros.get(i).getId() + ", Título: " + libros.get(i).getTitulo() + "\n";
        }
        return resultado;
    }
    
    /**
     * Agrega un objeto de tipo libro a la lista de libros.
     * @param libro Objeto de tipo Libro
     * @return Retorna la lista en donde se almacenan los libros
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }
    
    /**
     * Busca un libro en la lista de libros por su id
     * @param id Identificador único del libro
     * @return Retorna el libro si el libro se encontro o retorna null si no fue encontrado
     */
    public Libro buscarLibro(long id) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                return libros.get(i);
            }
        }
        return null;
    }
    
    /**
     * Actualiza un libro nuevo en la lista si coincide el id
     * @param id Identificador único del libro
     * @param nuevoLibro Nuevo objeto libro para reemplazar el existente
     * @return Retorna true si se pudo actualizar el libro y false si no se encontro el libro a 
     * actualizar.
     */
    public boolean actualizarLibro(long id, Libro nuevoLibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.set(i, nuevoLibro);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Elimina el libro en la lista si coincide el id
     * @param id Identificador único del libro
     * @return Retorna true si se pudo eliminar el libro y false si no se encontro el libro a 
     * eliminar.
     */
    public boolean eliminarLibro(long id) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.remove(i);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Devuelve una lista de libros organizados alfabeticamente por el título del libro
     * @return Retorna una nueva lista con los libros organizados alfabeticamente
     */
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
    
    
    
    



