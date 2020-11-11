import java.util.Scanner;
import javax.swing.JOptionPane;


public class Matriz4 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        
        int  i, j, fil=7, col, vaca=0; 
        float suma=0, mayor=0;
        col = 1+Integer.parseInt(JOptionPane.showInputDialog("Ingrese vacas: "));
        float matriz[][]= new float [fil][col]; 
        float sumaLeche[]= new float[fil];
       
        //llenado matriz
        for(i=0;i<fil;i++){
            for(j=0;j<col;j++){
               if(j<(col-1)){
               matriz[i][j]=Float.parseFloat(JOptionPane.showInputDialog("Dia:"+(i+1)+", vaca: "+j));
               suma = suma + matriz[i][j];
                    if(mayor<matriz[i][j]){
                     mayor = matriz[i][j];
                     vaca = (j+1);
                    }
               }
               else if(j==(col-1)){
                   matriz[i][j] = vaca;
               }
            }
            mayor = 0;
            sumaLeche[i] = suma;
            suma = 0;
        }
        
        
        System.out.println("            Vacas  ");
        for(i=0;i<fil;i++){
            System.out.print("Dia: "+(i+1)+"    ");
            for(j=0;j<col;j++){
                if(j==(col-1)){
                    System.out.print("Mayor Produccion Vaca: "+matriz[i][j]);
                }
                else{
                    System.out.print(matriz[i][j]+"    ");
                }
            }
            System.out.println();
        }
        
        
        //mostrar matriz suma
        System.out.println("Total producido por dia");
        System.out.println("1    2    3    4    5    6    7");
        for(i=0;i<fil;i++){
            System.out.print(sumaLeche[i]+" ");
        }
      
       
    }
}
    
