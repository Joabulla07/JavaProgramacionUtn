package com.company;

public class ListaSimple {

    Nodo primero;
    int tamano;


    public ListaSimple() {
        primero = null;
        this.tamano = 0;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public boolean esVacia(){
        return primero == null;
    }

    public void agregarPorPosicion(int posicion, int valor){
        Nodo nuevo = new Nodo();
        nuevo.setData(valor);

        if(posicion>=0 && posicion<=tamano) {
            if (posicion == 0) {//se inserta al inicio
                nuevo.setNext(primero);
                primero = nuevo;
            } else {
                if (posicion == tamano) {//se inserta al final
                    Nodo aux = primero;
                    while (aux.getNext() != null) {
                        aux = aux.getNext();
                    }
                    aux.setNext(nuevo);
                } else { //si el nodo a insertar va al medio
                    Nodo aux = primero;
                    for (int i = 0; i < (posicion - 1); i++) {
                        aux = aux.getNext();
                    }
                    Nodo siguiente = aux.getNext();
                    aux.setNext(nuevo);
                    nuevo.setNext(siguiente);
                }

            }
            tamano++;
        }
        else{
            System.out.println("Error en posicion.");
            System.out.println("Esta vacia: "+esVacia());
            System.out.println("Tamaño: "+getTamano());
        }
    }

    public void agregarAlfinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setData(valor);

        if(esVacia()){
            primero = nuevo;
        }
        else{
            Nodo aux = primero;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
        }
        tamano++;
    }

    public void agregarAlInicio(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setData(valor);

        if(esVacia()){
            primero = nuevo;
        }
        else{
            nuevo.setNext(primero);
            primero = nuevo;
        }
        tamano++;
    }

    public void borrarPorPosicion(int posicion){
        if(posicion >=0 && posicion<tamano){ //esta en el rango
            if(posicion == 0){
                primero = primero.getNext();
            }
            else{
                Nodo aux = primero;
                for(int i=0;i<posicion-1;i++){
                    aux = aux.getNext();
                }
                Nodo siguiente = aux.getNext();
                aux.setNext(siguiente.getNext());
            }
            tamano--;
        }
        else{
            System.out.println("Error en posicion.");
            System.out.println("Esta vacia: "+esVacia());
            System.out.println("Tamaño: "+getTamano());
        }
    }

    public void imprimir(){
        if(!esVacia()){
            Nodo aux = primero;
            int i=0;

            while(aux != null){
                System.out.println(aux.getData());
                aux = aux.getNext();
                i++;
            }
        }
    }

    public void imprimirPorPosicion(int posicion){
        if(!esVacia()){
            Nodo aux = primero;
            int i=0;

            while(aux != null){
                if(posicion == i){
                    System.out.println(aux.getData());
                }
                aux = aux.getNext();
                i++;
            }
        }
    }
}


