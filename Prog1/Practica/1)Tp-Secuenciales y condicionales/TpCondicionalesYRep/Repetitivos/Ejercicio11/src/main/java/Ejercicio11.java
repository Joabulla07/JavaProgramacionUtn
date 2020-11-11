
import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String clave;
        int cont=0;
        
        do{
            System.out.print("Ingrese clave:");
            clave = sc.next();
        
            cont = cont + 1;
            
        }while(!"111MIL".equals(clave)&& cont != 3);
            
            if(cont == 3){
                System.out.print("Se agotaron los intentos.");
            }
            else{
                System.out.print("Ingreso exitoso.");
            }
    }
}
