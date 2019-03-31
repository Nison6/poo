
package restaurante;

/**
 *
 * @author Victor_Morales
 */
public class Plato {
    private int NumPlatos;
    private String NombrePlato;
    private String Tipo;
    private int Calorias;
    private float Precio;
 
    public Plato (int NumPlatos,String NombrePlato,int Calorias, float Precio){
        this.NumPlatos = NumPlatos;
        this.NombrePlato = NombrePlato;
        this.Calorias = Calorias;
        this.Precio = Precio;
    }
    
    public Plato (){
        this.NumPlatos = 0;
        this.NombrePlato = null;
        this.Calorias = 0;
        this.Precio = 0;
    }

    Plato(int NumPlatos, String NombrePlato, int Calorias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //creamos setters y getters
     public int getNumPlatos(){
        return NumPlatos;
    }
    
    public void setNumPlatos(int NumPLatos){
        this.NumPlatos = NumPLatos;
    }
    public String getNombrePlato(){
        return NombrePlato;
    }
    public void setNombrePlato(String NombrePlato){
        this.NombrePlato = NombrePlato;
    }
   
    public int getCalorias(){
        return Calorias;
    }
    public void setCalorias(int Calorias){
        this.Calorias = Calorias;
    }
    
    public float getPrecio(){
        return Precio;
    }
    public void setPrecio(float Precio){
        this.Precio = Precio;
    }
}
