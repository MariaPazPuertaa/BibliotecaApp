/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *
 * @author sant9
 * @since 20250312
 * @version 1.0.0
 */
public class Autor {
    /// Atributos
    /**
     * Editorial a la que pertenece el autor
     */
    private String editorial;
    
    /**
     * Profesión del autor del libro
     */
    private String profesion;
    
    /// Constructor
    public Autor(String editorial, String profesion) {
        this.editorial = editorial;
        this.profesion = profesion;
    }
    
    /**
     * Obtiene la editorial a la que pertenece el autor
     * @return Retorna su editorial
     */
    public String getEditorial() {
        return editorial;
    }
    
    /**
     * Obtiene la profesión del autor
     * @return Retorna su profesión
     */
    public String getProfesion() {
        return profesion;
    }
    
    /**
     * Establece la editorial a la que pertenece el autor
     * @param editorial 
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    /**
     * Establece la profesión del autor
     * @param profesion 
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
}
