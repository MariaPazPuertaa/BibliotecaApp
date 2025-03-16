/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *
 * @author marti
 * @since 20250312
 * @version 1.0.0
 */
public class Libro {
    /// Atributos
    /**
     * id del libro
     */
    private long id;
    /**
     * titulo del libro
     */
    private String titulo;

    /// Constructor
    public Libro(long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
