
package nutricionista;

import javax.swing.JOptionPane;



public class Main {
    public static void main(String [] args){
        
        
        String nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingrese apellido: ");
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dni: "));
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));
        String sexo = (JOptionPane.showInputDialog("Ingrese sexo 'H' o 'M': "));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso en kg: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura en metros: "));
        
        Persona p1 = new Persona(nombre,apellido,edad,dni,sexo,peso,altura);
        Persona p2 = new Persona(nombre, apellido, edad, dni, sexo);
        Persona p3 = new Persona(nombre, dni);
        
        
     
        System.out.println(p1.toString());
        imprimirEstadoImc((int) p1.calcularIMC());
        System.out.println("Es mayor de edad: "+p1.esMayorDeEdad());
       
        System.out.println(p2.toString());
        imprimirEstadoImc((int) p2.calcularIMC());
        System.out.println("Es mayor de edad: "+p2.esMayorDeEdad());
        
        System.out.println(p3.toString());
        imprimirEstadoImc((int) p3.calcularIMC());
        System.out.println("Es mayor de edad: "+p3.esMayorDeEdad());
        
    }
    
    public static void imprimirEstadoImc(int ideal){
        switch (ideal) {
            case -1:
                System.out.println("Bajo peso");
                break;
            case 0:
                System.out.println("Peso ideal");
                break;
            case 1:
                System.out.println("Sobrepeso");
                break;
            default:
                System.out.println("Fuera de rango");
                break;
        }
    }
    
    
}
