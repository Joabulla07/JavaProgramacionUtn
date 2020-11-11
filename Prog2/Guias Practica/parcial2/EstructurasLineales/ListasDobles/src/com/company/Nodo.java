package com.company;

public class Nodo {
    private int data;
    private Nodo next;
    private Nodo prev;

    public Nodo() {
    }

    public Nodo(int data) {
        this.data = data;
    }


    public int getData() {

        return data;
    }

    public void setData(int data) {

        this.data = data;
    }

    public Nodo getNext() {

        return next;
    }

    public void setNext(Nodo next) {

        this.next = next;
    }

    public Nodo getPrev() {

        return prev;
    }

    public void setPrev(Nodo prev) {

        this.prev = prev;
    }

}

