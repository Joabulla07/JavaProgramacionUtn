package com.company;

import java.util.Scanner;

public class Grafo {

    Nodo grafo[];
    int nroVertices;

    public Grafo(int nroVertices){
        this.nroVertices = nroVertices;
        grafo = new Nodo[this.nroVertices];

        for(int i = 0; i < grafo.length; i++){
            grafo[i] = null;
        }
    }

    public int getNroVertices() {
        return nroVertices;
    }

    public void setNroVertices(int nroVertices) {
        this.nroVertices = nroVertices;
    }

    public boolean existeArista(int v1, int v2){
        Nodo actual = grafo[v1];
        while(actual != null){
            if(actual.vertice == v2) return true;
            actual = actual.sgte;
        }
        return false;
    }

    public void insertarArista(int v1, int v2, int peso){
        if(!existeArista(v1, v2)){
            Nodo nuevo = new Nodo(v2, peso);

            if(grafo[v1] == null){
                grafo[v1] = nuevo;
                insertarArista(v2, v1,peso);
            }
            else{
                Nodo actual = grafo[v1];

                while(actual.sgte != null)
                {
                    actual = actual.sgte;
                }
                actual.sgte = nuevo;
                insertarArista(v2,v1,peso);
            }
        }
    }

    public void eliminarArista(int v1, int v2){
        if(existeArista(v1, v2)){
            if(grafo[v1].vertice == v2){
                grafo[v1] = grafo[v1].sgte;
                eliminarArista(v2,v1);
                return;
            }
            Nodo actual = grafo[v1].sgte;
            Nodo anterior = grafo[v1];

            while(actual != null){
                if(actual.vertice == v2){
                    anterior.sgte = actual.sgte;
                    eliminarArista(v2,v1);
                    return;
                }
                anterior = actual;
                actual = actual.sgte;
            }
        }
    }

    public void mostrarGrafo(){
        for( int i = 0; i < grafo.length; i++){
            Nodo actual = grafo[i];

            while(actual != null){
                System.out.printf("%d -> " , i);
                System.out.printf("%d(%d) \n" , actual.vertice, actual.pesoArista);

                actual = actual.sgte;
            }
            System.out.println();
        }
    }

    public void eliminarGrafo(){
        for( int i = 0; i < grafo.length; i++){
            grafo[i] = null;
        }
    }

    // ----- Operaciones para obtener la lista de adyacentes -----//
    public boolean existeAdyacentes(int v){
        if(grafo[v] == null) return false;
        return true;
    }

    public Nodo getFirstAdy(int v){
        return grafo[v];
    }

    //Si retorna null es que no hay más adyacentes
    public Nodo getNextAdy(Nodo anteriorAd){
        return anteriorAd.sgte;
    }

    public void getAdList(Grafo g){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserte vertice");
        int v = in.nextInt();
        if(!g.existeAdyacentes(v)){
            System.out.println("La lista esta vacia");
        }
        else{
            Nodo aux = g.getFirstAdy(v);
            System.out.println("Lista: ");
            while(aux != null){
                System.out.print(" " + aux.vertice);
                aux = g.getNextAdy(aux);
            }
            System.out.println();
        }
    }

    public void addArista(Grafo g){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese v1 y v2");
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        System.out.println("Ingrese el peso de la arista");
        int peso = in.nextInt();
        g.insertarArista(v1, v2, peso);
    }

    public void deleteArista(Grafo g){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese v1 y v2");
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        if(g.existeArista(v1, v2))g.eliminarArista(v1, v2);
        else System.out.println("Arista buscada no existe");
    }

    public void deleteGraph(Grafo g){
        System.out.println("Borrando grafo");
        g.eliminarGrafo();
    }

    public void showGraph(Grafo g){
        g.mostrarGrafo();
    }

    public void menu(){
        System.out.println("1. Añadir arista");
        System.out.println("2. Eliminar arista");
        System.out.println("3. Eliminar Grafo");
        System.out.println("4. Mostrar Grafo");
        System.out.println("5. Obtener lista Adyacencia vertice");
        System.out.println("6. Salir");
    }

}

