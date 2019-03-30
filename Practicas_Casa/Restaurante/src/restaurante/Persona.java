
package restaurante;

import java.util.ArrayList;

/**
 *
 * @author Victor_Morales
 */
public class Persona {
    //Definiendo Atributos de Persona
    private String nombre;
    private int edad;
    
    //Definiendo una lista para guardar Nombre de los Clientes
    //private ArrayList<Registro> registros;
    
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona (){
        this.nombre = null;
        this.edad = 0;
    }
    //creando stteres y getters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getedad(){
        return edad;
    }
    public void setedad(int edad){
        this.edad = edad;
    }

}
