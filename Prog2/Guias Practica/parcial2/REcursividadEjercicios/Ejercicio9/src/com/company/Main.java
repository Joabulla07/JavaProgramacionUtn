package com.company;

public class Main {

    public static void main(String[] args) {
	    int digitos=3; //digitos a invertir
	    int n=126; //el numero a invertir
        int numero=0;

        System.out.println(invertir(n, digitos,numero));
    }

    public static int invertir(int n, int digitos, int numero){
        if(digitos==0){
            return numero;
        }
        else{
            numero = numero +(int) ((n%10)*Math.pow(10, digitos-1));
            return invertir(n/10,digitos-1,numero);
        }
    }
}
