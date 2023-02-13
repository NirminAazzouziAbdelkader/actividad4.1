import java.time.Year;
import java.util.Scanner;


    public class PERSONAEXCEPTION extends Exception{
        private String mensaje;
        public PERSONAEXCEPTION(){
            this.mensaje = "Error";
            
        }
        
        public PERSONAEXCEPTION(String introduceMen){
            this.mensaje = introduceMen;
            
        }
        
        public String getMessage(){
            return mensaje;
        }
    }