package vectorymatriz;


public class Vector {

    public static void main(String[] args) {
        
        int vector[] = new int[5]; // Le ponemos la dimension al vector
        
        for (int i = 0; i < 5; i++) {
         
            vector[i] = 6; // Le asignamos a cada posicion del vector el numero 6 
            
        }
        
        for (int i = 0; i < 5; i++) {
            
            // Usamos la i para pasar por todos los elementos y mostrarlos
            System.out.print("[" + vector[i] + "]");
            
        }
        
        System.out.println(" ");
        
        
    }

}
