package com.company;

public class Main {

    public static void main(String[] args) {
        int n=1;
        imprimir(n);

    }

    private static int imprimir(int n) {
        if (n <= 10) {
            imprimir(n+1);
            System.out.println(n);
        }
        return n;
    }
}
