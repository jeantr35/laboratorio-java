package com.sofka.laboratorio;

public class Persona {

    private int edad;
    private int peso;
    private double altura;
    private char sexo;
    private String nombre;
    private String dni;
    private static final char defaultSex = 'H';
    private static final String bajoPeso = "-1";
    private static final String idealPeso = "0";
    private static final String sobrePeso = "1";


    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        comprobarSexo(sexo);
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = defaultSex;
        this.peso = 0;
        this.altura = 0.00;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String calculaIMC(){
        double valorIMC = 0.00;
        valorIMC = getPeso()/(getAltura()*getAltura());

        if (valorIMC < 20){return bajoPeso;}
        else if (valorIMC >= 20 && valorIMC <=25){return idealPeso;}
        else {return sobrePeso;}
    }

    public boolean esMayorDeEdad(){
        if(getEdad() >= 18){return true;}
        return false;
    }

    private void comprobarSexo(char sexo){
        if (!(sexo == 'H' || sexo == 'M')){
            setSexo('H');
        }
        else{setSexo(sexo);}
    }



}
