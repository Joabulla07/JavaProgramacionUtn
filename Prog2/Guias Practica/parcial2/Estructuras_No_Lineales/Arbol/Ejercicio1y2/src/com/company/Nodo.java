package com.company;

class Nodo {
    private int dato;
    private Nodo izquierda, derecha;
    private Nodo next;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    public Nodo(){
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getDato() {
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

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}
