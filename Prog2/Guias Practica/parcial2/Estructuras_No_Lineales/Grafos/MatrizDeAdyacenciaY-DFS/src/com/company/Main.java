package com.company;


import java.util.Scanner;



// MATRIZ DE ADYASENCIA, RECORRIDO DFS Y BFS


public class Main {

    public static void main(String[] args) {

            int v, e ;
            Scanner sc = new Scanner(System.in);
            GrafoMatrizDeAdyacencia graph;


                System.out.println("Ingrese numero de vertices: ");
                v = sc.nextInt();
                System.out.println("Ingrese cantidad de Arcos(union entre nodos): ");
                e = sc.nextInt();

                graph = new GrafoMatrizDeAdyacencia(v);

                graph.generarMatriz(e);

                graph.mostrar(v);

                graph.imprimirRecorrido();
        }



}

