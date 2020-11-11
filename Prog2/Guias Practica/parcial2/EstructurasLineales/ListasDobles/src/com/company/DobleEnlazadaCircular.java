package com.company;

public class DobleEnlazadaCircular {
    private Nodo primero;
    private Nodo ultimo;
    private  int tamanio;

    public void ListaSimpleCircular(){
        primero = null;
        ultimo = null;
        tamanio = 0;
    }

    public boolean esVacia(){
        return primero == null;
    }

    public int getTamanio(){
        return tamanio;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void agregarAlfinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setData(valor);
        if(esVacia()){
            primero = nuevo;
            ultimo = nuevo;
            ultimo.setNext(primero);
            primero.setPrev(ultimo);
        }
        else{
            ultimo.setNext(nuevo);
            nuevo.setNext(primero);
            nuevo.setPrev(ultimo);
            primero.setPrev(nuevo);
            ultimo = nuevo;
        }
        tamanio++;
    }

    public void agregarAlInicio(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setData(valor);

        if(esVacia()){
            primero = nuevo;
            ultimo = nuevo;
            ultimo.setNext(primero);
            primero.setPrev(ultimo);
        }
        else{
            nuevo.setNext(primero);
            primero.setPrev(nuevo);
            primero = nuevo;
            ultimo.setNext(primero);
            primero.setPrev(ultimo);
        }
        tamanio++;
    }
    public void agregarPorPosicion(int posicion, int valor){
        if(posicion>=0 && posicion<=tamanio){
            Nodo nuevo = new Nodo();
            nuevo.setData(valor);

            if(posicion == 0){
                nuevo.setNext(primero);
                primero.setPrev(nuevo);
                primero = nuevo;
                ultimo.setNext(primero);
                primero.setPrev(ultimo);
            }
            else{
                if(posicion == tamanio){
                    ultimo.setNext(nuevo);
                    nuevo.setPrev(ultimo);
                    nuevo.setNext(primero);
                    primero.setPrev(nuevo);
                    ultimo = nuevo;
                }
                else{
                    Nodo aux = primero;
                    for(int i=0;i<(posicion-1);i++){
                        aux = aux.getNext();
                    }
                    Nodo siguiente = aux.getNext();
                    aux.setNext(nuevo);
                    nuevo.setPrev(aux);
                    nuevo.setNext(siguiente);
                    siguiente.setPrev(nuevo);
                }
            }
            tamanio++;
        }
    }
//
    public void borrarPorPosicion(int posicion){
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                primero = primero.getNext();
                ultimo.setNext(primero);
                primero.setPrev(ultimo);
            }
            else{
                Nodo aux = primero;
                for(int i=0;i<posicion-1;i++){
                    aux = aux.getNext();
                }
                if(aux.getNext() == ultimo){
                    aux.setNext(primero);
                    primero.setPrev(aux);
                    ultimo = aux;
                }
                else{
                    Nodo siguiente = aux.getNext();
                    aux.setNext(siguiente.getNext());
                    siguiente.getNext().setPrev(aux);
                }
            }
            tamanio--;
        }
    }

    public void imprimir(){
        if(!esVacia()){
            Nodo aux = primero;
            int i=0;
            do{
                System.out.println(aux.getData());
                aux = aux.getNext();
                i++;
            }while(aux != primero);
        }
    }

    public void imprimirPorPosicion(int posicion){
        if(!esVacia()){
            Nodo aux = primero;
            int i=0;
            do{
                if(posicion == i) {
                    System.out.println(aux.getData());
                }
                aux = aux.getNext();
                i++;
            }while(aux != primero);
        }
    }

}
