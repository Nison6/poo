package restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void Inicio(){
        ArrayList<Mesa> listaMesa = new ArrayList<>();
        menu(listaMesa);
    }
    
    public static void menu(ArrayList<Mesa> listaMesa){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese la acción a realizar");
        System.out.println("Presione 1 para agregar mesa");
        System.out.println("Presione 2 para agregar persona");
        System.out.println("Presione 3 para agregar orden");
        System.out.println("Presione 4 para mostrar la cuenta");
        System.out.println("Presione 5 para pagar la cuenta");
        int opcion = in.nextInt();
        
        switch(opcion){
            case 1:
                Mesa.AgregarMesa(listaMesa);
            case 2:
                Mesa.AgregarMesa(listaMesa);
            case 3:
                Mesa.AgregarMesa(listaMesa);
            case 4:
                Mesa.AgregarMesa(listaMesa);
            case 5:
                Mesa.AgregarMesa(listaMesa);
            default:{
                System.out.println("ERROR");
                System.out.println("Seleccione una opción válida");
            }
                
        }
    }
}
