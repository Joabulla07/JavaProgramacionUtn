
import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       
       String nomArt;
       int clave;
       float precOrig, precDesc = 0;
       
       
       System.out.print("Ingrese nombre del articulo: ");
       nomArt = sc.next();
       System.out.print("Ingrese la clave: ");
       clave = sc.nextInt();
       System.out.print("Ingrese el precio original: ");
       precOrig = sc.nextFloat();
       
       switch(clave){
           case 01: precDesc = precOrig - ((10*precOrig)/100);
                    break;
           case 02: precDesc = precOrig - ((20*precOrig)/100);
                    break;
       }
       
       
       
       
       
       
       System.out.println("Articulo: "+nomArt);
       System.out.println("Clave: "+clave);
       System.out.println("Precio sin descuento: "+precOrig);
       System.out.println("Precio con descuento: "+precDesc);
       
    }
}
