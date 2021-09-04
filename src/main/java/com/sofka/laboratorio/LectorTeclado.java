package com.sofka.laboratorio;

import java.util.Scanner;

public class LectorTeclado {
    Scanner scanner = new Scanner(System.in);

    public double leerDouble(){
        double numero = 0.0;

        try {
            numero = scanner.nextDouble();
        }
        catch (Exception e){System.out.println("Por favor ingrese un NUMERO y vuelva a intentarlo");}
        return numero;
    }
}
