import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int [] array = {100,5,200,1,100,0,600,50,100};
        int a = array.length; 
        int [] array2; 
        int [] array3;
        array2 = new int[a];
        array3 = new int[a];
        int i, j=0, k=0, max=0, cont2=0, cont3=0, min=0;
        
        for(i=0;i<a;i++){
            if(i==0 || (i%2==0)){
                array2[j] = array[i];
                j++;
                cont2 = cont2+1;
            }
            else{
                array3[k] = array[i];
                k++;
                cont3 =  cont3+1;
            }
        }
        
        for(i=0;i<cont2;i++){//par
            for(j=0;j<cont3;j++){ // lista impar
                if(array2[i]>array3[j]){ //si los impar son mayores que los impar
                    max = 1;
                    //System.out.println("mayor "+array2[i]+" >"+array3[j]);
                }
                else{
                    min = 1;
                    //System.out.println("menor"+array2[i]+" <"+array3[j]);
                }
             }
        }
      
        if(max==1 && min==0){
            System.out.println("Es paritario.");
        }
        else {
            System.out.println("No es paritario.");
        }
        
        
        /*System.out.println("Par");
        for(i=0;i<a;i++){
            System.out.println(array2[i]);
        }
        System.out.println("imPar");
        for(i=0;i<a;i++){
            System.out.println(array3[i]);
        }
        */
    }
}
