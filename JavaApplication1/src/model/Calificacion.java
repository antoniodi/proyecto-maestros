/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JULIZ T
 */
public class Calificacion {
    
    private Comentario comentario;
    private int valoracion;

    public Calificacion(Comentario comentario, int valoracion) {
        this.comentario = comentario;
        this.valoracion = valoracion;
        
        
        
    }

    /**
     * @return the comentario
     */
    public Comentario getComentario() {
        return comentario;
    }

    /**
     * @return the valoracion
     */
    public int getValoracion() {
        return valoracion;
    }
    
}
