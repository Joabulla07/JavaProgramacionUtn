
import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String args[]){
    
    float horastr, total, sueldohr;
    int adic;
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de horas trabajadas:");

    horastr = sc.nextFloat();
    
    System.out.println("Ingrese el sueldo por hora:");

    sueldohr = sc.nextFloat();
    
    System.out.println("Son horas adicionales? 1)si, 2)no");
    
    adic = sc.nextInt();
    
    if (adic == 1) {
        total = (horastr*sueldohr)*2;
        System.out.println("El sueldo sera de:"+total);
    }
    else{
        total = horastr*sueldohr;
        System.out.println("El sueldo sera de:"+total);
    }
    

    } 
}

