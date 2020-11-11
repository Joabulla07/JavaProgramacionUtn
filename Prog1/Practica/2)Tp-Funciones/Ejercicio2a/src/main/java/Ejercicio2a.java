import java.util.Scanner;


public class Ejercicio2a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hora, minuto, segundo;
        System.out.println("Ingrese las horas: ");
        hora = sc. nextInt();
        System.out.println("Ingrese los minutos: ");
        minuto = sc. nextInt();
        System.out.println("Ingrese las los segundos: ");
        segundo = sc. nextInt();
        System.out.print("El total en segundos es: "+duracionSegundos(hora, minuto, segundo));
        
        
    }
    public static int duracionSegundos(int hora, int minuto, int segundo)
    {
        int totalHora = hora*3600;
        int totalMinutos = minuto*60;
       
        int resultado = totalHora + totalMinutos + segundo;
        
        return resultado;
    }
    
}

