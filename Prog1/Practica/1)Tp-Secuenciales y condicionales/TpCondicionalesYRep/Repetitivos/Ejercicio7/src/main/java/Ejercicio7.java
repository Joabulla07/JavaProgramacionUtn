
import java.util.Scanner;


public class Ejercicio7 {
      public static void main(String args[]){
    
       Scanner sc = new Scanner(System.in);
       int i, alum, edad, edadA=0, edadB = 0, edadC = 0, totA =0, totB=0, totC=0;
       int promA,promB, promC; 
       String sexo, carr;
       
       System.out.print("Ingrese cantidad de alumnos: ");
       alum = sc.nextInt();
       
       for(i=0;i<alum;i++){
           System.out.print("Ingrese sexo: 'M' o 'F': ");
           sexo = sc.next();
           System.out.print("Ingrese edad: ");
           edad = sc.nextInt();
           System.out.print("Ingrese carrera 'A' 'B' 'C' : ");
           carr = sc.next();
           
           if(sexo.equals("M")){
               switch(carr){
                  case "A":
                   edadA = edadA + edad;
                   totA = totA + 1;
                   break;
               case "B":
                   edadB = edadB + edad;
                   totB = totB + 1;
                   break;
               case "C":
                   edadC = edadC + edad;
                   totC = totC + 1;
                   break;
               }
           }
       }
           
  
    promA = (edadA/totA);
    promB = (edadB/totB);
    promC = (edadC/totC);
           
    if(promA < promB && promA < promC){
       System.out.print("La carrera con menor promedio de edad de varones es la A con un promedio de : "+promA);
    }
    else if(promB < promA && promB < promC){
       System.out.print("La carrera con menor promedio de edad de varones es la B con un promedio de : "+promB);
    }
    else{
       System.out.print("La carrera con menor promedio de edad de varones es la C con un promedio de : "+promC);
    }
    }
}
