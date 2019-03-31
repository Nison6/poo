
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
    
    private ArrayList<Plato> platos;
    private ArrayList<Bebida> bebidas;
    
    //Definiendo una lista para guardar Nombre de los Clientes
    //private ArrayList<Registro> registros;
    
    public Persona (String nombre, int edad, ArrayList<Plato> platos,ArrayList<Bebida> bebidas ){
        this.nombre = nombre;
        this.edad = edad;
        this.platos = platos;
        this.bebidas = bebidas;
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
    
    public ArrayList<Plato> getPlatos(){
        return platos;
    }
    
    public void setPlatos(ArrayList<Plato> platos){
        this.platos = platos;
        
    }
    
    public ArrayList<Bebida> getBebidas(){
        return bebidas;
    }
    
    public void setBebidas(ArrayList<Bebida> bebidas){
        this.bebidas = bebidas;
        
    }

}
