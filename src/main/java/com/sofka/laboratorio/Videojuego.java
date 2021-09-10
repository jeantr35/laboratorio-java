package com.sofka.laboratorio;

public class Videojuego implements Entregable {
    String titulo;
    int horasEstimadas;
    boolean entregado;
    String genero;
    String compania;

    private static final int horasEstimadasDefault = 10;
    private static final boolean entregadoDefault = false;

    public Videojuego() {
        this.titulo = "";
        this.genero = "";
        this.compania = "";
        this.horasEstimadas = horasEstimadasDefault;
        this.entregado = entregadoDefault;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = "";
        this.compania = "";
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregadoDefault;
    }

    public Videojuego(String titulo, int numeroDeTemporadas, String compania, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasEstimadas = numeroDeTemporadas;
        this.entregado = entregadoDefault;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + "\n" +
                "Horas estimadas: " + getHorasEstimadas() + "\n" +
                "Genero: " + getGenero() + "\n" +
                "Compania: " + getCompania() + "";
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuego videojuego2 = (Videojuego) a;
        if (videojuego2.getHorasEstimadas() >= getHorasEstimadas()){
            return videojuego2.getHorasEstimadas();
        }
        return getHorasEstimadas();
    }
}