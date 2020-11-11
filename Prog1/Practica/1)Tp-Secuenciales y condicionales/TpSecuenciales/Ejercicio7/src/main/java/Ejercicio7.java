import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String args[]){
    
    int porcentMuj, mujeres, hombres, total, porcentHom;

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad total de alumnos:");

    total = sc.nextInt();
    
    System.out.println("Ingrese la cantidad total de mujeres:");
    
    mujeres = sc.nextInt();
    
    System.out.println("Ingrese la cantidad total de hombres:");
    
    hombres = sc.nextInt();
    
    porcentMuj = (mujeres*100)/total;
    
    porcentHom = (hombres*100)/total;
    
    System.out.println("Porcentaje Mujeres:"+porcentMuj+"%");
    
    System.out.println("Porcentaje hombres:"+porcentHom+"%");
    
    }
}