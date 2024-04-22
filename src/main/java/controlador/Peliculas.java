/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author alumno
 */
public class Peliculas {
   private String nombre;
    private String clasificacion;
    private String subtitulado;
    private String idioma;
    private String tipo;
    private String precio;
    

    public Peliculas() {
    }

    @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombre + ", clasificacion=" + clasificacion + ", subtitulado=" + subtitulado + "idioma=" + idioma + ", tipo=" + tipo + ", precio=" + precio + '}';
    }

    public String getnombre() {
        return nombe;
    }

    public void setCodigo_curso(String codigo_curso) {
        this.codigo_curso = codigo_curso;
    } 
}
