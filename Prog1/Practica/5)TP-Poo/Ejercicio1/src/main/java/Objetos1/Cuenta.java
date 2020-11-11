
package Objetos1;


public class Cuenta {
    private final String titular;
    public double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    
    
    public double ingresar(double monto){
        if(monto>0){
            this.cantidad = cantidad+monto;
        }
        return cantidad;
    }
    
    public double retirar(double monto){
        if(monto>cantidad){
            this.cantidad = 0;
        }
        else{
            this.cantidad = cantidad-monto;
        }
        return cantidad;
    }
    
    /*public void mostrarDatos(){
        System.out.println("Titular: "+getTitular());
        System.out.println("Cantidad : $"+getCantidad());
    }*/

    @Override
    public String toString() {
        return "Cuenta{" + "titular:" + titular + ", saldo:" + cantidad + '}';
    }
    
    
}
