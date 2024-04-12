
package paquete2;

//importamos los paquetes para asi obtenr la informacion que estan en ellos 
import java.util.Scanner;
import paquete3.Informacion;
import paquete1.Mensaje;

public class Demo002 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
//declaramos la cadena para poder obtener el mesaje y la cantidad de habitantes
        int habitantes = Informacion.obtenerHabitantes();
        String cadena = Mensaje.obtenerMensaje();
        
        String cadenafinal = String.format("%s con %d", cadena,
                habitantes);
        int opciones; 
        System.out.println("Ingrese solo numeros del 1 al 5 porfavor.");
        opciones = entrada.nextInt();
        
        if (opciones >= 1 && opciones <= 5) {   
        System.out.printf("%s\n", cadenafinal);
        } else {
            System.out.printf("%s\n", cadenafinal.toUpperCase());
        // usar printf;
        }
    }  
}
