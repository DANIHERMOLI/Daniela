import java.util.Scanner;
/**
 * Este programa esta diseñado para hallar el área y volumen de un circulo.
 * 
 * @author (Daniela) 
 * @version (4.0)
 */
public class Área
{
  public static void main(String[] args)
  {
      Scanner teclado = new Scanner(System.in);
      //Tenemos dato de entrada
      double r;
      //Tenemos los datos de salida
      double área;
      double volúmen;
      //Preguntas de dato de entrada
      System.out.print("Ingrese el valor del radio");
      r = teclado.nextDouble();
      //Calcular datos de salida
      área = Math.PI * Math.pow(r,2);
      volúmen = Math.pow(r,3);
      //Mostrar datos de salida
      System.out.println("El valor de área del circulo es" + área);
      System.out.println("El valor del volúmen de la esfera es" + volúmen);
    
     
  }
}
