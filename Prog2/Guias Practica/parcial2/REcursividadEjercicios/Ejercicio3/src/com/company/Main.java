package com.company;
//Realizar un procedimiento que encuentre el número mayor de un vector de n números enteros de
//manera recursiva.

public class Main {

    public static void main(String[] args) {
	    int mayor=0;
	    int array[] = {1,2,10,15,16,130,10,20,50,360};
	    int arrayLongitud = array.length-1;

	    numeroMayor(array, arrayLongitud, mayor);
    }

    public static int numeroMayor(int[] array, int arrayLongitud, int mayor){
        if(arrayLongitud < 10 && arrayLongitud>=0){
            if(array[arrayLongitud]>mayor){
                mayor = array[arrayLongitud];
            }
            mayor = numeroMayor(array, arrayLongitud-1, mayor);
        }
        //System.out.println(mayor);
        return mayor;
    }
}
