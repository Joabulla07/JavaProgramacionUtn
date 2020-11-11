import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float grados;
        
        System.out.println("Ingrese valor de grado en Fahrenheit ");
        grados = sc.nextFloat();
        
        System.out.println("Resultado: "+conversion(grados)+"ºC");
    }
    public static float conversion(float grados){
        float valor = ((grados - 32)*5)/9;
        
        return valor;
    }
}
