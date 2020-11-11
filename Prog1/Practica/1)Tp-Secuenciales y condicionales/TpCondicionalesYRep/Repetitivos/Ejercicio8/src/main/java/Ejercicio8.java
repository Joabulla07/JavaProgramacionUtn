
import java.util.Scanner;


public class Ejercicio8 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int usuario, pass;
       
       do{
           System.out.println("Ingrese usuario: ");
           usuario = sc.nextInt();
           System.out.println("Ingrese contraseña: ");
           pass = sc.nextInt();
           
           if(usuario != 1024 && pass != 4567){
               System.out.println("ERROR");
           }
       }while(usuario != 1024 && pass != 4567);
       
            System.out.println("Ingreso exitoso");
     }
}
