
package proyecto;

public class CalculadoraEspecial {
   
    
 public double Potencia(double primerNumero, double segundoNumero){
        return Math.pow(primerNumero, segundoNumero);
    }
 
  public double Log(double primerNumero){
        return Math.log10(primerNumero);
    }
  
    public double Angulo(double primerNumero){
        return (Math.PI/(primerNumero)) * (180 /Math.PI);
    }
    public double cos(double primerNumero){
        double angulo = Math.toRadians(primerNumero);
        return Math.cos(angulo);
    }
    public double Sin(double primerNumero){
        double angulo = Math.toRadians(primerNumero);
        return Math.sin(angulo); 
    }
     public double Tangente(double primerNumero){
        double angulo = Math.toRadians(primerNumero);
        return Math.tan(angulo);
    }
   
}