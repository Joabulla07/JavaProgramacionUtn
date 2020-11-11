import java.util.Scanner;


public class Ejercicio3b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int a = sc.nextInt();
        
        tabla(a);
    }
    
    public static void tabla(int a){
        int i;
        for(i=1;i<=10;i++){
            int resultado;
            resultado = a*i;
            System.out.println(a+" x "+i+" = "+resultado);
        }
    }
}