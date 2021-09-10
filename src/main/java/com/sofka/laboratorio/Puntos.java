package com.sofka.laboratorio;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


public class Puntos {
    FuncionesAuxiliares funcionesAuxiliares = new FuncionesAuxiliares();
    private HashMap<Character, Integer> hashMap = new HashMap<>();

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

        System.out.print("Por favor ingrese el primer numero: ");
        numero1 = funcionesAuxiliares.leerDouble();
        System.out.print("Por favor ingrese el segundo numero: ");
        numero2 = funcionesAuxiliares.leerDouble();

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

    public void puntoTres(){
        double radio;

        System.out.print("Por favor ingrese el radio de el circulo: ");
        radio = funcionesAuxiliares.leerDouble();
        System.out.println("El valor del area del circulo es: " + (Math.PI*Math.pow(radio,2)));

    }

    public void puntoCuatro(){
        double precio;

        System.out.print("Por favor ingrese el valor del articulo: ");
        precio = funcionesAuxiliares.leerDouble();
        System.out.println("El valor del articulo con IVA es de: " + (precio*1.21));
    }

    public void puntoCinco(){
        int contador = 1;

        while (contador <= 100){
            if ((contador % 2) == 0){System.out.println("El numero: " + contador + " es par");}
            else{System.out.println("El numero: " + contador + " es impar");}
            contador += 1;
        }
    }

    public void puntoSeis(){
        int i;

        for (i = 1; i <= 100; i += 1) {
            if ((i % 2) == 0) {System.out.println("El numero: " + i + " es par");}
            else {System.out.println("El numero: " + i + " es impar");}
        }
    }

    public void puntoSiete(){
        double numero = -1.0;

        do {
            System.out.println("Ingresa un numero mayor o igual a 0");
            numero = funcionesAuxiliares.leerDouble();
        }
        while (numero < 0);
        System.out.println("Su numero ingresado fue: " + numero);
    }

    public void puntoOcho(){
        String dia;
        boolean valido = false;
        do {
            System.out.print("Por favor ingrese un dia de la semana: ");
            dia = funcionesAuxiliares.leerFrase();

            switch (dia){
                case "lunes":
                    System.out.println("El " + dia + " es un dia laboral");
                    valido = true;
                    break;
                case "martes":
                    System.out.println("El " + dia + " es un dia laboral");
                    valido = true;
                    break;
                case "miercoles":
                    System.out.println("El " + dia + " es un dia laboral");
                    valido = true;
                    break;
                case "jueves":
                    System.out.println("El " + dia + " es un dia laboral");
                    valido = true;
                    break;
                case "viernes":
                    System.out.println("El " + dia + " es un dia laboral");
                    valido = true;
                    break;
                case "sabado":
                    System.out.println("El " + dia + " es un dia no laboral");
                    valido = true;
                    break;
                case "domingo":
                    System.out.println("El " + dia + " es un dia no laboral");
                    valido = true;
                    break;
                default:
                    System.out.println("Este no es un dia valido, intentelo de nuevo");
            }
        }
        while (!valido);

    }

    public void puntoNueve(){
        String frase = "La sonrisa sera la mejor arma contra la tristeza ";

        frase = frase.replace("a", "e");
        System.out.print("Por favor ingrese la frase a concatenar: ");
        frase = frase.concat(funcionesAuxiliares.leerFrase());
        System.out.println(frase);
    }

    public void puntoDiez(){
        String frase = "";

        System.out.print("Por favor ingrese la frase: ");
        frase = funcionesAuxiliares.leerFrase();
        frase = frase.replace(" ", "");
        System.out.println(frase);
    }

    public void puntoOnce(){
        String frase;
        int i;

        hashMap.put('a', 0);
        hashMap.put('e', 0);
        hashMap.put('i', 0);
        hashMap.put('o', 0);
        hashMap.put('u', 0);

        System.out.print("Ingrese por favor la frase: ");
        frase = funcionesAuxiliares.leerFrase().toLowerCase();

        for (i=0; i<frase.length(); i += 1){
            hashMap.computeIfPresent(frase.charAt(i),(k, v) -> v + 1);
        }
        System.out.println("La longitud de la frase ingresada es: " + frase.length());
        hashMap.forEach((k,v) -> System.out.println(k + ":" + v));

    }

    public void puntoDoce(){
        String palabra1;
        String palabra2;
        int i;

        System.out.print("Por favor ingrese la primer palabra: ");
        palabra1 = funcionesAuxiliares.leerFrase();
        System.out.print("Por favor ingrese la segunda palabra");
        palabra2 = funcionesAuxiliares.leerFrase();

        if (palabra1.equalsIgnoreCase(palabra2)){
            System.out.print("Las palabras son iguales");
        }

    }

    public void puntoTrece(){
        LocalDateTime fecha = LocalDateTime.now();

        System.out.println(fecha);


    }

    public void puntoCatorce(){
        int numero;
        boolean valido = false;

        do {
            System.out.println("Ingrese un numero entero menor o igual a 1000 por favor: ");
            numero = funcionesAuxiliares.leerInt();
            valido = (numero <= 1000) ? true : false;
        }
        while (!valido);
        while (numero <= 1000){
            System.out.println(numero);
            numero += 2;
        }

    }

    public void puntoQuince(){
        String menu;
        String seleccion;
        menu = "    ****** GESTION CINEMATOGRÁFICA ********\n" +
                "    1-NUEVO ACTOR\n" +
                "    2-BUSCAR ACTOR\n" +
                "    3-ELIMINAR ACTOR\n" +
                "    4-MODIFICAR ACTOR\n" +
                "    5-VER TODOS LOS ACTORES\n" +
                "    6-VER PELICULAS DE LOS ACTORES\n" +
                "    7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "    8-SALIR\n" +
                "    Por favor digite una opcion: ";

        do {
            System.out.print(menu);
            seleccion = funcionesAuxiliares.leerFrase();
            switch (seleccion){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }
        while (!seleccion.equalsIgnoreCase("8"));
    }

    public void puntoDiezSeis(){

        String nombre;
        int edad;
        char sexo;
        int peso;
        double altura;

        System.out.print("Por favor ingresa el nombre de la persona: ");
        nombre = funcionesAuxiliares.leerFraseMayus();
        System.out.print("Por favor ingrese el sexo de la persona (H o M): ");
        String aux = funcionesAuxiliares.leerFraseMayus();
        sexo = aux.charAt(0);
        System.out.print("Por favor ingrese la edad de la persona: ");
        edad = funcionesAuxiliares.leerInt();
        System.out.print("Por favor ingrese el peso en kg de la persona: ");
        peso = funcionesAuxiliares.leerInt();
        System.out.print("Por favor ingrese la altura en metros de la persona: ");
        altura = funcionesAuxiliares.leerDouble();

        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        funcionesAuxiliares.mensajeIMC(persona);
        funcionesAuxiliares.mensajeIMC(persona2);
        funcionesAuxiliares.mensajeIMC(persona3);
        System.out.println();

        funcionesAuxiliares.mensajeEdad(persona);
        funcionesAuxiliares.mensajeEdad(persona2);
        funcionesAuxiliares.mensajeEdad(persona3);
        System.out.println();

        System.out.println(persona.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

    }

    public void puntoDiezSiete(){
        int precioTotalElectrodomesticos = 0;
        int precioTotalLavadoras = 0;
        int precioTotalTelevisores = 0;
        ArrayList<Electrodomestiico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Electrodomestiico(200, 100,'F', "blanco"));
        electrodomesticos.add(new Lavadora(150, 100, 'A', "blanco", 40));
        electrodomesticos.add(new Televisor(250, 100,'D', "azul",41,false));
        electrodomesticos.add(new Electrodomestiico(150, 100,'A', "gris"));
        electrodomesticos.add(new Lavadora(100, 100, 'A', "dorado", 40));
        electrodomesticos.add(new Televisor(900, 100,'B', "azul",41,true));
        electrodomesticos.add(new Electrodomestiico(150, 100,'A', "azul"));
        electrodomesticos.add(new Lavadora(150, 100, 'A', "azul", 40));
        electrodomesticos.add(new Televisor(120, 100,'C', "rojo",27,false));
        electrodomesticos.add(new Electrodomestiico(150, 100,'F', "azul"));


        for (Electrodomestiico elemento: electrodomesticos){
            precioTotalElectrodomesticos += elemento.getPrecio();
            if (elemento instanceof Lavadora){
                precioTotalLavadoras += elemento.getPrecio();
            }
            else if (elemento instanceof  Televisor){
                precioTotalTelevisores += elemento.getPrecio();
            }
        }

        System.out.println("Precio total lavadoras: " + precioTotalLavadoras + "\n" +
                "Precio total televisores: " + precioTotalTelevisores + "\n" +
                "Precio total electrodomesticos:" +precioTotalElectrodomesticos);

    }

}
