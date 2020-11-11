import java.util.Scanner;



public class Ejercicio2c {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int [] array = {2, 5, 7, 9, 58, 47, 0, 71};
        int a = array.length;
        
        System.out.print("El promedio de los valores del arreglo es: "+promedio(array, a));
    }
    


    public static int promedio(int array[], int a){
        int prom=0, i, suma=0;
        
        for(i=0;i<a;i++){
            suma = suma + array[i];
        }
        prom = suma/a;
        
        return prom;
    }
}
