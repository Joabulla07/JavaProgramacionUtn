
import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int empl, i, cobro100 = 0, mayor=0;
        float sueldo, total = 0;
        
        System.out.print("Ingrese la cantidad de empleados: ");
        empl = sc.nextInt();
        
        for(i=1;i<=empl;i++){
            System.out.print("Ingrese sueldo: ");
            sueldo = sc.nextFloat();
            
            total = total + sueldo;
            
            if(sueldo>=100 && sueldo<=300){
                cobro100 = cobro100 + 1;
            }
            else{
                mayor = mayor + 1;
            }
        
        }
        System.out.println("Sueldos entre $100 y $300: "+cobro100);
        System.out.println("sueldo mayor de $300: "+mayor);
        System.out.println("Total gastado en sueldos: "+total);
        
    }
}
