package com.company;

public class Main {

    public static void main(String[] args) {
	    int n=123; //numero a verificar
        int contar=0; //cvontador de veces de 7

        System.out.println(siete(n, contar));
    }

    public static int siete(int n, int contar){
        int ver=0;
        if(n<10){
            if(n==7){
                return contar+1;
            }
        }
        else{
            ver = n%10;
            if(ver==7){
                return siete(n/10,contar+1);
            }
            else{
                return siete(n/10, contar);
            }
        }
        return 0;
    }
}
