package com.company;

public class Main {

    public static void main(String[] args) {
	    int digitos=3;
	    int n=105;
	    int sumar =0;

	    System.out.println(suma(n,sumar));
    }


    public static int suma(int n,int sumar){
        if(n<10) {
            sumar = sumar+n;
            return sumar;
        }
        else{
            sumar = sumar + n%10;
            return suma(n/10,sumar);
        }
    }
}
