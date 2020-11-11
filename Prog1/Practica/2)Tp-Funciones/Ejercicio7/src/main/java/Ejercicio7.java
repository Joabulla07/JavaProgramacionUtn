import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float x0, y0, x1, y1, x2, y2; 
        System.out.println("Ingrese el primer vector: ");
        System.out.println("Ingrese x:");
        x0 = sc.nextInt();
        System.out.println("Ingrese y:");
        y0 = sc.nextInt();
        System.out.println("Ingrese el segundo vector: ");
        System.out.println("Ingrese x:");
        x1 = sc.nextInt();
        System.out.println("Ingrese y:");
        y1 = sc.nextInt();
        System.out.println("Ingrese el tercer vector: ");
        System.out.println("Ingrese x:");
        x2 = sc.nextInt();
        System.out.println("Ingrese y:");
        y2 = sc.nextInt();
        
       areaTriangulo(x0,y0,x1,y1,x2,y2);
        
    }
    
    public static void areaTriangulo(float x0,float y0, float x1, float y1,float x2, float y2){
        float baseX = (x1 + (x0*(-1))); //AB
        float baseY = (y1 + (y0*(-1))); //AB
        System.out.println("Base : ("+baseX+","+baseY+")");
        float alturaX = (x2 + (x0*(-1))); //AC
        float alturaY = (y2 + (y0*(-1))); //AC
        System.out.println("Altura : ("+alturaX+","+alturaY+")");
        
        float vectorPerpendicularABX = baseY;
        float vectorPerpendicularABY = baseX*(-1);
        System.out.println("Vector perp. : ("+vectorPerpendicularABX+","+vectorPerpendicularABY+")");
        
        float area = (((alturaX*vectorPerpendicularABX) + (alturaY*vectorPerpendicularABY)))/2;
        
        if(area < 0){
            area = area * (-1);
        }
        
        
            System.out.println("El area es: "+area);
    }
}