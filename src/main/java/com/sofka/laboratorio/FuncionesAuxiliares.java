package com.sofka.laboratorio;

import java.util.Locale;
import java.util.Scanner;

public class FuncionesAuxiliares {
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

    public String leerFraseMayus(){
        String frase;

        frase = scanner.nextLine();
        return  frase;

    }

    public void mensajeIMC(Persona persona){
        if (persona.calculaIMC().equals("-1")){
            System.out.println(persona.getNombre() + " tiene el peso por debajo del ideal");
        }
        else if(persona.calculaIMC().equals("0")){
            System.out.println(persona.getNombre() + " tiene el peso ideal");
        }
        else{System.out.println(persona.getNombre() + " tiene sobrepeso");}
    }

    public void mensajeEdad(Persona persona){
        if(persona.esMayorDeEdad()){
            System.out.println(persona.getNombre() + " es mayor de edad");
        }
        else System.out.println(persona.getNombre() + " es menor de edad");
    }

}
