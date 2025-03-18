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
public class Autor extends Persona {
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
    public Autor(String editorial, String profesion, String nombre, String documentoIdentidad, String correoElectronico) {
        super(nombre, documentoIdentidad, correoElectronico);
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
    //@author marti

    @Override
    public void setCorreoElectronico(String correoElectronico) {
        super.setCorreoElectronico(correoElectronico); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDocumentoIdentidad(String documentoIdentidad) {
        super.setDocumentoIdentidad(documentoIdentidad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNombre() {
        return super.getNombre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getDocumentoIdentidad() {
        return super.getDocumentoIdentidad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCorreoElectronico() {
        return super.getCorreoElectronico(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
