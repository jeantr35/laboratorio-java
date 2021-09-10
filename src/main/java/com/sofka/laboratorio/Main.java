package com.sofka.laboratorio;

public class Main {
    public static void main(String[] args) {
        Puntos puntos = new Puntos();
        Electrodomestiico electrodomestiico = new Electrodomestiico(150, 100,'A', "azul");
        Lavadora lavadora = new Lavadora(150, 100, 'A', "azul", 40);
        Televisor televisor = new Televisor(150, 100,'A', "azul",41,true);
        System.out.println(electrodomestiico.getPrecio());
        System.out.println(lavadora.getPrecio());
        System.out.println(televisor.getPrecio());
        electrodomestiico.precioFinal();
        lavadora.precioFinal();
        televisor.precioFinal();
        System.out.println(electrodomestiico.getPrecio());
        System.out.println(lavadora.getPrecio());
        System.out.println(televisor.getPrecio());

    }
}
