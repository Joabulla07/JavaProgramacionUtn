import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int [] array = {1,1,48,7,1,36,1,15,8,95};
        int [] array2;
        int a = array.length;   
        array2 = new int[a];
        
        int b, i,j=0, c;
        
        System.out.println("Ingrese un valor entero: ");
        b = sc.nextInt();
        
        for(i=0;i<a;i++){
            if(array[i]==b){
               array2[j] = i+1;
               j++;
           }
        }
      System.out.println("Posicion: ");
      
      for(i=0;i<a;i++){
        System.out.print(array2[i]+" ");
      }
      
    }
}
