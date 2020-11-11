package com.company;

class NodoArbol {
    private int dato;
    private NodoArbol izquierda, derecha;
    private NodoArbol next;

    public NodoArbol(int dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    public NodoArbol(){
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }

    public NodoArbol getNext() {
        return next;
    }

    public void setNext(NodoArbol next) {
        this.next = next;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}

