package ejemplossecuenciales;

import java.util.Scanner;


public class IfSimple {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la edad del usuario");
        int edad = leer.nextInt();
        
        if(edad > 18){
            
            System.out.println("Es mayor de edad");
            
            
        }
        
        
        
        
        
    }

}
