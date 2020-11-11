package com.company;

public class Main {

    public static void main(String[] args) {
	    ListaSimple lista1 = new ListaSimple();

	    lista1.agregarAlfinal(5);
        lista1.agregarAlfinal(10);
        lista1.agregarAlfinal(500);
        lista1.agregarAlfinal(50);
        lista1.borrarPorPosicion(2);
        lista1.imprimir();

    }
}
