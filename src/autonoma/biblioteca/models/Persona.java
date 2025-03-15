/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *
 * @author Maria Paz Puerta
 * @since 20250312
 * @version 1.0.0
 */
public abstract class Persona {
    ///////////////////////////////////////////////////////////////////////////////////////////////
    //// Atributos
    
    /**
     * Nombre de la persona
     */
    private String nombre;
    
    /**
     * Documento de identidad de la persona
     */
    private String documentoIdentidad;
    
    /**
     * Email de la persona
     */
    private String correoElectronico;
    
    /// Constructor
    public Persona(String nombre, String documentoIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico = correoElectronico;
    }
    
    /**
     * Obtiene el nombre de la persona
     * @return Retorna su nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre de la persona
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el documento de identidad de la persona
     * @return Retorna su documento de identidad
     */
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
    
    /**
     * Establce el documento de identidad de la persona
     * @param documentoIdentidad 
     */
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    
    /**
     * Obtiene el correo electrónico de la persona
     * @return Retorna su correo electrónico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    /**
     * Establece el correo electrónico de la persona 
     * @param correoElectronico 
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    
}
