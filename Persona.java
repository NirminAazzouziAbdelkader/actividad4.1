package misclases;
import java.util.Scanner;
import java.time.Year;


public class Persona {
    
    private int id;
    private String nombre;
    private String apellidos;
    private int añoNac;
    private String correo;
    private int edad;
    
    public Persona(int id, String nombre, String apellidos, int añoNac, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.añoNac = añoNac;
        this.correo = correo;
        this.edad = Year.now().getValue() - this.añoNac;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
        
        public String getNombre() {
            return nombre;
        }
        
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
        public  String getApellidos() {
            return apellidos;
        }
        
        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }
        
        public int getAñoNac() {
            return añoNac;
        }
        
        public void setAñoNac(int añoNac) {
            this.añoNac = añoNac;

                this.edad= Year.now().getValue() - this.añoNac;

        }
        
        public String getCorreo() {
            return correo;
        }
        
        public void setCorreo(String correo) {
            this.correo = correo;
        }
        
        public int getEdad() {
            return edad;
        }
        
       // public void setEdad(String edad) {
           // this.edad = edad;
        //}
        
        @Override
        public String toString() {
            return "Persona [id=" + this.id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", añoNac=" + añoNac + ", correo=" + correo + ", edad=" + edad + "]";
        }
        
          public void capturaDatos(){
         Scanner teclado = new Scanner(System.in);
         System.out.print("Nombre: "); this.nombre = teclado.next(); System.out.print("\n");
         System.out.print("Id: "); this.id= teclado.nextInt();System.out.print("\n");
         System.out.print("Apellidos: "); this.apellidos = teclado.next();System.out.print("\n");
         System.out.print("AñoNac: "); this.añoNac= teclado.nextInt();System.out.print("\n");
         System.out.print("Correo: "); this.correo = teclado.next();    
     }
        
}
        
       

