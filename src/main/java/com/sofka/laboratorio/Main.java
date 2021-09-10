package com.sofka.laboratorio;

public class Main {
    public static void main(String[] args) {
        Puntos puntos = new Puntos();
        Electrodomestiico electrodomestiico = new Electrodomestiico(150, 100,'A', "azul");
        Lavadora lavadora = new Lavadora(150, 100, 'A', "azul", 40);
        System.out.println(electrodomestiico.getPrecio());
        System.out.println(lavadora.getPrecio());
        electrodomestiico.precioFinal();
        lavadora.precioFinal();
        System.out.println(electrodomestiico.getPrecio());
        System.out.println(lavadora.getPrecio());

    }
}
