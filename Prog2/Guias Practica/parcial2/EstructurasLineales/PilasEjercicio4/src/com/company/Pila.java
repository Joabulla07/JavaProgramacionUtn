package com.company;

public class Pila {
    private Nodo primero;
    private int tamanio;

    public void Pila(){
        primero = null;
        tamanio=0;
    }

    public  boolean esVacia(){
        return primero == null;
    }

    public int getTamanio(){
        return tamanio;
    }

    public void apilar(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if(esVacia()){
            primero = nuevo;
        }
        else{
            nuevo.setNext(primero);
            primero = nuevo;
        }
        tamanio++;
    }
    //Elimina el elemento que se encuentra en el tope de la piala.
    public void retirar(){
        if(!esVacia()){
            primero = primero.getNext();
            tamanio--;
        }
    }

    public void listar(){
        Nodo aux = primero;
        while(aux != null){
            System.out.println(aux.getValor());
            aux = aux.getNext();
        }
    }
}
