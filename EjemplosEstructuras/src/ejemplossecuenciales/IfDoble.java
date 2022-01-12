package ejemplossecuenciales;

import java.util.Scanner;


public class IfDoble {

    public static void main(String[] args) {
        
        //Nos interesa que el usuario ingrese un numero y saber si es par o impar
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        
        if(numero % 2 == 0){
            
            System.out.println("Es par");
            
            
        }else{
            
            System.out.println("Es impar");
            
        }
        
        
        
    }

}
