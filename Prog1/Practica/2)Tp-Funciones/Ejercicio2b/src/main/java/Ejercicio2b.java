import java.util.Scanner;


public class Ejercicio2b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float segundo, segundos;
        
        System.out.println("Ingrese las los segundos: ");
        segundo = sc. nextInt();
        
         total(segundo);
        
    }
    public static void total(float segundo){
        
        float hora = segundo / 3600;
        float sobra = (hora % 1);
              hora = hora - sobra;
        float minuto = (sobra*60) - ((sobra*60)%1);
              sobra = ((sobra*60) % 1);
        float segundos = sobra*60;
        
        System.out.print(hora+" hs "+minuto+" minutos "+segundos+" segundos ");
    }
    
} 
    
    
