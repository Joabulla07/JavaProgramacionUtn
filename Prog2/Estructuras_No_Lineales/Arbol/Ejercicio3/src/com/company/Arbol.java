package com.company;

class Arbol {
    private Nodo raiz;

    public Arbol() {

    }

    public Nodo getRaiz() {
        return raiz;
    }


    public void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

}
