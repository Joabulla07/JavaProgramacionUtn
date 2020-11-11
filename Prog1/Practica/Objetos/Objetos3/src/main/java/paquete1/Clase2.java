
package paquete1;


public class Clase2 {
    public static void main(String[] args){
        Clase1 objeto1 = new Clase1();
        //objeto1.edad = 10; no me deja xq es privado
        
        objeto1.setEdad(10);
        System.out.println("La edad es: "+objeto1.getEdad());
        
        objeto1.setNombre("Joanna");
        System.out.println("El nombre es: "+objeto1.getNombre());
    }
}
