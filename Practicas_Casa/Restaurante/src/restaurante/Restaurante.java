
package restaurante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor_Morales
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definiendo scanner para pedir datos desde teclado
        Scanner entrada = new Scanner (System.in);
        
        /* Se creo un objeto Persona con el constructor sin parametros  ya que el cleinte debe meter su informacion ahi*/
        ArrayList<Plato>platos = new ArrayList<>();
        ArrayList<Bebida>bebidas = new ArrayList<>();
        
        
        /*System.out.println("***Restaurante*** ");
        System.out.println("1. Registrarse");//nombre,edad, mesa, poner mesa(NPersonas)
        System.out.println("2. Ordenar La Cena");//plato de comida, precio,tipo, calorias/ bebida, precio, tipo(Alcoholica o no)
        System.out.println("3. Agragar a la Orden");//Agrega plato extra o postre
        System.out.println("Pedir Cuenta");//pago en efectivo o Tarjeta(Numero de Tarjeta})
        System.out.println("Salir");*/
        boolean flag = true;
        
        do{
            System.out.println("*** RESTAURANTE GUSTEAU ***");
            System.out.println("---------Bienvenido--------");
            System.out.println("1. Registrarse.\n2. Realizar Orden De Alimentos. \n3. Desea Agragar Algo Adicional A La Orden\n4. Pedir Cuenta\n5. Salir " );
            int decision = entrada.nextInt(); 
            switch (decision){
                case 1:
            {
                ingresoDatos(entrada);
            }
                    break;
                case 2:
                    recibirOrden(entrada, platos, bebidas);
                    break;
                case 3:
                    agregarAdicional(entrada);
                    break;
                case 4:
                    pedirCuenta();
                    break;
                case 5:
                    flag = false;
                    break;
                    
            }
            
        }while(flag);
        
    }
    
    private static void ingresoDatos(Scanner entrada){
        Persona persona = new Persona();
        String nombre = entrada.nextLine();
        System.out.println("Ingrese Su Nombre: ");
                persona.setNombre(entrada.nextLine());
        System.out.println("Ingrese Su Edad: ");
                persona.setedad(entrada.nextInt());
    }
    
    private static void recibirOrden (Scanner entrada, ArrayList platos, ArrayList bebidas){
        Plato plato = new Plato();
        
        Bebida bebida = new Bebida();
        //Ordenando el Platillo a Consumir
        System.out.println("--Ordenando Platillo a Degustar--");
        System.out.println("Ingrese Numeros De Platos a Ordenar ");
                int NumPlatos = entrada.nextInt();
        System.out.println("Ingrese Nombre Del Platillo A Ordenar: ");
                String NombrePlato = entrada.nextLine();
        System.out.println("Ingrese El Numero De Calorias: ");
                int Calorias = entrada.nextInt();
        System.out.println("Ingrese El Precio Del Platillo: ");
                float Precio = entrada.nextFloat();
                entrada.nextLine();
                //Guardamos en una lista
                platos.add(new Plato (NumPlatos, NombrePlato, Calorias, Precio));
        //Ordenando el tipo de Bebida
        System.out.println("---Ordene La Bebida---");
        System.out.println("Ingrese El Nombre De La Bebida: ");
                String NombreBebida = entrada.nextLine();
        System.out.println("Ingrese EL Tipo de Bebida (Alcoholica o NO): ");
                String TipoBebida = entrada.nextLine();
        System.out.println("Ingrese Precio De La Bebida");
                float precio = entrada.nextFloat();
                
                bebidas.add(new Bebida (NombreBebida, TipoBebida));
                
    }
    
    private static void agregarAdicional(Scanner entrada){
        Plato plato = new Plato();
        Bebida bebida = new Bebida();
        //Se Agregan mas Platillos a la Orden
        System.out.println("Ingrese Plato Adicional");
        System.out.println("Ingrese EL Numero de Platos a Agregar: ");
        plato.setNumPlatos(entrada.nextInt());
        System.out.println("Ingrese Nombre Del Platillo A Ordenar: ");
        plato.setNombrePlato(entrada.nextLine());
        System.out.println("Ingrese El Numero De Calorias: ");
        plato.setCalorias(entrada.nextInt());
        System.out.println("Ingrese El Precio Del Platillo: ");
        plato.setPrecio(entrada.nextFloat());
        //Agregando Bebidas Adicionales
        System.out.println("Ordene La Bebida Adicional");
        System.out.println("Ingrese El Nombre De La Bebida: ");
        bebida.setNombreBebida(entrada.nextLine());
        System.out.println("Ingrese EL Tipo de Bebida (Alcoholica o NO): ");
        bebida.setTipoBebida(entrada.nextLine());
        System.out.println("Ingrese Precio De La Bebida");
        //bebida.setPrecio(entrada.nextInt());
    }
    
    public static void pedirCuenta(){
        
    }
}
