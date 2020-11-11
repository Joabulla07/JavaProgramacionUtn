import java.util.Scanner;


public class Ejercicio5a {
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
        
       sumaVectores(x0,y0,x1,y1);
        
    }


    public static void sumaVectores(int x0, int y0, int x1, int y1){
      int suma1 =  x0 + x1;
      int suma2 =  y0 + y1;
        System.out.println("La suma de vectores es: S=("+suma1+","+suma2+")");
    }

}