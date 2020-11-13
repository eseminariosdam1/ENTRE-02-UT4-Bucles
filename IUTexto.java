import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Eneko Seminario
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales() {
        char inserteOpcion = 'S';
        while(inserteOpcion == 'S'|| inserteOpcion == 's' ){
        System.out.print('\u000C');
        System.out.println("Por favor, pulse el número1: ");
        int n1 = this.teclado.nextInt();
        System.out.println("Por favor, pulse el número 2: ");
        int n2 = this.teclado.nextInt();
        if(Utilidades.estaEnOctal(n1) && Utilidades.estaEnOctal(n2) && Utilidades.contarCifras(n1) == Utilidades.contarCifras(n2)){
            System.out.println("-------------------------------------------------");
            System.out.printf("%20d\n" , n1);
            System.out.printf("%20d\n" , n2);
            System.out.printf("%10d %10s", "Suma octal: " ,this.calculadora.sumarEnOctal(n1, n2));
        }else{
            System.out.println ("Los numeros introducidos no tienen el mismo numero de cifras o alguno de los numeros no esta en octal, por favor introduce unos numeros válidos");
        }
    } 
}

     /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        System.out.println("Ahora se dibujara una figura");
        int altura = 0;
        System.out.print(" Altura de la figura? (1-10)");
        altura = this.teclado.nextInt();
        if(altura <= 10 && altura >=1){
        pintor.dibujarFigura(altura);
    }else{
        System.out.println("Error, Altura de la figura? (1-10)");
    }
    }

}



 





   