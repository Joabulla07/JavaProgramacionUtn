package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int opcion;
        Grafo g = new Grafo(5);

        do{
            g.menu();

            System.out.println("Ingrese una opcion");
            Scanner in = new Scanner(System.in);
            opcion = in.nextInt();

            switch(opcion){
                case 1: g.addArista(g);break;
                case 2: g.deleteArista(g);break;
                case 3: g.deleteGraph(g);break;
                case 4: g.showGraph(g);break;
                case 5: g.getAdList(g);break;
                case 6: break;
                default: System.out.println("Incorrect option");
            }
        }while(opcion != 6);
    }

}
