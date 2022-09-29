
//Ejercicio de coche
/*matricula: String
marca: String
modelo: String
color: String
tarifa: double
disponoble: boolean*/

package test;

import dominio.Vehiculo;

/**
 *
 * @author Alumno Mañana
 */
public class GestionCochess {
    
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("1578HGH", "FORD", "C3","ROJO", 55.56,true);
        Vehiculo v2 = new Vehiculo("5268TYU", "PEUGEOT", "308","GRIS", 10,false);
        
        System.out.println(v1);
        System.out.println(v2);

    }
    
}
