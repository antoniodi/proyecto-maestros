/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
/**
 *
 * @author Santiago
 */
public class Obra {
    private HashMap<ParteCasa,ArrayList<Habilidad>> obra;
    private ArrayList<Habilidad> habilidades;
   

    /**
     * Constructor for objects of class Obra
     */
    public Obra()
    {obra = new HashMap<>();
     obra.put(ParteCasa.PUERTA,agregarHabilidades(Habilidad.PINTURA,Habilidad.MANPOSTERIA));
     obra.put(ParteCasa.VENTANA,agregarHabilidades(Habilidad.PINTURA,Habilidad.MANPOSTERIA)); 
     obra.put(ParteCasa.BAÑO,agregarHabilidades(Habilidad.ENCHAPE,Habilidad.MANPOSTERIA,Habilidad.PINTURA, Habilidad.PLOMERIA));
     obra.put(ParteCasa.TECHO,agregarHabilidades(Habilidad.PINTURA,Habilidad.ESTUCO,Habilidad.MANPOSTERIA));
     obra.put(ParteCasa.PISO,agregarHabilidades(Habilidad.ENCHAPE,Habilidad.MANPOSTERIA,Habilidad.PLOMERIA));
     obra.put(ParteCasa.PARED,agregarHabilidades(Habilidad.PINTURA,Habilidad.ESTUCO,Habilidad.ENCHAPE));
     
    }
    /**
     * Usamos etse metodo para conocer las Habiliades relacionadas con un elemento de la casa
     */
    public void conocerHabilidades(String elementoElegido){
    Iterator it = obra.entrySet().iterator();
    //habilidades = new ArrayList<>();
		
    while (it.hasNext()) {
    	Map.Entry e = (Map.Entry)it.next();
    	if (e.getKey().toString() == elementoElegido){
    	System.out.println(e.getKey() + " " + e.getValue());
        }
    }
    
    }
    
    public ArrayList<Habilidad> getHabiByParteCasa(ParteCasa parteCasa){   
        return obra.get(parteCasa);
    }
    /**
     * Agregamos 1 Habilidad que se encuentren relacionadas con un elemento especifico
     */
    public ArrayList<Habilidad> agregarHabilidades(Habilidad habilidad1){
    ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
    habilidades.add(habilidad1);
    return habilidades;
    
    }
     /**
     * Agregamos 2 Habilidades que se encuentren relacionadas con un elemento especifico
     */
    public ArrayList<Habilidad> agregarHabilidades(Habilidad habilidad1, Habilidad habilidad2){
    ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
    habilidades.add(habilidad1);
    habilidades.add(habilidad2);
    return habilidades;
    
    }

    /**
     * Agregamos 3 Habilidades que se encuentren relacionadas con un elemento especifico
     */
    public ArrayList<Habilidad> agregarHabilidades(Habilidad habilidad1, Habilidad habilidad2, Habilidad habilidad3){
    ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
    habilidades.add(habilidad1);
    habilidades.add(habilidad2);
    habilidades.add(habilidad3);
    return habilidades;    
    }
    
    /**
     * Agregamos 4 Habilidades que se encuentren relacionadas con un elemento especifico
     */
    public ArrayList<Habilidad> agregarHabilidades(Habilidad habilidad1, Habilidad habilidad2, Habilidad habilidad3, Habilidad habilidad4){
    ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
    habilidades.add(habilidad1);
    habilidades.add(habilidad2);
    habilidades.add(habilidad3);
    habilidades.add(habilidad4);
    return habilidades;    
    }
}
