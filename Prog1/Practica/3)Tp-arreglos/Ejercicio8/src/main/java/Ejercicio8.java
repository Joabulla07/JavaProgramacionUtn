import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int [] array = {0,1,58,48,7,5,36,24,15,8,95};
        int a = array.length;
        int b, i, x=0;
        
        System.out.println("Ingrese un valor entero: ");
        b = sc.nextInt();
        
        for(i=0;i<a;i++){
            if(array[i]==b){
                x = i+1;
            }
        }
        
        if( x == 0){
            System.out.println("NO");
        }
        else{
            System.out.println("Encontrado en la posicion: "+x);
        }
        
    }
}
