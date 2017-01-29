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
    private Habilidad habilidad;
    private ArrayList<Calificacion> calificaciones;

    /**
     * Constructor para objetos de la clase Destreza con dirección
     * @param
     * 'promedio' es el valor que mide que tan bueno es el maestro en dicha destreza
     * 'habilidad' es en lo que se destaca el maestro en la destreza
     */
    public Destreza( Habilidad habilidad) {
        this.habilidad = habilidad;
        calificaciones = new ArrayList<>();
    }

    /**
     * Método para conocer el primedio de la destreza
     * @return devuelve un float con el promedio de la destreza
     */
    public String getPromedio() {
        float promedio = 0;
        String retuProme;
        for (Calificacion calificacione : getCalificaciones()) {
            promedio = promedio + calificacione.getValoracion();
        }
        
        if (promedio <=0) {
            retuProme = "El maestro no registra calificaciones";
        }
        else{
            retuProme = (promedio/getCalificaciones().size())+"";
        }
        
        return retuProme;
    }


    /**
     * Método para conocer la habilidad de la destreza
     * @return devuelve un Habilidad con la habilidad de la destreza
     */
    public Habilidad getHabilidad() {
        return habilidad;
    }

    /**
     * @return the calificaciones
     */
    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
    }
    
   public void addCalificacion(Calificacion calificacion){
       
       calificaciones.add(calificacion);
   }

   
}
