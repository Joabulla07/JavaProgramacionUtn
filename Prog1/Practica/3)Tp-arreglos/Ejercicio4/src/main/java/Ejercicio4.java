import java.util.Scanner;



public class Ejercicio4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, j=0;
        String [] array = {"Di", "buen", "dia", "a", "papa"};
        int a = array.length;
        String x;
        
        for(i=0;i<a/2;i++){
            x = array[i];
            array[i] = array[a-1-i];
            array[a-1-i] = x;
         }
        
        for(i=0;i<a;i++){
           System.out.print(array[i]+" ");
        }
        
    }
}

