package com.damas;

public interface Movible {
    public enum Direccion{
        ARRIBA,
        ABAJO,
        IZQUIERDA,
        DERECHA
    }

    public boolean mover(Direccion Direccion);
}