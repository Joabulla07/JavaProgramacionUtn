package com.company;

public class Main {

    public static void main(String[] args) {
	    int n=19;

	    System.out.println(par(n));
    }

    public static boolean par(int n){
        if(n%2 == 0){
            return true;
        }
        else return impar(n);
    }

    public static boolean impar(int n){
        if(n%2 != 0){
            return false;
        }
        else return par(n);
    }
}
