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
public class Cliente {

   // instance variables - replace the example below with your own
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String email;
    private Municipio municipio;
    private String direccion;

    /**
     * Constructor para objetos de la clase Cliente con dirección
     * @param
     * 'nombre' es el nombre del cliente
     * 'apellido' es el apellido del cliente
     * 'cedula' es la cedula del cliente
     * 'telefono' es el telefono del cliente
     * 'email' es el correo electronico del cliente
     */
    public Cliente(String nombre, String apellido, String cedula, String telefono, String email, Municipio municipio, String direccion)
    {
        // initialise instance variables
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.telefono=telefono;
        this.email = email;
        this.municipio = municipio;
        this.direccion = direccion;
    }
    
     /**
     * Método para conocer el municipo donde esta ubicado el cliente
     * @return devuelve un enum de tipo Municipio con el municipio del cliente
     */
    public Municipio getMunicipio()
    {
        return municipio;
    }
    
    /**
     * Método para conocer el nombre del cliente
     * @return devuelve un string con el nombre del cliente
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Método para conocer el apellido del cliente
     * @return devuelve un string con el apellido del cliente
     */
    public String getApellido()
    {
        return apellido;
    }
    
    /**
     * Método para conocer la cedula del cliente
     * @return devuelve un string con la cedula del cliente
     */
    public String getCedula()
    {
        return cedula;
    }
    
    /**
     * Método para conocer el telefono del cliente
     * @return devuelve un string con el telefono del cliente
     */
    public String getTelefono()
    {
        return telefono;
    }
    
    /**
     * Método para conocer el Email del cliente
     * @return devuelve un string con el Email del cliente
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Método para conocer la dirección del cliente
     * @return devuelve un string con la dirección del cliente
     */
    public String getDireccion()
    {
        return direccion;
    }
    
    /**
     * Método para modificar el nombre del cliente
     * @param 
     * 'nombre' es un String con el nombre que se va a asignar al cliente
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    /**
     * Método para modificar el apellido del cliente
     * @param
     * 'apellido' es un String con el apellido que se va a asignar al cliente
     */
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    /**
     * Método para modificar la cedula del cliente
     * @param
     * 'cedula' es un String con la cedula que se va a asignar al cliente
     */
    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }
    
    /**
     * Método para modificar el telefono del cliente
     * @param
     * 'telefono' es un String con el telefono que se va a asignar al cliente
     */
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    /**
     * Método para modificar el email del cliente
     * @param
     * 'email' es un String con el email que se va a asignar al cliente
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * Método para modificar la dirección del cliente
     * @param
     * 'direccion' es un String con la direccion que se va a asignar al cliente
     */
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
 

}
