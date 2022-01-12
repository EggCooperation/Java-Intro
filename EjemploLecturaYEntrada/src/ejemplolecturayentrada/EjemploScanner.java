package ejemplolecturayentrada;

import java.util.Scanner; // Este es el importe de la clase Scanner

public class EjemploScanner {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        
        System.out.println("Ingrese una cadena");
        String cadena = leer.nextLine(); // Leer una cadena

        System.out.println("Ingrese un numero entero");
        int numEntero = leer.nextInt(); // Leer un entero

        System.out.println("Ingrese un numero real");
        double numReal = leer.nextDouble(); // Leer un real. Se pone con punto el numero
        

        System.out.println("Ingrese un booleano");
        boolean logico = leer.nextBoolean(); // Leer un lógico 

        System.out.println("Numero Entero " + numEntero); // Se imprime el entero

        System.out.println("Numero Real " + numReal); // Se imprime el real

        System.out.println("Cadena " + cadena);

        System.out.println("Logico " + logico);

    }

}
