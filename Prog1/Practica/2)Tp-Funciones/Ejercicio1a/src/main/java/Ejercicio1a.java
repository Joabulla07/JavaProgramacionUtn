
import java.util.Scanner;


public class Ejercicio1a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = sc.next();
        saludar(nombre);
        
        
    }
    public static String saludar(String nombre)
    {
        //Se crea el mensaje de saludo
        String saludo = "Hola. Bienvenido " + nombre;
        System.out.println(saludo);

        return saludo;//Se retorna el saludo
    }  

    
}
