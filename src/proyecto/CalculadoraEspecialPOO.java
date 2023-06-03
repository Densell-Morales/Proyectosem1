package proyecto;

   import java.util.Scanner;

public class  CalculadoraEspecialPOO{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       Calculadora calculadora = new Calculadora("JP");
       CalculadoraEspecial CalculadoraEspecial = new CalculadoraEspecial ();
       boolean salir = false;
       int opcion; 
               
       
       do{
           System.out.println("");
           System.out.println("=======================");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Verificar numero Primo");
           System.out.println("7. Potencia");
           System.out.println("8. Logaritmo");
           System.out.println("9. Angulo de Pi rad");
           System.out.println("10. Coseno del angulo");
           System.out.println("11. Seno del angulo");
           System.out.println("12. Exponencial");
           System.out.println("13. Salir");
           System.out.println("Selecciona una opcion");
           System.out.println("=======================");
           opcion = sn.nextInt();
            switch(opcion){
                case 1:
                   System.out.println("El resultado de la suma es = " + calculadora.sumar(10, 5));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calculadora.restar(10, 5));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calculadora.multiplicar(10, 5));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calculadora.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadora.raizCuadrada(16));
                    break;
                case 6:
                    System.out.println("Es primo? = " +calculadora.esPrimo(11));
                    break;   
                 case 7:
                   System.out.println("El resultado de la potencia es = " + CalculadoraEspecial.Potencia(5,2));
                   break;
                case 8:
                   System.out.println("El resultado del logaritmo es = " + CalculadoraEspecial.Log(50));
                   break;
                case 9:
                   System.out.println("El Angulo es = " + CalculadoraEspecial.Angulo(4));
                   break;
                case 10:
                    System.out.println("El Coseno del angulo es = " + CalculadoraEspecial.cos(60));
                    break;
                case 11:
                    System.out.println("El Seno del angulo es = " + CalculadoraEspecial.Sin(60));
                    break;
                case 12:
                    System.out.println("El resultado de la exponencial es = " + CalculadoraEspecial.Tangente(60));
                    break;
                case 13:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 13");
            }
       }
        while(!salir);   
        
    }
}
