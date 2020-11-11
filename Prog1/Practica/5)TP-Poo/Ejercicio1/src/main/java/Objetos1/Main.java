
package Objetos1;
import javax.swing.JOptionPane;


public class Main {
   
    public static void main(String[] args){
        int b=1;
        Cuenta p1 = new Cuenta("Joanna",100);
        
        do{
            int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Accion:\n 1)Ingreso de dinero. \n 2)Retiro de dinero."));
            switch(a){
                case 1: double ingreso = Double.parseDouble(JOptionPane.showInputDialog(p1+"\n Ingrese $"));
                        p1.ingresar(ingreso);
                        break;
               case 2: double retiro = Double.parseDouble(JOptionPane.showInputDialog(p1+"\n Ingrese $"));
                        p1.retirar(retiro);
                        break;
            }
           
           b = Integer.parseInt(JOptionPane.showInputDialog(p1+"\n Realizar otra transaccion:\n 1)si \n 2)no")); 
        }while(b == 1);        
          
        
        
        
        
        
    }
}
