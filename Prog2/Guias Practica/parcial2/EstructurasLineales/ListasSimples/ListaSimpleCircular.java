package com.company;

public class ListaSimpleCircular {
    private Nodo primero;
    private Nodo ultimo;
    private int tamanio;

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

    public void agregarAlfinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setData(valor);
        if(esVacia()){
            primero = nuevo;
            ultimo = nuevo;
            ultimo.setNext(primero);
        }
        else{
            ultimo.setNext(nuevo);
            nuevo.setNext(primero);
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
        }
        else{
            nuevo.setNext(primero);
            primero = nuevo;
            ultimo.setNext(primero);
        }
        tamanio++;
    }

    public void insertarPorPosicion(int posicion, int valor){
        if(posicion>=0 && posicion<=tamanio){
            Nodo nuevo = new Nodo();
            nuevo.setData(valor);

            if(posicion == 0){
                nuevo.setNext(primero);
                primero = nuevo;
                ultimo.setNext(primero);
            }
            else{
                if(posicion == tamanio){
                    ultimo.setNext(nuevo);
                    nuevo.setNext(primero);
                    ultimo = nuevo;
                }
                else{
                    Nodo aux = primero;
                    for(int i=0;i<(posicion-1);i++){
                        aux = aux.getNext();
                    }
                    Nodo siguiente = aux.getNext();
                    aux.setNext(nuevo);
                    nuevo.setNext(siguiente);
                }
            }
            tamanio++;
        }
    }

    public void borrarPorPosicion(int posicion){
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                primero = primero.getNext();
                ultimo.setNext(primero);
            }
            else{
                Nodo aux = primero;
                for(int i=0;i<posicion-1;i++){
                    aux = aux.getNext();
                }
                if(aux.getNext() == ultimo){
                    aux.setNext(primero);
                    ultimo = aux;
                }
                else{
                    Nodo siguiente = aux.getNext();
                    aux.setNext(siguiente.getNext());
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
