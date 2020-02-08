import java.util.Scanner;
/**
 * Este programa esta diseñado para hallar una capacidad calórica.
 * 
 * @author (Daniela) 
 * @version (5.0)
 */
public class Capacidad
{
    public static void main(String[] args)
    { 
      Scanner teclado = new Scanner(System.in);
     //Tenemos los datos de entrada
     double m, t;
     //Tenemos los datos de salida
     double energía;
     //Preguntas de entrada
     System.out.print("Ingrese la masa de la cantidad de agua");
     m = teclado.nextDouble();
     System.out.print("Ingrese la temperatura que desea alcanzar");
     t = teclado.nextDouble();
     //Calculos de datos de salida
     energía =  m *  4181.3  * t ;
     //Mostrar datos de salida
     System.out.println("La energía que se necesita para alcanzar la temperatura deseada es" + energía);
     
    }
}
