package com.sofka.laboratorio;

public class Main {
    public static void main(String[] args) {
        Puntos puntos = new Puntos();
        Electrodomestiico electrodomestiico = new Electrodomestiico(150, 100, 'Y', "AZUL");
        System.out.println(electrodomestiico.getPrecio());
        electrodomestiico.precioFinal();
        System.out.println(electrodomestiico.getPrecio());
        System.out.println(electrodomestiico.getConsumoEnergetico());
        System.out.println(electrodomestiico.getColor());
        System.out.println(electrodomestiico.getPeso());
    }
}
