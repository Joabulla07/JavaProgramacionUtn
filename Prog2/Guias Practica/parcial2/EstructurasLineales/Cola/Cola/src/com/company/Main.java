package com.company;

public class Main {

    public static void main(String[] args) {
        Cola cola1 = new Cola();

        cola1.insertar(8);
        cola1.insertar(2);
        cola1.insertar(9);
        cola1.insertar(4);
        cola1.insertar(5);

        cola1.imprimir();
        cola1.desencolar();
        cola1.imprimir();
        System.out.println(cola1.primero.getValor());

    }
}
