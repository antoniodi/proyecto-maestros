/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
/**
 *
 * @author Santiago
 */
public class Proyecto {
    private Cliente cliente;
    private Maestro maestro;
    private long fechaDeInicio;
    private long fechaLimite;
    private String ubicacion;
    private Obra obra;
    private String descripcion;
    private ArrayList<Comentario> comentarios;
    private Calificacion calificacion;
    private int plazo;
    private String materiales;

    /**
     * Constructor para objetos de la clase Proyecto
     * @param
     * 'cliente' es el cliente que ha creado el proyecto
     * 'maestro' es el maestro a cargo del proyecto
     * 'fechaDeInicio' es la fecha en la que se comienza la ejecución del proyecto
     * 'fechaLimite' es la fecha que se debe cumplir para culminar el proyecto
     * 'ubicacion' se refiere a donde se realiza el proyecto
     * 'obra' es el tipo de obra en que se basa el proyecto
     * 'plazo' es el tiempo que se tiene para tomar el proyecto
     * 'materiales' son los materiales con los que se cuenta para realizar el proyecto
     */
    public Proyecto(Cliente cliente, Maestro maestro, long fechaDeInicio, long fechaLimite, String ubicacion, Obra obra, int plazo, String materiales) {
        this.cliente = cliente;
        this.maestro = maestro;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaLimite = fechaLimite;
        this.ubicacion = ubicacion;
        this.obra = obra;
        this.plazo = plazo;
        this.materiales = materiales;
    }

    /**
     * Método para conocer el cliente del proyecto
     * @return devuelve un Cliente con el cliente del proyecto
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Método para modificar el cliente del proyecto
     * @param
     * 'cliente' es un Cliente con el cliente que se va a asignar al protecto
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Método para conocer el maestro del proyecto
     * @return devuelve un Maestro con el maestro del proyecto
     */
    public Maestro getMaestro() {
        return maestro;
    }

    /**
     * Método para modificar el maestro del proyecto
     * @param
     * 'maestro' es un Maestro con el maestro que se va a asignar al protecto
     */
    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    /**
     * Método para conocer la fecha de inicio del proyecto
     * @return devuelve un long con la fecha de inicio del proyecto
     */
    public long getFechaDeInicio() {
        return fechaDeInicio;
    }

    /**
     * Método para modificar la fecha de inicio del proyecto
     * @param
     * 'fechaDeInicio' es un long con la fecha de inicio que se va a asignar al protecto
     */
    public void setFechaDeInicio(long fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    /**
     * Método para conocer la fecha limite del proyecto
     * @return devuelve un long con la fecha limite del proyecto
     */
    public long getFechaLimite() {
        return fechaLimite;
    }

    /**
     * Método para modificar la fecha limite del proyecto
     * @param
     * 'fechaLimite' es un long con la fecha limite que se va a asignar al protecto
     */
    public void setFechaLimite(long fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * Método para conocer la ubicación del proyecto
     * @return devuelve un String con la ubicación del proyecto
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Método para modificar la ubicación del proyecto
     * @param
     * 'ubicacion' es un String con la ubicación que se va a asignar al protecto
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Método para conocer la obra del proyecto
     * @return devuelve un Obra con la obra del proyecto
     */
    public Obra getObra() {
        return obra;
    }

    /**
     * Método para modificar la obra del proyecto
     * @param
     * 'obra' es un Obra con la obra que se va a asignar al protecto
     */
    public void setObra(Obra obra) {
        this.obra = obra;
    }

    /**
     * Método para conocer la descripción del proyecto
     * @return devuelve un String con la descripción del proyecto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método para modificar la descripción del proyecto
     * @param
     * 'descripcion' es un String con la descripción que se va a asignar al protecto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método para conocer la calificación del proyecto
     * @return devuelve un Calificacion con la calificación del proyecto
     */
    public Calificacion getCalificacion() {
        return calificacion;
    }

    /**
     * Método para modificar la calificación del proyecto
     * @param
     * 'calificacion' es un Calificacion con la calificación que se va a asignar al protecto
     */
    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Método para conocer el plazo del proyecto
     * @return devuelve un int con el plazo del proyecto
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * Método para modificar el plazo del proyecto
     * @param
     * 'plazo' es un int con el plazo que se va a asignar al protecto
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    /**
     * Método para conocer los materiales del proyecto
     * @return devuelve un String con los materiales del proyecto
     */
    public String getMateriales() {
        return materiales;
    }

    /**
     * Método para modificar los materiales del proyecto
     * @param
     * 'materiales' es un String con los materiales que se va a asignar al protecto
     */
    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }
    
}
