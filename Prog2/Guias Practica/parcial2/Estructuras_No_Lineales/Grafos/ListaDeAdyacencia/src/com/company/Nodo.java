package com.company;

class Nodo{
    int vertice;
    int pesoArista;
    Nodo sgte;

    public Nodo(int v, int p){
        this.vertice = v;
        this.pesoArista = p;

        sgte = null;
    }
}
