
package SubprocesoYArreglos;

import java.util.Scanner;
/*Crear 2 arreglos. 1 de nombres y otro para guardar las edades de esa persona.
El tamaño del arreglo va a definirlo el usuario (ingresa por teclado la cantidad de personas que va a registrar
A su vez, al mostrar los datos, analizar si es mayor de edad y mostrar un mensaje*/

public class EjemplosSubprocesos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);//Invoco a la clase que me permite guardar datos por lectura de teclado
        System.out.println("De cuantas personas va a ingresar datos");//Mensaje que muestro por pantalla
        int varCantidad = leer.nextInt(); //Defino variable y guardo el dato.

        String[] varArreglo1 = new String[varCantidad]; //Creo y dimensiono un arreglo Para guardar NOMBRES, segun la cantidad que quiso el usuario
        int[] varArreglo2 = new int[varCantidad]; // DIMENSION del arreglo Para guardar EDADES
        cargarDatos(varArreglo1, varArreglo2, leer); //Invoco al subproceso
        mostrarDatos(varArreglo1, varArreglo2, leer);//Invoco al subproceso
    }

//Recordemos, los subprocesos se reutilizan. RECORDAN QUE DEBEN IR FUERA DE LA CLASE MAIN
    public static void cargarDatos(String[] vectorCualquiera1, int[] vectorCualquiera2, Scanner leer) {
        //Para no enviar tambien la dimension, utilizo la funcion LENGTH que me retorna la dimension del arreglo.
        for (int i = 0; i < vectorCualquiera1.length; i++) {
            System.out.println("Ingrese el NOMBRE de la persona " + (i + 1) + "/" + vectorCualquiera1.length);
            vectorCualquiera1[i] = leer.next();
            System.out.println("Ingrese la edad de la persona " + (i + 1) + "/" + vectorCualquiera2.length);
            vectorCualquiera2[i] = leer.nextInt();
        }
    }

    public static void mostrarDatos(String[] vectorCualquiera1, int[] vectorCualquiera2, Scanner leer) {
        String respuesta = "";
        do {
            for (int i = 0; i < vectorCualquiera1.length; i++) { // Recorremos el arreglo.
                if (vectorCualquiera2[i] >= 18) {
                    System.out.println((vectorCualquiera1[i]).toUpperCase() + ", de edad:" + vectorCualquiera2[i] + ". ES MAYOR DE EDAD");
                } else {
                    System.out.println(vectorCualquiera1[i] + ", de edad:" + vectorCualquiera2[i] + ". NO ES MAYOR UPSSSS");
                }

                if (i != vectorCualquiera1.length - 1) {//ESTO LO USO PARA QUE SOLO PREGUNTE, HASTA LA ULTIMA POSICION DEL VECTOR
                    System.out.println("");
                    System.out.println("Mostramos la siguiente persona??? SI / NO ");
                    respuesta = leer.next();//LEO RESPUESTA
                    respuesta = respuesta.toUpperCase();//LO CONVIERTO A MAYUSCULAS, para reducir errores 
                } else {
                    System.out.println("NO HAY MAS DATOS PARA MOSTRAR");
                    respuesta = "NO";
                }
            }
        } while (("SI".equals(respuesta))); // CONDICION LOGICA PARA VER SI SIGUE O NO MOSTRANDO DATOS
    }

}
