package com.company;

public class Main {

    public static void main(String[] args) {
	    int n=2;
	    System.out.println(Conejo(n));
    }

    public static int Conejo(int n){
        if (n == 0) {
            System.out.println("bunnyEars(" + n + ")" + "→ " + 0);
        } else {

            Conejo(n - 1);

            int a = n;
            int b = a;
            a += b;

            System.out.println("bunnyEars(" + n + ")" + "→ " + a);
        }
        return 0;

    }
}
