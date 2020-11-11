package com.company;

public class Main {

    public static void main(String[] args) {
	    int a=0;
	    int b=0;
	    int n=10;
    }

    // n recibe cantidad de conejos
     // a tiene que ser 0 por default se utiliza para contar las catidad de orejas
     // b tiene que ser 0 por default  se utiliza para representar la cantidad de conejos.

    //Se puede hacer una mayor abstraccion, tratar encapsular aun mas.
    public static int bunnyEarsTres(int n, int a, int b) {
        if (n == 0) {
            System.out.println("bunnyEars(" + b + ")" + "→ " + a);
            return 0;
         }
        else if (n % 2 != 0) {
            System.out.println("bunnyEars(" + b + ")" + "→ " + a);
            bunnyEarsTres(n - 1, a + 3, b + 1);
        }
        else {
            System.out.println("bunnyEars(" + b + ")" + "→ " + a);
            bunnyEarsTres(n - 1, a + 2, b + 1);
        }
        return 0;
    }
}
