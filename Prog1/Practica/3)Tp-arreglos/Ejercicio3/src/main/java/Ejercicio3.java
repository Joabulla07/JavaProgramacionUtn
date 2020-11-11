import java.util.Scanner;



public class Ejercicio3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        String [] array = {"Di", "buen", "dia", "a", "papa"};
        String [] array2;
        int a = array.length;
        array2 = new String[a];
        
        array2 = reves(array,a);
        for(i=0;i<a;i++){
            System.out.print(array2[i]+" ");
        }
        
    }
    


    public static String[] reves(String array[], int a){
        String [] arrayaux;
        arrayaux = new String[5];
        int i, j=0;
        
        for(i=(a-1);i>=0;i--){
            arrayaux[j] = array[i];
            j++;
        }
       return arrayaux;
    }
}
