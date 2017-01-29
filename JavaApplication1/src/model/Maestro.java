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
public class Maestro {
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String email;
    private Municipio municipio;
    private String direccion;
    private ArrayList<Destreza> destrezas;
    
    /**
     * Constructor para objetos de la clase Maestro
     * @param
     * 'nombre' es el nombre del maestro
     * 'apellido' es el apellido del maestro
     * 'cedula' es la cedula del maestro
     * 'telefono' es el telefono del maestro
     * 'email' es el correo electronico del maestro
     * 'direccion' es la dirección del domicilio del maestro
     */
    public Maestro(String nombre, String apellido, String cedula, String telefono, Municipio municipio, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.municipio = municipio;
        this.direccion = direccion;
        destrezas = new ArrayList<>();
    }
    
    /*
    devuelve true si el maestro tiene la habilidad que requiere el cliente
    */
    public boolean getCumple(Municipio municipio,Habilidad habilidad){
        boolean cumple = false;
 
        if (this.municipio.equals(municipio)) {
            for (Destreza destreza : destrezas) {
                if(destreza.getHabilidad().equals(habilidad)){                  
                     cumple = true; 
                     break;
                     
                          
                }
            
            }
        
        }
        System.out.println(cumple);
    return cumple;
    }
    /*
    Metodo que permite calificar una destreza 
    */
    public void calificarDestreza(Habilidad habilidad,Calificacion calificacion){
        
        for (Destreza destreza : destrezas) {
                if(destreza.getHabilidad().equals(habilidad)){
                     destreza.addCalificacion(calificacion);
                     break;
                }        
        }
    
    }
    /*
    Obtiene la calificacion del maestro
    */
    public float getCalifiByDestre(Habilidad habilidad){
        Destreza destrezaEle = null;
        for (Destreza destreza : destrezas) {
                if(destreza.getHabilidad().equals(habilidad)){
                     destrezaEle = destreza;
                     break;
                }        
        }
        
        return destrezaEle.getPromedio();  
    }
    /*
    Obtiene la destreza del maestro a partir de su habilidad
    */
    public Destreza getDestreByHabilidad(Habilidad habilidad){
        Destreza destrezaEle = null;
        for (Destreza destreza : destrezas) {
                if(destreza.getHabilidad().equals(habilidad)){
                     destrezaEle = destreza;
                     break;
                }        
        }
        
        return destrezaEle;  
    }
    
   /**
     * Esta funcion se encarga de agregar una destreza
     * @param
     * 'habilidaElegida' es la habilidad en la que el maestro se destaca en la destreza
     */
    public void agregarDestreza(Habilidad habilidaElegida){    
        destrezas.add(new Destreza(habilidaElegida));
    }
    
    
     
     /**
     * Método para conocer el municipo donde esta ubicado el Mestro
     * @return devuelve un enum de tipo Municipio con el municipio del Maestro
     */
    public Municipio getMunicipio()
    {
        return municipio;
    }
    
    /**
     * Método para conocer el nombre del maestro
     * @return devuelve un string con el nombre del maestro
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre del maestro
     * @param
     * 'nombre' es un String con el nombre que se va a asignar al maestro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para conocer el apellido del maestro
     * @return devuelve un string con el apellido del maestro
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método para modificar el apellido del maestro
     * @param
     * 'apellido' es un String con el apellido que se va a asignar al maestro
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método para conocer la cedula del maestro
     * @return devuelve un string con la cedula del maestro
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Método para modificar la cedula del maestro
     * @param
     * 'cedula' es un String con la cedula que se va a asignar al maestro
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Método para conocer el telefono del maestro
     * @return devuelve un string con el telefono del maestro
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método para modificar el telefono del maestro
     * @param
     * 'telefono' es un String con el telefono que se va a asignar al maestro
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método para conocer el Email del maestro
     * @return devuelve un string con el Email del maestro
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método para modificar el Email del maestro
     * @param
     * 'email' es un String con el Email que se va a asignar al maestro
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método para conocer la dirección del maestro
     * @return devuelve un string con la dirección del maestro
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método para modificar la dirección del maestro
     * @param
     * 'dirección' es un String con la dirección que se va a asignar al maestro
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the destrezas
     */
    public ArrayList<Destreza> getDestrezas() {
        return destrezas;
    }
}
