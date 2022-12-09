package com.damas;

public abstract class Ficha implements Movible {
    private int fila;
    private int columna;
    private boolean oculta;

    //Geters and seters

    public int getFila() {
        return fila;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }
    public int getColumna() {
        return columna;
    }
    public void setColumna(int columna) {
        this.columna = columna;
    }
    public boolean isOculta() {
        return oculta;
    }
    public void setOculta(boolean oculta) {
        this.oculta = oculta;
    }

    //Constructores

    public Ficha(int fila, int columna, boolean oculta) {
        this.fila = fila;
        this.columna = columna;
        this.oculta = oculta;
        if((columna%2!=0 || fila%2!=0) && fila != columna){
            oculta = false;
        }else{
            oculta = true;
        }
    }
    public Ficha(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        if((columna%2!=0 || fila%2!=0) && fila != columna){
            this.oculta = false;
        }else{
            this.oculta = true;
        }
    }
    
    //Métodos

    public void setPosicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    
}
