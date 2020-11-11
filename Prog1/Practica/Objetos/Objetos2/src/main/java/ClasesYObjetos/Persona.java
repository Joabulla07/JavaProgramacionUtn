
package ClasesYObjetos;

public class Persona {
   //atributos
   String nombre;
   int edad;
   
   //metodos
   
   public Persona(String nombre, int edad){ //metodo constructor
       this.nombre = nombre;
       this.edad = edad;
   }
   
   public void mostrarDatos(){
       System.out.println("El nombre es: "+nombre);
       System.out.println("La edad es: "+edad);
   }
   
}
