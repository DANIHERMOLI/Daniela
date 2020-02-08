import java. util.Scanner;
/**
 * Este programa está diseñado para hallar el área de un polígono.
 * 
 * @author (Daniela) 
 * @version (6.0)
 */
public class Polígono
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        //Datos de entrada
        double s, n;
        //Datos de salida
        double área;
        //Preguntas de entrada
        System.out.print("Ingrese el valor de la longitud del polígono");
        s = teclado.nextDouble();
        System.out.print("Ingrese el valor de número de lados del polígono");
        n = teclado.nextDouble();
        //Cálculos
        área = (n * Math.pow(s,2)) / (4 * Math.tan (Math.PI/n));
        //Mostrar datos de salida
        System.out.println("El valor del área del polígono es" + área); 
    
    }
}
