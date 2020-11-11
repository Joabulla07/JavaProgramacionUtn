import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float base, altura;
        System.out.print("Ingrese base: ");
        base = sc.nextFloat();
        System.out.print("Ingrese altura: ");
        altura = sc.nextFloat();
        
        System.out.println("El area es: "+area(base, altura)+"m2");
    }
    
    public static float area(float base, float altura){
        float resultado = (base*altura)/2;
        return resultado;
    }
}