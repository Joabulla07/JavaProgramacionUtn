import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float inicial, interes, años;
        
        System.out.println("Monto inicial en $: ");
        inicial = sc.nextFloat();
        System.out.println("Tasa de interes: ");
        interes = sc.nextFloat();
        System.out.println("Cantidad de años: ");
        años = sc.nextFloat();
        
        System.out.println("Monto a obtener: "+calculo(inicial, interes, años));
    }
    
    public static float calculo(float inicial, float interes, float años){
        float obtencion = (float) Math.pow(inicial*(1+(interes/100)), años); // math.pow es exponencial
        
        return obtencion;
    }
}