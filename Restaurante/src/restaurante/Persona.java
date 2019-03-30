package restaurante;

public class Persona {
    private String nombre;
    private Persona persona;
    private int Edad;
    private int formaDePago;
    private int[] numeroTarjeta;

    public Persona() {
    
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(int formaDePago) {
        this.formaDePago = formaDePago;
    }

    public int[] getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int[] numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
}
