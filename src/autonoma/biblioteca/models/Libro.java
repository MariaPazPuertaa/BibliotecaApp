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
        private static long idContador = 1;
        private long id;
        private Autor autor; // Atributo de tipo Autor
        /**
         * titulo del libro
         */
        private String titulo;

        /// Constructor
        public Libro(String titulo) {
            this.id = idContador++;
            this.titulo = titulo;
        }

        public long getId() {
            return id;
        }

        public String getTitulo() {
            return titulo;
        }

        

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        public Autor getAutor() {
            return autor; // Devuelve el autor del libro
        }

        public void setAutor(Autor autor) {
            this.autor = autor; // Asigna un autor al libro
        }
    
    
    }
