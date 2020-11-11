import javax.swing.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;



public class ParcialProg {
    public static void main(String args[]){
       
       if(validar()==true && antiguedad() == true){
        imprimir("Sueldo correspondiente: "+sueldoFinal());
        }
       else{
           imprimir("Usted no tiene aumento salarial");
       }
       
       
    }
    
    public static boolean validar(){
        String us, pas;
        boolean bandera = false;
            
        do{
            us = leerString("Ingrese usuario: ");
            pas = leerString("Ingrese contraseña: ");
        }while(!"ADMIIN".equals(us) && !"PASS".equals(pas));
        
        bandera = true;
        return bandera;
    }
    
    
    public static boolean antiguedad(){
        boolean bandera = true;
        int anios, meses, dias;
        int antAnio, antMes, antDia;
        
        anios = leerInt("Ingrese año de ingreso");
        meses = leerInt("Ingrese mes de ingreso en numero");
        dias = leerInt("Ingrese dia de ingreso");
        
        if(anios<0){
            dias = leerInt("ERROR: Ingrese año de ingreso");
        }
        
        if(meses<0 || meses>12){
            dias = leerInt("ERROR: Ingrese mes de ingreso");
        }
        
        if(dias<0 || dias>31){
            dias = leerInt("ERROR: Ingrese dia de ingreso");
        }
        
        
        antAnio = anio() - anios;
        antMes = (mes() - meses) ;
        antDia = dia() - dias;
        
        if ( antMes <0 || antMes==0 && antDia < 0) { 
            antAnio--;
        }
        
        antMes = Math.abs(antMes);
        antDia = Math.abs(antDia);
        
        if(antAnio<2 && antMes<6){
            bandera = false;
        }
        else{
            bandera = true;
        }
        
        
       
        return bandera;
    }
    
    public static float sueldoFinal(){
        float sueldo=0, bonif=0;
        int i;
        int [] meses = {1,2,3,4,5,6,7,8,9,10,11,12};
        
        for(i=0;i<12;i++){
            if(meses[i]==1 || meses[i]==7){
                bonif = 1000;
            }
            sueldo = (float) (sueldo + ( meses[i] * 1.5 + bonif ));
        }
    
        return sueldo;
    }
    
    
    
    
  
    
    public static int leerInt(String mensaje){
        int ans = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return ans;
    }

    public static float leerFloat(String mensaje){
        float ans = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
        return ans;
    }

    public static String leerString(String mensaje){
        String texto = JOptionPane.showInputDialog(mensaje);
        return texto;
    }

    public static int dia(){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int dia   = localDate.getDayOfMonth();
        return dia;
    }

    public static int mes(){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int mes = localDate.getMonthValue();
        return mes;
    }

    public static int anio(){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int anio  = localDate.getYear();
        return anio;
    }

    public static void imprimir(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }

}
