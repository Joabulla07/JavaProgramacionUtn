import java.util.Scanner;



public class Ejercicio2a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int [] array = {2, 5, 7, 9, 58, 47, 0, 71}; // declara
        int [] array2;
        int i, x, y, j=0, a;
        a = array.length;
        array2 = new int[a];
       
        
        
       for(i=0;i<a;i++){  
            x = array[i];
            y = primo(x);
            if( y == 1){
                array2[j] = array[i];
                j++;
            }
        }    
        for(i=0; i<a; i++){ //mostrar array alreves.
            System.out.println("Elemento "+i+" ="+array2[i]);
        }   
    }
    


    public static int primo(int x){
        int i, prim, cont =0;
	if(x>1){
		for(i=x;i>=1;i--){
			if((x%i) == 0){
				if((i!= x) && (i!= 1)){
					cont = cont + 1;
				}
			}
		}
		if(cont > 0){
			prim = 0;
		}
		else{
			prim = 1; 
		}
	}
	else{
		prim = 0;
	}
        
        return prim;
    }
}