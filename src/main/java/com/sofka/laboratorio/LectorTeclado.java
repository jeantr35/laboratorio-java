package com.sofka.laboratorio;

import java.util.Scanner;

public class LectorTeclado {
    Scanner scanner = new Scanner(System.in);

    public double leerDouble(){
        double numero = -1;
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
}
