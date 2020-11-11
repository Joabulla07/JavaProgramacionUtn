import java.util.Scanner;



public class Ejercicio5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] array;
        array = new int[20];
        int[] arrayProm;
        arrayProm = new int[20];
        
        int i, a, suma =0, prom, contProm =0, j=0;
        a = array.length;
        
        for(i=0; i<a; i++){
            System.out.println("Ingrese el elemento "+i+" :");
            array[i] = sc.nextInt();
            suma = suma + array[i]; //suma todos los valores
        }
        prom = suma/a;
        
        for(i=0; i<a; i++){ //cuenta valores > al promedio y guarda en lista
            if(array[i]>prom ){
                contProm = contProm + 1;
                arrayProm[j] = array[i];
                j++;
            }
        }
        System.out.println("La suma: "+suma);
        System.out.println("El promedio es: "+prom);
        System.out.println("Cantidad de valores mayores al promedio: "+contProm);
        System.out.println("Lista de valores mayores: ");
        
        for(i=0; i<a; i++){
            System.out.println("Elemento: "+(i+1)+" Valor: "+arrayProm[i]);
        }
     }
    
}