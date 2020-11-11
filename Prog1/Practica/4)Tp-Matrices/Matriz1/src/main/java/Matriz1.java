import java.util.Scanner;


public class Matriz1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int suma=0;
        int  i, j,fil =5, col= 5;  //la 5ta para la suma
        int calif[][]= new int [fil][col]; //fila/columna
        
        for(i=0;i<fil;i++){
            for(j=0;j<col;j++){
                switch(j){
                    case 0: System.out.println("Califique Atencion al publico: 1 al 10");
                            calif[i][j] = sc.nextInt();
                            suma = suma + calif[i][j];
                            break;
                    case 1: System.out.println("Califique Calidad: 1 al 10");
                            calif[i][j] = sc.nextInt();
                            suma = suma + calif[i][j];
                            break;
                    case 2: System.out.println("Califique Precio: 1 al 10");
                            calif[i][j] = sc.nextInt();
                            suma = suma + calif[i][j];
                            break;
                    case 3: System.out.println("Califique Ambiente: 1 al 10");
                            calif[i][j] = sc.nextInt();
                            suma = suma + calif[i][j];
                            break;
                    case 4: calif[i][j] = suma;break;
                }
            }
           suma = 0; 
        }
      promedio(calif, col, fil);
        
    }
    
    
    public static void mostrar(int prom[][], int col, int fil){
        int i, j;
        
       for(i=0;i<fil;i++){
            for(j=0;j<col;j++){
                if(j==0 && i==0){
                    System.out.println("AT-Cal-Pre-Amb-promedio");
                }
                System.out.print(prom[i][j]+"   ");
            }
            System.out.println();
        }
        
    }
    
    public static void promedio(int calif[][], int col, int fil){
        int i, promedio, j, k, fila=0, m=0, max=0;
        int prom[][]= new int [fil][col];
        
        for(i=0;i<fil;i++){
            promedio = calif[i][4] /4;
            calif[i][4] = promedio;
        }
        
        while(m <fil){
                    for(i=0;i<fil;i++){
                        for(j=0;j<col;j++){
                            if(calif[i][4]>max){
                                   max = calif[i][4];
                                   fila = i;
                            }
                        }
                    }
                   for(i=0;i<col;i++){
                       if(m < fil){
                        prom[m][i] = calif[fila][i];
                        calif[fila][i] = 0;
                       }
                   }
                   m++;
                   fila = 0;
                   max = 0;
            }  
        
        
      //System.out.print("maximo "+max+" fila "+(fila+1));
     mostrar(prom, col, fil);
    
    }
        
}

