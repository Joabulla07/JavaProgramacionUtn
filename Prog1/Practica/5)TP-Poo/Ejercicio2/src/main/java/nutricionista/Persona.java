
package nutricionista;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Dni;
    private String Sexo;
    private double Peso;
    private double Altura;

    public Persona(String nombre,int dni) {
        this.Nombre = nombre;
        this.Apellido = " ";
        this.Dni = dni;
        this.Edad = 0;
        this.Sexo = "H";
        this.Peso = 0;
        this.Altura = 0;
    }

    

    public Persona(String nombre, String apellido, int edad, int dni, String sexo) {
        this.Altura = 0;
        this.Peso = 0;
        this.Sexo = sexo;
        this.Edad = edad;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Dni = dni;
        comprobarSexo(sexo);
    }

    public Persona(String nombre, String apellido, int edad, int dni, String sexo, double peso, double altura) {
        this.Altura = altura;
        this.Peso = peso;
        this.Sexo = sexo;
        this.Edad = edad;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Dni = dni;
        comprobarSexo(sexo);
    }
    
   public boolean esMayorDeEdad(){
        return Edad>18;
   }
    
    public double calcularIMC(){
        double ideal = (Peso/(Altura*Altura));
        int condicion;
        if(ideal<20){
            condicion = -1;
        }
        else if(ideal<=25 && ideal >=20){
            condicion = 0;
        }
        else if(ideal>25){
            condicion = 1;
        }
        else condicion = 2;
        return condicion;
    }

     public void comprobarSexo(String sexo){
        if(!"M".equals(sexo))
            this.Sexo="H";
    }
    
   public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + ", Dni=" + Dni + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    }

}
