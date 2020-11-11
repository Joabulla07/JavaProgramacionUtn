import java.util.Scanner;



public class Ejercico2b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int [] array = {2, 5, 7, 9, 58, 47, 0, 71};
        int a = array.length;
        
        System.out.print("La sumatoria de los valores del arreglo es: "+sumatoria(array, a));
    }
    


    public static int sumatoria(int array[], int a){
        int suma=0, i;
        
        for(i=0;i<a;i++){
            suma = suma + array[i];
        }
        
        return suma;
    }
}