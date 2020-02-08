import java.util.Scanner;
/**
 * Este programa esta diseñado para solucionar un problema de distancia.
 * 
 * @author (Daniela) 
 * @version (7.0)
 */
public class Viaje
{
      public static void main(String[] args)
     {
         Scanner teclado = new Scanner(System.in);
         //Datos de entrada
         double cap, carga, comb;
         //Datos de salida
         double viajes, distancia, precio;
         //Preguntas de entrada
         System.out.print("¿Qué capacidad en kilos puede transportar el camion?");
         cap = teclado.nextDouble();
         System.out.print("¿Cuantos kilos va a transportar el camíon?");
         carga = teclado.nextDouble();
         System.out.print("¿Cuanto cumbustible gasta por kilometro?");
         comb = teclado.nextDouble();
         //Cálculos
         distancia = 78.5;
         precio = 10.000;
         viajes = carga/cap;
        
         //Mostrar datos de salida
         System.out.println("¿Cuantos viajes son necesario para transportar esos kilos?" + viajes);
         System.out.println("¿Cuantos galones de gasolina se va a gastar por viaje?" + (comb * distancia)*viajes);
         System.out.println("¿Cuanto va a costar la gasolia?" + (precio * distancia)*viajes);
         
        
         
     }
}
