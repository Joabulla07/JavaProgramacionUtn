
import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       double dineroPorHora, horas, horasExt = 0, pago, dif, primOcho, resto;
       
       dineroPorHora = 100;
       
       System.out.print("Ingrese la cantidad de horas trabajadas: ");
       horas = sc.nextDouble();
       
       if(horas > 40){
           horasExt = horas - 40;
                if(horasExt <= 8 ){
                    pago = dineroPorHora*horasExt*2;
                }
                else {
                    dif = horasExt - 8;
                    primOcho = dineroPorHora*16;
                    resto = dif*3;
                    pago = primOcho + resto;
                }
       }
       else{
           pago = dineroPorHora * horas;
       }
       
     
       
       System.out.print("El pago es de: "+pago);
       
    }
}
