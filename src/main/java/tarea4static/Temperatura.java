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

    //Definimos la variable static
    private static TipoTemperatura configuracionActual = TipoTemperatura.CELSIUS;


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
}
