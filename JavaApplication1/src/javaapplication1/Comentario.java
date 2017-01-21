
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author Santiago
 */
public class Comentario {
    private Date fecha;
    private String autor;
    private String descripcion;

    /**
     * Constructor para objetos de la clase Comentario
     * @param
     * 'fecha' es la fecha en la que se realizó el comentario
     * 'autor' es la persona que realizó el comentario
     * 'descripcion' es el contenido del comentario
     */
    public Comentario(String autor, String descripcion) {
        this.fecha = new Date();
        this.autor = autor;
        this.descripcion = descripcion;
    }


    /**
     * Método para modificar el autor del Comentario
     * @param
     * 'autor' es un String con el autor que se va a asignar al Comentario
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Método para modificar la descripción del Comentario
     * @param
     * 'descripcion' es un String con la nueva descripcion que se va a asignar al Comentario
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
      
    /**
     * Este metodo devuelve la fecha en la que se realizo el comentario
     * 
     * @return     la fecha en la que se realizo el comentario
     */
    public String getFecha()
    {DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(fecha));
        return dateFormat.format(this.fecha);
    }
    
    /**
     * Este metodo devuelve el autor que realizo el comentario
     * 
     * @return     el autor que realizó el comentario
     */
    public String getAutor()
    {
        return autor;
    }
    /**
     * Este metodo devuelve la descripcion del comentario
     * 
     * @return     la descripcion del comentario
     */
    public String getDescripcion()
    {
        return descripcion;
    }
}
