import java.util.Scanner;


public class Ejercicio5 {
    
    public static void main(String args[]){
    
    
    int num1, num2, suma, prom;
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el primer numero entero:");

    num1 = sc.nextInt();
    
    System.out.println("Ingrese el segundo numero entero:");

    num2 = sc.nextInt();
    
    suma = (num1*2)+(num2*num2);
    
    prom = ((num1*num1*num1)+(num2*num2*num2))/2;
    
    System.out.println("La suma es:"+suma);
    System.out.println("El promedio de sus cubos es:"+prom);
    
    }
    
}
