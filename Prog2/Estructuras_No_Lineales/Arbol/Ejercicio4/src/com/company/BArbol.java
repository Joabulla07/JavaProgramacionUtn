package com.company;

public class BArbol {
    NodoArbol primero;

    public void BArbol(NodoArbol raiz){
        this.primero = raiz;
    }

    public int getNumElementos(){
        
    }

    public int getProfundidad(){

    }

    public boolean esHoja(){}

    public int caminoMinimo(){}

    public BArbol copia(){}

    public boolean sonIguales(BArbol s){}

    public Object MaxNodo(){}

    public Object MinNodo(){}

    public Object MaxHoja(){}

    public Object MinHoja(){}

    public Object MaxDelNivel(int nivel){}

    public Object MinDelNivel(int nivel){}

    public boolean estaEn(Object e){}

    @Override
    public String toString() {
        return "BArbol{" +
                "primero=" + primero +
                '}';
    }
}
