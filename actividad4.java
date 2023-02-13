import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import misclases.Persona;
import java.util.ArrayList;

public class actividad4 {
    


   static ArrayList<Persona> personas = new ArrayList<Persona>();

   static void sumarPersona(){
    Scanner scan = new Scanner (System.in);
    System.out.print("Dame el nombre de la persona: ");
    String nombre = scan.nextLine();
    System.out.print("Dame los apellidos de la persona: ");
    String apellidos = scan.nextLine();
    System.out.print("Dime el anyo de nacimiento de la persona: ");
    int añoNac = scan.nextInt();
    System.out.print("Dime el id de la persona: ");
    int id_per = scan.nextInt();
    System.out.print("Dame el correo de la persona: ");
    scan.nextLine();
    String correo = scan.nextLine();
    personas.add(new Persona(id_per,nombre,apellidos,añoNac,correo));
   }

    static void listado() {
        for(int i=0; i<personas.size();i++){
            System.out.println(personas.get(i));
            
            
        }
         }  
        static void buscarPersona(){
            Scanner scan = new Scanner(System.in);
            int i = 0;
            boolean encontrado = false;
            System.out.print("Introduce el id de la persona: ");
            int id = scan.nextInt();
            
            while(!encontrado && i<personas.size()){
                if(personas.get(i).getId() == id){
                    
                    encontrado = true;
                    
                    System.out.print(personas.get(i));
                    
                    
                }
                i++;
            }
            
            if(!encontrado){
                System.out.println("\n No se ha encontrado la id solicitada.\n");
                
                
            }
        }
        
        static void generarFichero(){
            
            
            try{
                FileWriter fichero2 = new FileWriter("lectura.txt,true");
                
                for(int i=0; i<personas.size();i++){
                    
                    
                    fichero2.write(personas.get(i).toString());
                    
                    
                }
                fichero2.close();
                
            }catch(Exception ex){
                
                
                System.out.println(ex.getMessage());
                
                
            }
        }
    public static void main(String args[]) {
        int opcion = 0;
        File fichero = new File("lectura.txt");
        Scanner scan = new Scanner(System.in);
        Scanner s = null;
        try {
        // Leemos el contenido del fichero
       System.out.println("... Leemos el contenido del fichero ...");
        s = new Scanner(fichero);
        // Leemos linea a linea el fichero
        while (s.hasNextLine()) {
       String linea = s.nextLine(); // Guardamos la linea en un String
       System.out.println(linea); // Imprimimos la linea
       }
        } catch (Exception ex) {
       System.out.println("Mensaje: " + ex.getMessage());
        } finally {
        // Cerramos el fichero tanto si la lectura ha sido correcta o no
        try {
        if (s != null) s.close();

       } catch (Exception ex2) {
       System.out.println("Mensaje 2: " + ex2.getMessage());
       }
        }









  do{   
    
    opcion = scan.nextInt();
        switch(opcion) {
 
            case 1:
                
             sumarPersona();
 
            case 2:
              listado();
              

break;
     
     
     case 3:
         buscarPersona();
         
         break;
     case 4:
         generarFichero();
         
     case 5:
         System.out.println("Has salido del programa");
     
     if(args.length == 0) {
         
         
     }
     
     
        }
  }while(opcion!=5);
    }
}
     
     
                
    
 

    


