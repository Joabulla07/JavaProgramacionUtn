import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String args[]){
    
    int porcentMuj, mujeres, hombres, total, porcentHom;
    float promedioMuj, promedioHom;

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad total de alumnos:");

    total = sc.nextInt();
    
    System.out.println("Ingrese la cantidad total de mujeres:");
    
    mujeres = sc.nextInt();
    
    System.out.println("Ingrese la cantidad total de hombres:");
    
    hombres = sc.nextInt();
    
    porcentMuj = (mujeres*100)/total;
    
    porcentHom = (hombres*100)/total;
    
    promedioMuj = (mujeres/total);
            
    promedioHom = (hombres/total);
    
    System.out.println("Porcentaje Mujeres:"+porcentMuj+"%");
    
    System.out.println("Porcentaje hombres:"+porcentHom+"%");
    
    System.out.println("Promedio Mujeres:"+promedioMuj);
    
    System.out.println("Promedio hombres:"+promedioHom);
    
    }
}