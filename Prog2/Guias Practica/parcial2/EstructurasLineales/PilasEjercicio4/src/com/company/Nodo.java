package com.company;

public class Nodo {
    private int valor;
    private Nodo Next;

    public void Nodo(){
        this.valor = 0;
        this.Next = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNext() {
        return Next;
    }

    public void setNext(Nodo next) {
        Next = next;
    }
}
