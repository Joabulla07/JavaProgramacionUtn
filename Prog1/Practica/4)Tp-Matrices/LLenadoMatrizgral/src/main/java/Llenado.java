import java.util.Scanner;
import javax.swing.JOptionPane;


public class Llenado {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        float suma=0;
        int  i, j, fil=3, col=5;  //la 5ta para la suma
        float matriz[][]= new float [fil][col]; //fila/columna
        
        
        //llenado matriz
        for(i=0;i<fil;i++){
            for(j=0;j<col;j++){
               matriz[i][j]=Float.parseFloat(JOptionPane.showInputDialog("Posicion ["+i+"]["+j+"]"));
            }
        }
        
        System.out.println("MATRIZ ORIGINAL");
        for(i=0;i<fil;i++){
            for(j=0;j<col;j++){
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println();
        }
      
       
    }
}
    