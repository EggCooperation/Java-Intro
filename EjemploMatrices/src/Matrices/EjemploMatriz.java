package Matrices;

import java.util.Scanner;

/*Crear una Matriz cuadrada, que  dimensione sus filas y columnas segun la cantidad que indica el usuario (dato ingresado por teclado)
  Crear una funcion que permita llenarla con numeros aleatorios.
  Crear una funcion que permita imprimir la matriz.
  Pedir al usuario que ingrese un valor, luego crear una funcion que retorne un booleano para mostrar mensaje "EL NUMERO 
  SELECCIONADO SI SE ENCUENTRA EN SU MATRIZ O EL NUMERO NO ESTA :(:(:(:(:(:(*/
public class EjemploMatriz {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Recordar que necesito a Scanner para ingresar datos por teclado

        System.out.println("Ingrese la cantidad de Filas / Columnas que desea que tenga su MATRIZ");
        byte cantidadElegida = leer.nextByte(); // Defino una variable y  guardo el valor cuando ingresa por teclado 

        //Declaro el dato del tipo matriz. Defino su tamaño
        int[][] miMatriz = new int[cantidadElegida][cantidadElegida];//Las filass y columnas, las defino "dinamicamente"
        
        llenarMatriz(miMatriz);//Invoco a la FUNCION, enviando como parametro mi MATRIZ
        imprmirMatriz(miMatriz);//Invoco a la FUNCION, enviando como parametro mi MATRIZ
        System.out.println("Ingrese un numero para buscar en su MATRIZ");
        byte numeroBuscado = leer.nextByte();// Guardo el dato, "el numero que quiero buscar"

        //En la expresion logica del condicional, invoco la FUNCION que retorna un booleano.
        //Recordemos que por definicion, las funciones que retornan un valor especifico, puedo utilizarlas dentro de expresiones
        //logicas, asignar el resultado a una nueva variable o invocarlas dentro de un SOUT.
        //Enviando como parametro,la MATRIZ y el NUMERO que quiero buscar.
        if (buscarValor(miMatriz, numeroBuscado) == true) {
            System.out.println("EL NUMERO SELECCIONADO SI SE ENCUENTRA EN SU MATIZ"); //SALIDA POR VERDADERO
        } else {
            System.out.println("NO HUBO SUERTE AL BUSCAR EL NUMERO"); //SALIDA POR FALSO
        }

    }
    
//-----------FUNCION SIN RETORNO---------------------//
    public static void llenarMatriz(int[][] cualquierMatriz) {
        //Siempre para recorrer una MATRIZ, recorro con UN FOR por cada dimension ( En este caso, 1 para filas otro para columnas)
        for (byte i = 0; i < cualquierMatriz.length; i++) {
            for (byte j = 0; j < cualquierMatriz.length; j++) {
                cualquierMatriz[i][j] = (byte) (Math.random() * 50); // Asigno a la posicion [i][j] un valor aleatorio
            }
        }
    }
    
//-----------FUNCION SIN RETORNO---------------------//
    public static void imprmirMatriz(int[][] cualquierMatriz) {
        //Utilizo LENGTH para que sea dinamico, es decir, me va a servir sin importar de cuantas filas o columnas sea mi Matriz
        for (byte i = 0; i < cualquierMatriz.length; i++) {
            for (byte j = 0; j < cualquierMatriz.length; j++) {
                System.out.print(cualquierMatriz[i][j] + " ||");
            }
            System.out.println(""); // Esto es para que luego de que termino de imprimir la FILA COMPLETA, haga un salto de linea (ENTER)
        }
    }
    
//-----------FUNCION CON  RETORNO---------------------//
    public static boolean buscarValor(int[][] cualquierMatriz, byte numeroCualquiera) {
        boolean resultado = false; // Declaro e inicializo la variable de retorno
        for (byte i = 0; i < cualquierMatriz.length; i++) {
            for (byte j = 0; j < cualquierMatriz.length; j++) {
                if (numeroCualquiera == cualquierMatriz[i][j]) {
                    resultado = true; // Si cumple la condicion, de encontrar el numero, convierto mi variable a TRUE
                }
            }
        }
        return resultado; // Al finalizar de analizar, retorna el dato booleano .
    }
}


/*OBS: Recordar que las funciones, son porciones de codigo aptas para ser reutilizadas.
Aquello que pongo entre () cuando la defino, es una "advertencia" de que tipo de dato voy a enviar
Cuando las invoco en mi programa principal, entre () van los argumentos con los que va a trabajar mi FUNCION
Por ello, no es necesario que se llamen igual en DELCARACION LOS DATOS.
LO IMPORTANTE: Respetar el orden en que envio los valores, es decir, respetar el tipo de dato enviado.
*/