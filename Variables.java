import java.util.Scanner;
/**
 * En este programa se hallará el valor de dos variables
 * 
 * @author (Daniela) 
 * @version (a version number or a date)
 */
public class Variables
{
 public static void main(String[] args)
 {
 Scanner teclado = new Scanner(System.in);
 //Tenemos dos datos de entrada : a , b
 //Definir 2 variables
 int a , b;
 //Tenemos datos de salida
 int suma;
 int diferencia;
 int producto;
 int cociente;
 int residuo;
 double logaritmo;
 double potencia;
 // 1. Preguntas datos de entrada
 System.out.print( "Ingrese el valor de la variable a:");
 a = teclado.nextInt();
 System.out.print( "Ingrese el valor de la variable b:");
 b = teclado.nextInt();
 // 2. Calcular los datos de salida
 suma = (a + b);
 diferencia = (b - a);
 producto = (a * b);
 cociente = (a / b);
 residuo = (a % b);
 logaritmo = Math.log(a);
 potencia = Math.pow(a,b);
 //Mostrar los datos de salida
 System.out.println("La suma de las variables es" + suma);
 System.out.println("La resta de las variables es" + diferencia);
 System.out.println("El producto de las variables es" + producto);
 System.out.println("El cociente cuando a es divido en b es" + cociente);
 System.out.println("El residuo de la división es" + residuo);
 System.out.println("El logaritmo de la variable a es" + logaritmo);
 System.out.println("La potencia de la varible a elevada la variable b es" + potencia);
}
}