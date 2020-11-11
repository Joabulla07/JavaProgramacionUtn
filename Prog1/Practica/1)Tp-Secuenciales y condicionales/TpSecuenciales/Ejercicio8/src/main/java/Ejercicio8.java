
import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String args[]){
    
    float cm, pulg;
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese en centimetros:");

    cm = sc.nextFloat();
    
    pulg = (float) (cm*0.39737);
    
    System.out.println("Pulgadas:"+pulg);
    
    }
}
