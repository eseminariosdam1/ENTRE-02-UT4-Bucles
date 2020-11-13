import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Eneko Seminario
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        boolean esOctal = false;
        int cifra;
        int numero = n;
        while(n != 0){
          if(n % 10 >= 0 && n % 10 < 7 ){
            esOctal = true;
          }else{
            return esOctal;
        }
          n = n / 10;
          return true;

    }
    return esOctal;
}


    
    public static int contarCifras(int n) {
        int cifras = 0;
        int contadorCifras = 0;
        while (n != 0){
            n = n / 10;
            cifras++;
            contadorCifras++;
        } 
        return cifras;
    }
}
   
        
    

  
   
    
       
    
       
    





   
    
