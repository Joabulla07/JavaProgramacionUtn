import java.util.Scanner;


public class Ejercicio1b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int [] array; // declara
        int a = 0, i, b;
        array = new int[a]; // se inicializa
        
        System.out.println("Ingrese el tamaño de el arreglo: ");
        a = sc.nextInt();
        array = new int[a];
        
        for(i=0; i<=(a-1); i++){
            System.out.println("Ingrese el elemento "+i+" :");
            array[i] = sc.nextInt();
        }
        
        for(i=(a-1); i>=0; i--){ //mostrar array alreves.
            System.out.println("Elemento "+i+" ="+array[i]);
        }
        
        //System.out.println("Longitud del array: "+array.length);
    }
}