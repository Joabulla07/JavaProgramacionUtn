import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float grados;
        
        for(int i=0;i<=120;i=i+10){
        System.out.println(i+"ºF = "+conversion(i)+"ºC");
        }
    }
    
    public static float conversion(float i){
        float valor = ((i - 32)*5)/9;
        return valor;
    }
}
