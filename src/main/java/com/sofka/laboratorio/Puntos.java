package com.sofka.laboratorio;


public class Puntos {
    LectorTeclado lectorTeclado = new LectorTeclado();

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

    public void puntoTres(){
        double radio;

        System.out.print("Por favor ingrese el radio de el circulo: ");
        radio = lectorTeclado.leerDouble();
        System.out.println("El valor del area del circulo es: " + (Math.PI*Math.pow(radio,2)));

    }

    public void puntoCuatro(){
        double precio;

        System.out.print("Por favor ingrese el valor del articulo: ");
        precio = lectorTeclado.leerDouble();
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
            numero = lectorTeclado.leerDouble();
        }
        while (numero < 0);
        System.out.println("Su numero ingresado fue: " + numero);
    }

    public void puntoOcho(){
        String dia;
        boolean valido = false;
        do {
            System.out.print("Por favor ingrese un dia de la semana: ");
            dia = lectorTeclado.leerFrase();

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
        frase = frase.concat(lectorTeclado.leerFrase());
        System.out.println(frase);
    }

    public void puntoDiez(){
        String frase = "";

        System.out.print("Por favor ingrese la frase: ");
        frase = lectorTeclado.leerFrase();
        frase = frase.replace(" ", "");
        System.out.println(frase);
    }

}
