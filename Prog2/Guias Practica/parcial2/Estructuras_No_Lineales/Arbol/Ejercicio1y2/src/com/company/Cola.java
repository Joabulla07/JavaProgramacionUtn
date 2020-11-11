package com.company;

public class Cola {
    Nodo primero;
    Nodo ultimo;
    int tamano;

    public Cola(){
        primero = null;
        ultimo = null;
        tamano=0;
    }

    public boolean esVacia(){
        return primero == null;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void insertar(Nodo nuevo){

        if(esVacia()){
            primero = nuevo;
            ultimo = nuevo;
        }
        else{
            Nodo aux = primero;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
            ultimo = nuevo;
        }
        tamano++;
    }

    public Nodo desencolar(){ //
        Nodo aux=null;
        if(!esVacia()){
            aux = primero;
            primero = primero.getNext();
            tamano--;
        }
        else{
            System.out.println("Cola vacia!");
        }
        return aux;
    }

    public void imprimir(){
        if(!esVacia()){
            Nodo aux = primero;

            for(int i=0;i<tamano;i++){
                System.out.println("posicion "+(i+1)+" :"+aux.getDato());
                aux = aux.getNext();
            }
        }
    }

}



