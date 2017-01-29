/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author anton
 */

public class Maestros {
    
private ArrayList<Maestro> maestros;



private Random rnd;
public Maestros() {
    ArrayList<Calificacion> calificaciones = new ArrayList<>();
    
    maestros = new ArrayList<Maestro>();
    maestros.add(new Maestro("Alejandro", "Jimenez","123456","123456",Municipio.BUCARAMANGA ,"Cra. 10 # 22 - 70 " ));
    maestros.add(new Maestro("Marianela", "Cordero","123456","123456",Municipio.BUCARAMANGA ,"Cra. 10 # 22 - 70 " ));
    maestros.add(new Maestro("Marcelo", "Camero","123456","123456",Municipio.BUCARAMANGA ,"Cra. 10 # 22 - 70 " ));
    maestros.add(new Maestro("Maria Aurora", "Zambrano","123456","123456",Municipio.PIEDECUESTA ,"Cra. 10 # 22 - 70 " ));
    maestros.add(new Maestro("Alirio", "Suarez","123456","123456",Municipio.FLORIDA ,"Cra. 10 # 22 - 70 " ));
    maestros.add(new Maestro("Alejandro", "terril","123456","123456",Municipio.CALI ,"Cra. 10 # 22 - 70 " ));

    for (Maestro maestro : maestros) {
        maestro.agregarDestreza(Habilidad.PLOMERIA);
    }
    maestros.get(0).agregarDestreza(Habilidad.MANPOSTERIA);
    maestros.get(1).agregarDestreza(Habilidad.ESTUCO);
    maestros.get(2).agregarDestreza(Habilidad.ENCHAPE);
    maestros.get(3).agregarDestreza(Habilidad.PINTURA);
    maestros.get(4).agregarDestreza(Habilidad.ESTUCO);
    
   
    
    Comentario com = new Comentario("Luz Marina", "Muy buen maestro");
    Comentario com1 = new Comentario("María del Carmen", "Es un maestro muy puntual");
    Comentario com2 = new Comentario("Sandra Milena", "El maestro es muy pulido");
    Comentario com3 = new Comentario("José Pambelé Santana", "Llego tarde y estaba enguayabado");
    Comentario com4 = new Comentario("Erica Husnavy Reyes", "LLEGO DESPUES DE MEDIO DÍA, NO LO RECOMIENDO");
    Comentario com5 = new Comentario("Erica Husnavy Reyes", "El colmo, No trajo completas las herramientas");
    
    
    calificaciones.add((new Calificacion(com, 5)));
    calificaciones.add(new Calificacion(com2, 4));
    calificaciones.add(new Calificacion(com3, 3));
    calificaciones.add(new Calificacion(com4, 1));
    calificaciones.add(new Calificacion(com5, 2));
    calificaciones.add(new Calificacion(com1, 4));
    calificaciones.add(new Calificacion(com2, 3));
    calificaciones.add(new Calificacion(com2, 5));
    
    /*
    Agregando calificaciones aleatorias a los maestros
    */
    
    for (Maestro maestro : maestros) {
       maestro.calificarDestreza(Habilidad.PLOMERIA, calificaciones.get(0 + (int)(Math.random() * 7)));
       maestro.calificarDestreza(Habilidad.PLOMERIA, calificaciones.get(0 + (int)(Math.random() * 7)));
       maestro.calificarDestreza(Habilidad.PLOMERIA, calificaciones.get(0 + (int)(Math.random() * 7)));
    }
    maestros.get(0).calificarDestreza(Habilidad.MANPOSTERIA, calificaciones.get(0 + (int)(Math.random() * 7)));
    maestros.get(0).calificarDestreza(Habilidad.MANPOSTERIA, calificaciones.get(0 + (int)(Math.random() * 7)));
    maestros.get(0).calificarDestreza(Habilidad.ESTUCO, calificaciones.get(0 + (int)(Math.random() * 7)));
    maestros.get(0).calificarDestreza(Habilidad.ESTUCO, calificaciones.get(0 + (int)(Math.random() * 7)));
    maestros.get(0).calificarDestreza(Habilidad.ENCHAPE, calificaciones.get(0 + (int)(Math.random() * 7)));
    maestros.get(0).calificarDestreza(Habilidad.ENCHAPE, calificaciones.get(0 + (int)(Math.random() * 7)));
    maestros.get(0).calificarDestreza(Habilidad.PINTURA, calificaciones.get(0 + (int)(Math.random() * 7)));
    maestros.get(0).calificarDestreza(Habilidad.PINTURA, calificaciones.get(0 + (int)(Math.random() * 7)));
    maestros.get(0).calificarDestreza(Habilidad.ESTUCO, calificaciones.get(0 + (int)(Math.random() * 7)));
    
   
}

    /**
     * @return the maestros
     */
    public ArrayList<Maestro> getMaestros() {
        return maestros;
    }

    

}
