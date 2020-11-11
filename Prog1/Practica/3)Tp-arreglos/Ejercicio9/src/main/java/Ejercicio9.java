import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        float [] array = {0,1,58,48,7,5,36,24,15,8,95};
        int a = array.length;
        int i;
        float max=0;
        
        for(i=0;i<a;i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        
        //System.out.println("El mayor es: "+max);
       for(i=0;i<a;i++){
           array[i] = array[i]/max;
           System.out.println("Elemento "+i+": "+array[i]);
       }
        
    }
}
