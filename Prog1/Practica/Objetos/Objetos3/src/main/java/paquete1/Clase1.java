
package paquete1;

public class Clase1 {
    private int edad;//solo podre acceder desde esta clase. Encapsulado
    private String nombre;
    //metodo setter
    public void setEdad(int edad){
        this.edad = edad;
    }
    //metodo getter
    public int getEdad(){
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
