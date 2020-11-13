
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Eneko Semiario
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int total = 0;
        int sumaDeCifra = 0;
        int cifrasCalculadas = 0;
        while(Utilidades.contarCifras(n1) > cifrasCalculadas) {
             int numero1 = (n1 % 10);             
             int numero2 = (n2 % 10);
             numero1 = n1 / 10;
             numero2 = n2 / 10;
             int llevada = 0;
             int resultadoSuma = 0;
             sumaDeCifra = numero1 + numero2 + llevada;
             if(sumaDeCifra >= 8){
                resultadoSuma = 0;
                resultadoSuma = sumaDeCifra - 8;
                llevada++;
                }
             total += resultadoSuma;
             cifrasCalculadas++;
            }
           
            return total;
        }  
        
    }
