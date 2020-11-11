package com.company;

public class Main {

    public static void main(String[] args) {
	    int a=9;
	    int b=2;
	    int c=0;

	    System.out.println(dividir(a,b,c));
    }

    public static int dividir(int a, int b, int c){
        if(a>=b){
            return dividir(a-b, b, c+1);
        }
        else{
            return c;
        }
    }
}
