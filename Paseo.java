import java.util.Scanner;
/**
 * Este programa esta diseñado para resolver un ejercicio de costos y cantidades.
 * 
 * @author (Daniela) 
 * @version (9.0)
 */
public class Paseo
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        //Datos de entrada
        int gordos,flacos,tiempo;
        //Datos de salida
        double estudiantes, bus,capgordos,preciocomida,comidadia,habitacion,costohabitacion;
       
        //Preguntas de entrada
        System.out.print("¿Cuantos estudiates gordos van al paseo?");
        gordos = teclado.nextInt();
        System.out.print("¿Cuantos estudiantes flacos van al paseo?");
        flacos = teclado.nextInt();
        System.out.print("¿Cuantos días dura el paseo?");
        tiempo = teclado.nextInt();
        //Cálculos
        estudiantes = gordos + flacos;
        bus = 60;
        capgordos = gordos * 2;
        preciocomida = 10.000;
        comidadia = gordos*5+flacos*3;
        habitacion = estudiantes/4;
        costohabitacion = 25.000;
        //Mostrar datos de salida
        System.out.println("¿Cuantos buses se necesitan?" + (capgordos + flacos) /  bus);
        System.out.println("¿Cuantos platos de comida hay que servir al día?" + comidadia);
        System.out.println("¿Cuanto cuesta la comida de todo el paseo?" + (comidadia*preciocomida)*tiempo);
        System.out.println("¿Cuantas habitaciones se necesitan?" + habitacion);
        System.out.println("¿Cual es el costo de las habitaciones por un día?"+ habitacion*costohabitacion);
        System.out.println("¿Cual es el costo de las habitaciones por todo el paseo?"+ habitacion*costohabitacion*tiempo);
    }
}
