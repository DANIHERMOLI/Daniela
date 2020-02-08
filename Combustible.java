import java.util.Scanner;
/**
 * Este programa está diseñado para encotrar la conversión entre MPG a LPK
 * 
 * @author (Daniela) 
 * @version (2.0)
 */
public class Combustible
{
 public static void main(String[] args)
{
 Scanner teclado = new Scanner(System.in);
 //Tenemos los datos de entrada
 double distancia;
 //Tenemos un dato de salida: Conversión de MPG a LPK
 double conversión;
 //Preguntas datos de entrada
 System.out.print("Ingrese el número a convertir en MPG");
 distancia = teclado.nextDouble();
 //Calcular datos de salida
 conversión = distancia * 1.609;
 //Mostrar datos de salida
 System.out.println("La conversión de MPG a LPK es" + conversión);
 }
}
