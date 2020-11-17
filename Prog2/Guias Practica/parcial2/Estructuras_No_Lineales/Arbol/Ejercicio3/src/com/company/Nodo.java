package com.company;

class Nodo {
    private char dato;
    private Nodo izquierda, derecha;

    public Nodo(char dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    public Nodo(){
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public char getDato() {
        return dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}

