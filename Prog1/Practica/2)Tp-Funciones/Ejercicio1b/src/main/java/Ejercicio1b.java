
import java.util.Scanner;


public class Ejercicio1b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Ingrese el primer numero: ");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        b = sc.nextInt();
        productoNumeros(a,b);
        System.out.println("El producto es: "+productoNumeros(a,b));
    }
    public static int productoNumeros(int a, int b)
    {
        int producto = a*b;
        
        return producto;
    }
    
}
