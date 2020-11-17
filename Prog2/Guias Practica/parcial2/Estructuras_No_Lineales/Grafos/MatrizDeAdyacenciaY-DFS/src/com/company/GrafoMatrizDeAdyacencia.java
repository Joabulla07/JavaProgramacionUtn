package com.company;

import java.util.*;

public class GrafoMatrizDeAdyacencia {
    Scanner sc = new Scanner(System.in);
    private final int vertices;
    private int[][] adjacency_matrix;
    boolean[] visitados;

    public GrafoMatrizDeAdyacencia(int v)
    {
        vertices = v;
        adjacency_matrix = new int[vertices + 1][vertices + 1];
    }

    public void makeEdge(int to, int from, int edge)
    {
        adjacency_matrix[to][from] = edge;


    }

    public int getEdge(int to, int from)
    {

        return adjacency_matrix[to][from];

    }

    public void generarMatriz(int e){
        int count=1;
        int to=0 , from=0;
        while(count <= e){
            System.out.println("Ingrese punto desde: ");
            to = sc.nextInt();
            System.out.println("Ingrese punto hasta: ");
            from = sc.nextInt();
            System.out.println("Ingrese el peso: ");
            int peso = sc.nextInt();

            makeEdge(to, from, peso);
            makeEdge(from,to,peso);
            count++;
        }
    }

    public String BFS(int in) {
        if (adjacency_matrix.length != 0) {
            visitados = new boolean[adjacency_matrix.length];
            Queue<Integer> cola = new LinkedList<>();
            ArrayList<Integer> recorridos = new ArrayList<>();
            recorridos.add(in);
            cola.add(in);
            visitados[in] = true;
            String c = "";
            while (!cola.isEmpty()) {
                int i = cola.remove();
                c = c + i + "";
                for (int j = 0; j < adjacency_matrix.length; j++) {
                    if (adjacency_matrix[i][j] != 0 && !visitados[j]) {
                        cola.add(j);
                        recorridos.add(j);
                        visitados[j] = true;
                    }
                }
            }
            return c;
        } else {
            return "No se ha creado el grafo";
        }
    }

    public String DFS(int in) {
        if (adjacency_matrix.length != 0) {
            visitados = new boolean[adjacency_matrix.length];
            Stack<Integer> pila = new Stack<>();
            ArrayList<Integer> recorridos = new ArrayList<>();
            recorridos.add(in);
            pila.add(in);
            visitados[in] = true;
            String c = "";
            while (!pila.isEmpty()) {
                int i = pila.pop();
                c = c + i + "";
                for (int j = 0; j < adjacency_matrix.length; j++) {
                    if (adjacency_matrix[i][j] != 0 && !visitados[j]) {
                        pila.add(j);
                        recorridos.add(j);
                        visitados[j] = true;
                    }
                }
            }
            return c;
        } else {
            return "No se ha creado el grafo";
        }
    }

    public void mostrar(int vertices){
        System.out.println("La matriz de adyasencia es: ");
        System.out.print("  ");
        for (int i = 1; i <= vertices; i++)
            System.out.print(i + " ");
        System.out.println();

        for (int i = 1; i <= vertices; i++){
            System.out.print(i + " ");
            for (int j = 1; j <= vertices; j++)
                System.out.print(getEdge(i, j) + " ");
            System.out.println();
        }
    }

    public void imprimirRecorrido(){
        System.out.println("RECORRIDOS: ");
        System.out.println("Ingrese Nodo inicial del recorrido:");
        int nodo = sc.nextInt();
        System.out.println("RECORRIDO EN ANCHURA");
        System.out.println(BFS(nodo));

        System.out.println("RECORRIDO EN PROFUNDIDAD");
        System.out.println(DFS(nodo));
    }

}
