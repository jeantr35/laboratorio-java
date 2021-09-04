package com.sofka.laboratorio;

import java.util.Scanner;

public class Puntos {
    public void puntoUno(){
        int numero1 = 3;
        int numero2 = 4;

        if (numero1 > numero2){
            System.out.println("El primer numero: " + numero1 + " es mayor que el segundo numero: " + numero2);
        }
        else if (numero1 < numero2){
            System.out.println("El primer numero: " + numero1 + " es menor que el segundo numero: " + numero2);
        }
        else{
            System.out.println("El primer numero: " + numero1 + " es igual que el segundo numero: " + numero2);
        }
    }

    public void puntoDos(){
        double numero1;
        double numero2;
        LectorTeclado lectorTeclado = new LectorTeclado();

        System.out.print("Por favor ingrese el primer numero: ");
        numero1 = lectorTeclado.leerDouble();
        System.out.print("Por favor ingrese el segundo numero: ");
        numero2 = lectorTeclado.leerDouble();

        if (numero1 > numero2){
            System.out.println("El primer numero: " + numero1 + " es mayor que el segundo numero: " + numero2);
        }
        else if (numero1 < numero2){
            System.out.println("El primer numero: " + numero1 + " es menor que el segundo numero: " + numero2);
        }
        else{
            System.out.println("El primer numero: " + numero1 + " es igual que el segundo numero: " + numero2);
        }

    }



}
