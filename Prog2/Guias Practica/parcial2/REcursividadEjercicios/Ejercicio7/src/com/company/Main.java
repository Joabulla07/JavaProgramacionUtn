package com.company;

public class Main {

    public static void main(String[] args) {
	    int n=3;
	    int b=1;
	    System.out.println(factorial(n,b));
    }

    public static int factorial(int n, int b){
        if (n == 0) {
            return b;
        } else {

            b = factorial(n - 1, b * n);

            return b;
        }
    }
}
