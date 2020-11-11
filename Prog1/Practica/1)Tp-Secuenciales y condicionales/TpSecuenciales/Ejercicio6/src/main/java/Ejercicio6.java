
import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String args[]){
    
        
    int num1, num2, num3, resultado;
    
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un digito:");

    num1 = sc.nextInt();
    
    System.out.println("Ingrese un digito:");

    num2 = sc.nextInt();
    
    System.out.println("Ingrese un digito:");

    num3 = sc.nextInt();
    
    String sA = String.valueOf(num1);
    String sB = String.valueOf(num2);
    String sC = String.valueOf(num3);

    String res = sA + sB + sC;
    
    resultado = Integer.parseInt(res);
    
    System.out.println("X:"+resultado);
    
    }

}
    