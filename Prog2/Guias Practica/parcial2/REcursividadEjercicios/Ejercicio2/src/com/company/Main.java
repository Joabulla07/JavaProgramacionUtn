package com.company;

public class Main {

    public static void main(String[] args) {
	    int n=10;
	    Tabla(n);
    }

    public static int Tabla(int n){
        int number = n;
        if(n>0){
            Tabla(number-1);
            while(number !=9){
                number++;
            }
            System.out.println(n + "x"+ number + "=" + n*number);
        }
        return 0;
    }
}
