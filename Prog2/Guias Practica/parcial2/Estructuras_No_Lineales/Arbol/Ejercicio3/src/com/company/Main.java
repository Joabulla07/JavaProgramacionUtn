package com.company;

public class Main {

    public static void main(String[] args) {
	    Arbol arbol = new Arbol();

	    Nodo raiz = new Nodo('+');
	    Nodo raizDerecha = new Nodo('-');
	    Nodo raizIzquierda = new Nodo('*');
	    raizIzquierda.setIzquierda(new Nodo('1'));
	    raizIzquierda.setDerecha(new Nodo('3'));
	    raizDerecha.setDerecha(new Nodo('6'));
	    raizDerecha.setIzquierda(new Nodo('1'));
	    raiz.setIzquierda(raizIzquierda);
	    raiz.setDerecha(raizDerecha);

		System.out.println("Recorrido Preorden: ");
        arbol.preorden(raiz);


    }
}
