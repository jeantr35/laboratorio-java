package com.sofka.laboratorio;

public class Electrodomestiico {
    int precio;
    String color;
    char consumoEnergetico;
    int peso;

    protected static final int pesoDefault = 5;
    protected static final int precioDefault = 100;
    protected static final char consumoDefault = 'F';
    protected static final String colorDefault = "blanco";

    public Electrodomestiico(){
        this.peso = pesoDefault;
        this.precio = precioDefault;
        this.consumoEnergetico = consumoDefault;
        this.color = colorDefault;
        precioFinal();
    }

    public Electrodomestiico(int precio, int peso){
        this.peso = peso;
        this.precio = precio;
        this.consumoEnergetico = consumoDefault;
        this.color = colorDefault;
        precioFinal();
    }

    public Electrodomestiico(int precio, int peso, char consumoEnergetico, String color){
        this.peso = peso;
        this.precio = precio;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
        precioFinal();
    }

    public int getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char consumoEnergetico){
        if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D' || consumoEnergetico == 'E' || consumoEnergetico == 'F'){
            this.consumoEnergetico = consumoEnergetico;
        }
        else {this.consumoEnergetico = consumoDefault;}
    }

    private void comprobarColor(String color){
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")){
            this.color = color;
        }
        else {this.color = colorDefault;}
    }

    public int precioFinal(){
        switch (consumoEnergetico){
            case 'A':
                this.precio += 100;
                break;
            case 'B':
                this.precio += 80;
                break;
            case 'C':
                this.precio += 60;
                break;
            case 'D':
                this.precio += 50;
                break;
            case 'E':
                this.precio += 30;
                break;
            case 'F':
                this.precio += 10;
                break;
        }
        if (getPeso()<=19){
            this.precio += 10;
        }
        else if (getPeso() <=49 && getPeso() >= 20){
            this.precio += 50;
        }
        else if (getPeso() <= 79 && getPeso() >= 50){
            this.precio += 80;
        }
        else {
            this.precio +=100;
        }

        return getPrecio();

    }

}
