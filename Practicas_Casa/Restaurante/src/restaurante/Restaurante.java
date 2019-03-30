
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

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
        // TODO code application logic here
        System.out.println("***Restaurante*** ");
        System.out.println("1. Registrarse");//nombre,edad, mesa, poner mesa(NPersonas)
        System.out.println("2. Ordenar La Cena");//plato de comida, precio,tipo, calorias/ bebida, precio, tipo(Alcoholica o no)
        System.out.println("3. Agragar a la Orden");//Agrega plato extra o postre
        System.out.println("Pedir Cuenta");//pago en efectivo o Tarjeta(Numero de Tarjeta})
        System.out.println("Salir");
        boolean flag = true;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("*** RESTAURANTE GUSTEAU ***");
            System.out.println("---------Bienvenido--------");
            System.out.println("1. Registrarse.\n2. Realizar Orden De Alimentos. \n3. Desea Agragar Algo Adicional A La Orden\n4. Pedir Cuenta\n5. Salir " );
            int decision = entrada.nextInt(); entrada.nextLine();
            switch (decision){
                case 1:
            {
                //ingresoProductos(entrada, Productos, canProducto, CantProducto, precio,PrecioProducto, total);
            }
                    break;
                case 2:
                    //ListaProductos(Productos);
                    break;
                case 3:
                    //TotalPagar(total);
                    break;
                case 4:
                    flag = false;
                    break;
                    
            }
            
        }while(flag);
        
    }
    
}
