import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int [] array;
        int [] array2;
        int [] array3;
        int  i, a = 10;
        array = new int[a];
        array2 = new int[a];
        array3 = new int[a];
        a = array.length;
        
        
        for(i=0; i<=(a-1); i++){
            System.out.println("Ingrese el elemento "+i+"del arreglo 1 :");
            array[i] = sc.nextInt();
        }
        for(i=0; i<=(a-1); i++){
            System.out.println("Ingrese el elemento "+i+"del arreglo 2 :");
            array2[i] = sc.nextInt();
        }
        
        for(i=0;i<a;i++){
            array3[i] = array[i] + array2[i]; 
            System.out.println("Elemento "+i+" ="+array3[i]);
        }
        
    }
}