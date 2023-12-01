package tarea4static;

/**
 * Clase temperatura con las configuraciones y datos de las temperaturas
 * Autor: Víctor Sánchez
 */


public class Temperatura {

    /**
     * tipo enum de Temperatura
     */
    enum TipoTemperatura{

        CELSIUS, FAHRENHEIT
    }

    /**
     * tipo enum para el dia de la semana
     */
    enum DiaSemana{
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    //Definimos la variable static
    private static TipoTemperatura configuracionActual = TipoTemperatura.CELSIUS;

    //Getter configuración actual
    public TipoTemperatura getConfiguracionActual(){
        return configuracionActual;
    }

    //Definimos variables
    private double tempCelsius;
    private double tempFahrenheit;
    private DiaSemana diaSemana;

    //Getters y setters de temperatura
    public void setTemperatura(double temperatura){
        if(configuracionActual == TipoTemperatura.CELSIUS){
            this.tempCelsius = temperatura;
            this.tempFahrenheit = toFahrenheit(temperatura);
        }
        else{
            this.tempFahrenheit = temperatura;
            this.tempCelsius = toCelsius(temperatura);
        }

    }
    public double getTemperatura(){
        if(configuracionActual == TipoTemperatura.CELSIUS){
            return this.tempCelsius;
        }
        else{
            return this.tempFahrenheit;
        }
    }

    //Getters y setters de dia de la semana
    public void setDiaSemana(DiaSemana diaSemana){
        this.diaSemana = diaSemana;
    }
    public DiaSemana getDiaSemana(){
        return this.diaSemana;
    }

    //Constructor de la clase
    public Temperatura(DiaSemana diaSemana, double temperatura){
        this.diaSemana = diaSemana;
        if(configuracionActual == TipoTemperatura.CELSIUS){
            this.tempCelsius = temperatura;
            this.tempFahrenheit = toFahrenheit(temperatura);
        }
        else{
            this.tempFahrenheit = temperatura;
            this.tempCelsius = toCelsius(temperatura);
        }
    }


    //Metodos para cambiar la configuracion de temperatura
    public static void setToCelsius(){
        configuracionActual = TipoTemperatura.CELSIUS;
    }
    public static void setToFahrenheit(){
        configuracionActual = TipoTemperatura.FAHRENHEIT;
    }

    //Metodos para pasar entre tipos de temperatura
    public static double toCelsius(double temperatura){
        double celsius;
        celsius = (temperatura - 32) * 5/9;
        return celsius;
    }
    public static double toFahrenheit(double temperatura){
        double fahrenheit = 0;
        fahrenheit = (temperatura * 9/5) + 32;
        return fahrenheit;
    }

    //Sobrecargamos toString
    public String toString() {
        if(configuracionActual == TipoTemperatura.CELSIUS) {
            return this.diaSemana + " " + tempCelsius + "ºC\n" +
                    "Si fuera la configuración Fahrenheit\n" +
                    this.diaSemana + " " + tempFahrenheit + "ºF\n";
        }
        else{
            return this.diaSemana + " " + tempFahrenheit + "ºF\n" +
                    "Si fuera la configuración Celsius\n" +
                    this.diaSemana + " " + tempCelsius + "ºC\n";
        }
    }

}
