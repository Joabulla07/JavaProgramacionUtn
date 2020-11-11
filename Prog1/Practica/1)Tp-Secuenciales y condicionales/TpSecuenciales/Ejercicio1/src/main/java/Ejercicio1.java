
import java.util.Scanner;


public class Ejercicio1 {
    
    public static void main(String args[]){
    
    float kilometro,precio;

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de kilometros");

    kilometro = sc.nextFloat();

    precio = 45*kilometro;

    System.out.println("el precio del bolesto es:"+precio);

    } 
}
