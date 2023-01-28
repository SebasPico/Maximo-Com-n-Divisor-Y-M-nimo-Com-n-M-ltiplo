package co.edu.upb.TrabajoLaboratorio;
import java.util.Scanner;

public class MaximoComunDivisor {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese el primer número: ");
        int x = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int y = entrada.nextInt();
        
        System.out.print("EL maximo común divisor es: " + mcd(x,y));

    }
    
        public static int mcd(int x, int y){
            
          int aux;
          
          while(y != 0){
              aux = y;
              y = x%aux;
              x = aux;
          }
          
          return x;
        }
    

    
}
