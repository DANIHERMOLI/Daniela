import java.util.Scanner;
/**
 * Este programa esta diseñao para encontrar la distancia entre dos puntos
 * 
 * @author (Daniela) 
 * @version (3.0)
 */
public class Distancia
{ 
    public static void main(String[] args)
   {
     
     Scanner teclado = new Scanner(System.in);
    //Tenemos los datos de entrada
    double t , g , lo , la ; 
    //Tenemos un dato de salida
    double distancia;
    //Preguntas de entrada
    System.out.print("Ingrese la longitud de la primer ciudad");
    t = teclado.nextDouble();
    System.out.print("Ingrese la latitud de la primer cuidad");
    g = teclado.nextDouble();
    System.out.print("Ingresa la longitud de la segunda cuidad");
    lo = teclado.nextDouble();
    System.out.print("Ingrese la latitud de la segunda ciudad");
    la = teclado.nextDouble();
    //Calcular datos de salida
    distancia = 6371.07 * Math.acos(Math.sin(t))*Math.sin(lo)+Math.cos(t)*Math.cos(lo)*Math.cos(g)-la;
    //Monstrar datos de salida
    System.out.println("La distancia entre las dos ciudad es" + distancia);
  
   }
}
