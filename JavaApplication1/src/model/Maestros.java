/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author anton
 */

public class Maestros {
    
private ArrayList<Maestro> maestros;

public Maestros() {
    maestros = new ArrayList<Maestro>();
    maestros.add(new Maestro("Alejandro", "Jimenez","123456","123456",Municipio.BUCARAMANGA ,"Cra. 10 # 22 - 70 " ));
    maestros.add(new Maestro("Marianela", "Cordero","123456","123456",Municipio.BUCARAMANGA ,"Cra. 10 # 22 - 70 " ));
    maestros.add(new Maestro("Marcelo", "Camero","123456","123456",Municipio.BUCARAMANGA ,"Cra. 10 # 22 - 70 " ));
    maestros.add(new Maestro("Maria Aurora", "Zambrano","123456","123456",Municipio.PIEDECUESTA ,"Cra. 10 # 22 - 70 " ));
    maestros.add(new Maestro("Alirio", "Suarez","123456","123456",Municipio.FLORIDA ,"Cra. 10 # 22 - 70 " ));
    maestros.add(new Maestro("Alejandro", "terril","123456","123456",Municipio.CALI ,"Cra. 10 # 22 - 70 " ));

    for (Maestro maestro : maestros) {
        maestro.agregardestreza(Habilidad.PLOMERIA);
    }
}





    

}
