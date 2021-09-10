package com.sofka.laboratorio;

public class Main {
    public static void main(String[] args) {

        FuncionesAuxiliares funcionesAuxiliares = new FuncionesAuxiliares();
        Puntos puntos = new Puntos();

        int eleccion = -1;


        do {
            System.out.println("Bienvenido al laboratorio de Jean Trujillo, eliga una opcion: \n" +
                    "0) Salir \n" +
                    "1) Punto 1 \n" +
                    "2) Punto 2 \n" +
                    "3) Punto 3 \n" +
                    "4) Punto 4 \n" +
                    "5) Punto 5 \n" +
                    "6) Punto 6 \n" +
                    "7) Punto 7 \n" +
                    "8) Punto 8 \n" +
                    "9) Punto 9 \n" +
                    "10) Punto 10 \n" +
                    "11) Punto 11 \n" +
                    "12) Punto 12 \n" +
                    "13) Punto 13 \n" +
                    "14) Punto 14 \n" +
                    "15) Punto 15 \n" +
                    "16) Punto 16 \n" +
                    "17) Punto 17 \n" +
                    "18) Punto 18");

            eleccion = funcionesAuxiliares.leerInt();
            switch (eleccion){
                case 1:
                    puntos.puntoUno();
                    break;
                case 2:
                    puntos.puntoDos();
                    break;
                case 3:
                    puntos.puntoTres();
                    break;
                case 4:
                    puntos.puntoCuatro();
                    break;
                case 5:
                    puntos.puntoCinco();
                    break;
                case 6:
                    puntos.puntoSeis();
                    break;
                case 7:
                    puntos.puntoSiete();
                    break;
                case 8:
                    puntos.puntoOcho();
                    break;
                case 9:
                    puntos.puntoNueve();
                    break;
                case 10:
                    puntos.puntoDiez();
                    break;
                case 11:
                    puntos.puntoOnce();
                    break;
                case 12:
                    puntos.puntoDoce();
                    break;
                case 13:
                    puntos.puntoTrece();
                    break;
                case 14:
                    puntos.puntoCatorce();
                    break;
                case 15:
                    puntos.puntoQuince();
                    break;
                case 16:
                    puntos.puntoDiezSeis();
                    break;
                case 17:
                    puntos.puntoDiezSiete();
                    break;
                case 18:
                    puntos.puntoDiezOcho();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
        while (eleccion != 0);

    }
}
