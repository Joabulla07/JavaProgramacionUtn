package com.company;

public class Main {

    public static void main(String[] args) {
        DobleEnlazadaCircular lista1 = new DobleEnlazadaCircular();

        lista1.agregarAlfinal(5);
        lista1.agregarAlfinal(10);
        lista1.agregarAlfinal(500);
        lista1.agregarPorPosicion(1,54545);
        lista1.agregarAlInicio(80);
        lista1.imprimir();

        //System.out.println(lista1.getTamanio());


    }
}
