import java.util.Scanner;


public class Ejercicio5b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x0, y0, x1, y1;
        System.out.println("Ingrese el primer vector: ");
        System.out.println("Ingrese x:");
        x0 = sc.nextInt();
        System.out.println("Ingrese y:");
        y0 = sc.nextInt();
        System.out.println("Ingrese el segundo vector: ");
        System.out.println("Ingrese x:");
        x1 = sc.nextInt();
        System.out.println("Ingrese y:");
        y1 = sc.nextInt();
        
       restaVectores(x0,y0,x1,y1);
        
    }


    public static void restaVectores(int x0, int y0, int x1, int y1){
      int resta1 =  x0 + (x1*(-1));
      int resta2 =  y0 + (y1*(-1));
        System.out.println("La suma de vectores es: S=("+resta1+","+resta2+")");
    }

}
