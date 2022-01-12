package ejemplossecuenciales;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        // Nos interesa que el usuario ingrese un numero y muestre el
        // equivalente en numero romano
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();

        switch (numero) {
            case 1:
                System.out.println("En romano es I");
                break;
            case 2:
                System.out.println("En romano es II");
                break;
            case 3:
                System.out.println("En romano es III");
                break;
            case 4:
                System.out.println("En romano es IV");
                break;
            case 5:
                System.out.println("En romano es V");
                break;
            default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");
        }

    }

}
