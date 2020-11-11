import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int preg = 4 , i;
        String resp;
        char [] correctas;
        char [] alumno;
        alumno = new char[preg];
        correctas = new char[preg];
        int nota=0;
        //char [] respuestas = {'A', 'B', 'C', 'D', 'E'};
        correc(correctas, preg);
        alum(alumno, preg);
        
        for(i=0;i<preg;i++){
            if(correctas[i]==alumno[i]){
                nota++;
            }
        }
        
        System.out.println("Nota total: "+nota);
        
    }
    
    public static char [] correc(char correctas[], int preg){
        Scanner sc = new Scanner(System.in);
        int i;
        char resp;
        for(i=0;i<preg;i++){
            System.out.println("Ingrese respuesta oficiales "+(i+1)+" en Mayuscula: ");
            resp = sc.next().charAt(0);
            while(!Character.isUpperCase(resp)){ // COMPARA SI ES MAYUSCULA
                System.out.println("Error: Ingrese respuesta en Mayuscula: ");
                resp = sc.next().charAt(0);
            }
            switch(resp){
                case 'A': correctas[i] = resp; break;
                case 'B': correctas[i] = resp; break;
                case 'C': correctas[i] = resp; break;
                case 'D': correctas[i] = resp; break;
                case 'E': correctas[i] = resp; break;
                        default : System.out.println("Error: Ingrese respuesta existente: ");
                                 resp = sc.next().charAt(0);break;
            }
            
        }
        return correctas;
    }
    
    
    public static char [] alum(char alumno[], int preg){
        Scanner sc = new Scanner(System.in);
        int i;
        char resp;
        for(i=0;i<preg;i++){
            System.out.println("Ingrese respuesta "+(i+1)+" en Mayuscula: ");
            resp = sc.next().charAt(0);
            while(!Character.isUpperCase(resp)){ // COMPARA SI ES MAYUSCULA
                System.out.println("ERROR: Ingrese respuesta en Mayuscula: ");
                 resp = sc.next().charAt(0);
            }
            switch(resp){
                case 'A': alumno[i] = resp; break;
                case 'B': alumno[i] = resp; break;
                case 'C': alumno[i] = resp; break;
                case 'D': alumno[i] = resp; break;
                case 'E': alumno[i] = resp; break;
                        default : System.out.println("Error: Ingrese respuesta existente: ");
                                 resp = sc.next().charAt(0);break;
            }
        }
        return alumno;
    }
    
}
