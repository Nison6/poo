package restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Mesa {
    
    public static void AgregarMesa(ArrayList<ArrayList> listaMesa){
        
        Scanner in = new Scanner(System.in);
        ArrayList<Persona> personasMesa;
        int numMesa, cantPersonas;
        
        System.out.println("Ingrese numero de mesa");
        numMesa = in.nextInt();
        System.out.println("Ingrese cantidad de personas");
        cantPersonas = in.nextInt();
        
        personasMesa = new ArrayList<>(cantPersonas);
        
        AgregarPersona(listaMesa, cantPersonas);
    }

    public static void AgregarPersona(ArrayList<ArrayList> listaMesa, int cantPersonas){
        Persona persona = new Persona();
        Scanner in = new Scanner(System.in);
        ArrayList<Persona> personasMesa;
        personasMesa = new ArrayList<>(cantPersonas);
        int numMesa;
        
        for (int i = 0; i < cantPersonas; i++){
            System.out.println("Ingrese nombre de la persona");
            persona.setNombre(in.nextLine());
            System.out.println("Ingrese edad de la persona");
            persona.setEdad(in.nextInt()); in.nextLine();
            System.out.println("Ingrese forma de pago de la persona (0 para efectivo, 1 para tarjeta)");
            persona.setFormaDePago(in.nextInt()); in.nextLine();
            
            if (persona.getFormaDePago() == 1){
                System.out.println("Ingrese número de la tarjeta (8 números)");
                int[] nTarjeta = new int[8];
                for (int j = 0; j < 8; j++ ){
                    System.out.println("Ingrese el valor " + (j+1) + " de la tarjeta");
                    nTarjeta[j] = in.nextByte(); in.nextLine();
                }
                System.out.println("Se pagará con tarjeta");
                persona.setNumeroTarjeta(nTarjeta);
            } else
                System.out.println("Se pagará con efectivo");
            persona.setPersona(persona);
            personasMesa.add(persona.getPersona());
        }   
        listaMesa.add(personasMesa);
        System.out.println(listaMesa.get(0));
    }
}
