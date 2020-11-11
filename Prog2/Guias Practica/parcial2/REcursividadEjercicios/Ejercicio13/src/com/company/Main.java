package com.company;

public class Main {

    public static void main(String[] args) {
	    int n=10;

	    System.out.println(positivo(n));
    }

    public static boolean positivo(int n){
        if(n>0){
            return true;
        }
        else{
            return negativo(n);
        }
    }

    public static boolean negativo(int n){
        if(n<0){
            return false;
        }
        else{
            return positivo(n);
        }
    }
}
