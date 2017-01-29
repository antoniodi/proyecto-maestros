/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Santiago
 */
public class Destreza {
    private float promedio;
    private Habilidad habilidad;
    private ArrayList<Calificacion> calificaciones;

    /**
     * Constructor para objetos de la clase Destreza con dirección
     * @param
     * 'promedio' es el valor que mide que tan bueno es el maestro en dicha destreza
     * 'habilidad' es en lo que se destaca el maestro en la destreza
     */
    public Destreza( Habilidad habilidad) {
        this.promedio = 0;
        this.habilidad = habilidad;
    }

    /**
     * Método para conocer el primedio de la destreza
     * @return devuelve un float con el promedio de la destreza
     */
    public float getPromedio() {
        for (Calificacion calificacione : calificaciones) {
            promedio = promedio + calificacione.getValoracion();
        }
       
        return promedio/calificaciones.size();
    }


    /**
     * Método para conocer la habilidad de la destreza
     * @return devuelve un Habilidad con la habilidad de la destreza
     */
    public Habilidad getHabilidad() {
        return habilidad;
    }

   
}
