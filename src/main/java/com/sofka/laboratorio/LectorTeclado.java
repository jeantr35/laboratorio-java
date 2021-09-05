package com.sofka.laboratorio;

import java.util.Locale;
import java.util.Scanner;

public class LectorTeclado {
    Scanner scanner = new Scanner(System.in);

    public double leerDouble(){
        double numero = 0;
        boolean valido;

        do{
            try {
                numero = scanner.nextDouble();
                valido = true;
            }
            catch (Exception e){
                System.out.println("Por favor ingrese un NUMERO y vuelva a intentarlo");
                valido = false;
                scanner.next();
            }
        }
        while (!valido);

        return numero;
    }

    public int leerInt(){
        int numero = 0;
        boolean valido;

        do{
            try {
                numero = scanner.nextInt();
                valido = true;
            }
            catch (Exception e){
                System.out.println("Por favor ingrese un NUMERO ENTERO y vuelva a intentarlo");
                valido = false;
                scanner.next();
            }
        }
        while (!valido);

        return numero;
    }

    public String leerFrase(){
        String frase;

        frase = scanner.nextLine();
        frase = frase.toLowerCase();
        return  frase;

    }
}
