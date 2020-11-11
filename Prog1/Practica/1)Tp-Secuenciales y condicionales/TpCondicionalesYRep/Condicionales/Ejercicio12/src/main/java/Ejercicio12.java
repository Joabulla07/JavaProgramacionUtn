
import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       
       int num;
       
       System.out.print("Ingrese un numero entre 1 y 7: ");
       num = sc.nextInt();
       
       switch(num){
           case 1: System.out.print("Lunes");
                    break;
           case 2: System.out.print("Martes");
                    break;
           case 3: System.out.print("Miercoles");
                    break;
           case 4: System.out.print("Jueves");
                    break;
           case 5: System.out.print("Viernes");
                    break;
           case 6: System.out.print("Sabado");
                    break;
           case 7: System.out.print("Domingo");
                    break;
       }
       
    }
}
