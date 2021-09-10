package com.sofka.laboratorio;

public class Televisor extends Electrodomestiico{
    int resolucion;
    boolean TDT;
    private static final int resolucionDefault = 20;
    private static final boolean tdtDefault = false;

    public Televisor(int precio, int peso, char consumoEnergetico, String color, int resolucion, boolean TDT) {
        super(precio, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(int precio, int peso) {
        super(precio, peso);
        this.consumoEnergetico = consumoDefault;
        this.color = colorDefault;
        this.resolucion = resolucionDefault;
        this.TDT = tdtDefault;
    }

    public Televisor(){
        this.peso = pesoDefault;
        this.precio = precioDefault;
        this.consumoEnergetico = consumoDefault;
        this.color = colorDefault;
        this.resolucion = resolucionDefault;
        this.TDT = tdtDefault;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    @Override
    public int precioFinal(){
        super.precioFinal();
        if (getResolucion() > 40){
            this.precio += getPrecio() * 0.3;
        }
        if (isTDT()){
            this.precio += 50;
        }
        return getPrecio();
    }

}

