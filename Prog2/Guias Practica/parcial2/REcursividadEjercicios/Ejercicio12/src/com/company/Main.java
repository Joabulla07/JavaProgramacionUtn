package com.company;

import java.nio.Buffer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num;
        int i;
        int suma=0; //acumulador
        int array[];
        System.out.println("Ingrese tamaño del arreglo:");
        n = sc.nextInt();
        array = new int[n];

        for(i=0; i<n;i++){
            System.out.println("Ingrese numero para posicion "+(i+1)+" :");
            num = sc.nextInt();
            array[i]=num;
        }

        System.out.println("La suma total es: "+sumar(array, n-1, suma));
    }

    public static int sumar(int array[], int n, int suma){
        if(n==0){
            return suma + array[0];
        }
        else{
            suma = suma + array[n];
            return sumar(array, n-1, suma);
        }
    }
}
