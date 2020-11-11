import java.util.Scanner;


public class Ejercicio3a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a, b;
        
        System.out.println("Ingrese el primer numero: ");
        a = sc.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        b = sc.nextFloat();
        
        operaciones(a, b);
        
    }
    
    public static void operaciones(float a, float b){
        float suma = a + b;
        float resta = a - b;
        float multiplicacion = a*b;
        float division = 0;
        if(b!=0){
             division = a/b;
        }
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+multiplicacion);
        System.out.println("Division: "+division);
        
    }
}