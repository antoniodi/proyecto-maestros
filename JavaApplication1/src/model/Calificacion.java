/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Santiago
 */
public class Calificacion {
    private Comentario comentario;
    private int valoracion;

    /**
     * Constructor para objetos de la clase Calificación
     * @param
     * 'comentario' es un comentario asignado a la calificación
     * 'valoración' es un valor entre 0-5.
     */
    public Calificacion(Comentario comentario, int valoracion) {
        this.comentario = comentario;
        this.valoracion = valoracion;
    }

    /**
     * Método para conocer el comentario de la calificación
     * @return devuelve un Comentario con el comentario de la calificación
     */
    public Comentario getComentario() {
        return comentario;
    }

    /**
     * Método para modificar el comentario de la calificacón
     * @param
     * 'comentario' es un Comentario con el comentario que se va a asignar a la calificación
     */
    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    /**
     * Método para conocer la valoración de la calificación
     * @return devuelve un int con la valoración de la calificación
     */
    public int getValoracion() {
        return valoracion;
    }

    /**
     * Método para modificar la valoración de la calificacón
     * @param
     * 'valoracion' es un int con la valoración que se va a asignar a la calificación
     */
    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
}
