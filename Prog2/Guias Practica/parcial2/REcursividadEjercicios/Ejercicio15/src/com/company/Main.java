package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num;
        int i;
        int array[];
        int mayor=0;
        System.out.println("Ingrese tamaño del arreglo:");
        n = sc.nextInt();
        array = new int[n];

        for(i=0; i<n;i++){
            System.out.println("Ingrese numero para posicion "+(i+1)+" :");
            num = sc.nextInt();
            array[i]=num;
        }

        System.out.println("El numero mayor es: "+buscar(array, n-1, mayor));
    }

    public static int buscar(int array[], int n, int mayor){
        if(n==0){
            if(array[n]>mayor){
                mayor = array[n];
                return mayor;
            }
            else{
                return mayor;
            }
        }
        else{
            if(array[n]>mayor){
                mayor = array[n];
                return buscar(array,n-1,mayor);
            }
            else{
                return buscar(array,n-1,mayor);
            }
        }
    }
}
