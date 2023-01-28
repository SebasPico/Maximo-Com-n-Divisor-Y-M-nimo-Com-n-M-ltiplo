package co.edu.upb.TrabajoLaboratorio;
import java.util.*;

public class MinimoComunMultiplo {

    public static void main(String[] args) {
        
       Scanner entrada = new Scanner (System.in);
        
       int num, num2, i = 2, mcm = 1;
       
        System.out.print("Ingrese el primero número: ");
        num = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = entrada.nextInt();

        while(i <= num || i <= num2){
            if(num%i == 0  || num2%i == 0){
                if(num%i == 0){
                    num /= i;
                }
                if(num2%i == 0){
                    num2 /= i;
                }
                
                mcm *= i;
            }
            else{
                i++;
            }
            
        }
        
        System.out.println("El minimo comun multiplo  es: " + mcm);

    }//Cierre main
    
}//Cierre clase
