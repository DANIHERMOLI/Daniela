import java.util.Scanner;
/**
 * Este programa esta diseñado para hallar el volumen del tronco de un cono.
 * 
 * @author (Daniela) 
 * @version (10.0)
 */
public class Tronco
{
    public static void man(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        //Datos de entrada
        double h1, r, h2, p;
        //Datos de salida
        double volumen, area1, area2;
        //Preguntas de entrada
        System.out.print("Ingrese la altura del cono completo");
        h1 = teclado.nextDouble();
        System.out.print("Ingrese el area del cono completo");
        r = teclado.nextDouble();
        System.out.print("¿Cual es la altura de la parte del cono cortada?");
        h2 = teclado.nextDouble();
        System.out.print("¿Cual es el area de la parte del cono cortada?");
        p = teclado.nextDouble();
        //Cálculos
        area1 = Math.PI*Math.pow(r,2);
        area2 = Math.PI*Math.pow(p,2);
        volumen = (area1*h1)-(area2*p);
        //Mostrar datos de salida
        System.out.println("¿Cual es el volumen del tronco del cono?" + volumen);
    }
}
