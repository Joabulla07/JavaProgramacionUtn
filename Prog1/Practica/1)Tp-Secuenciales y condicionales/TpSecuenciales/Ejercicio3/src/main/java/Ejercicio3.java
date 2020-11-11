import java.util.Scanner;


public class Ejercicio3 {
    
    public static void main(String args[]){
    
    double urgencia, pediatria, traumatologia, dinero;

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de dinero recaudado:");

    dinero = sc.nextDouble();

    urgencia = (37*dinero)/100;
    pediatria = (42*dinero)/100;
    traumatologia = (21*dinero)/100;

    System.out.println("Dinero para urgenicas:"+urgencia);
    System.out.println("Dinero para pediatria:"+pediatria);
    System.out.println("Dinero para traumatologia:"+traumatologia);

    } 
}






