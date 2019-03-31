
package restaurante;

/**
 *
 * @author Victor_Morales
 */
public class Bebida {
    //Definiendo Atributos
    private String NombreBebida;
    private String TipoBebida;
     private float Precio;
    
public Bebida (String NombreBebida, String TipoBebida, float Precio){
    this.NombreBebida = NombreBebida;
    this.TipoBebida = TipoBebida;
    this.Precio = Precio;
}

public Bebida(){
    this.NombreBebida = null;
    this.TipoBebida = null;
    this.Precio = 0;
}

    Bebida(String NombreBebida, String TipoBebida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//creamos los setters y getters

    public String getNombreBebida() {
        return NombreBebida;
    }

    public void setNombreBebida(String NombreBebida) {
        this.NombreBebida = NombreBebida;
    }

    public String getTipoBebida() {
        return TipoBebida;
    }

    public void setTipoBebida(String TipoBebida) {
        this.TipoBebida = TipoBebida;
    }

    public float getPrecio(float Precio) {
        return Precio;
    }
    
    public void setPrecio(){
        this.Precio = Precio;
    }

    
}
