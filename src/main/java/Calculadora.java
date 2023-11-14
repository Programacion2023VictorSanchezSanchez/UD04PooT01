/**
 * La clase calculadora que devuelve los numeros y resultados de las operaciones
 * Autor: Víctor Sánchez
 */
public class Calculadora {
    private double primerNumero;
    private double segundoNumero;

    //Setters y getters de primer numero
    public void setPrimerNumero(double primerNumero){
        this.primerNumero = primerNumero;
    }
    public double getPrimerNumero(){
        return this.primerNumero;
    }

    //Setters y getters de segundo numero
    public void setSegundoNumero(double segundoNumero){
        this.segundoNumero = segundoNumero;
    }
    public double getSegundoNumero(){
        return this.segundoNumero;
    }


    //Getters de las diferentes operaciones
    public double getResultadoSuma(){
        return this.primerNumero + this.segundoNumero;
    }
    public double getResultadoResta(){
        return this.primerNumero - this.segundoNumero;
    }
    public double getResultadoMultiplicacion(){
        return this.primerNumero * this.segundoNumero;
    }
    public double getResultadoDivision(){
        double resultado;
        if(this.segundoNumero == 0){
            resultado = 0;
        }
        else{
            resultado = this.primerNumero / this.segundoNumero;
        }
        return resultado;
    }
}
