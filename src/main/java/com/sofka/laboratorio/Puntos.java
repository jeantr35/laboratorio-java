package com.sofka.laboratorio;

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
}
