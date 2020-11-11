
import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String args[]){
    
       float lado1, lado2, lado3;
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Ingrese lado 1: ");
       lado1 = sc.nextFloat();
       System.out.print("Ingrese lado 2: ");
       lado2 = sc.nextFloat();
       System.out.print("Ingrese lado 3: ");
       lado3 = sc.nextFloat();
       
       if(lado1 == lado2 && lado1 == lado3){
           System.out.print("El triangulo es Equilatero");
       }
       else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
           System.out.print("El triangulo es Escaleno");
       }
       else{
           System.out.print("El triangulo es Isoceles");
       }
       
    }
}
