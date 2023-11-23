package tarea2constructores;

/**
 * La clase de Punto contiene informacion de los puntos y la distancia entre estos
 * Autor: Víctor Sánchez
 */
public class Punto {
    private int x;
    private int y;

    //Establecemos defaults
    static final int X_POR_DEFECTO=0;
    static final int Y_POR_DEFECTO=0;

    //Constructores
    public Punto(){
        this(X_POR_DEFECTO,Y_POR_DEFECTO);
    }
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Setters y getters de x
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }

    //Setters y getters de y
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }

    //Metodo calcular la distancia
    private double calcularDistancia(int xUno, int yUno, int xDos, int yDos){
        double distancia;
        distancia = Math.sqrt((xDos - xUno) * (xDos - xUno) + (yDos - yUno) * (yDos - yUno));
        return distancia;
    }

    //Metodos para mostrar la distancia entre puntos
    public double distancia(){
        double distancia;
        distancia = calcularDistancia(this.x, this.y,X_POR_DEFECTO,Y_POR_DEFECTO);
        return distancia;
    }
    public double distancia(int x, int y){
        double distancia;
        distancia = calcularDistancia(this.x, this.y, x, y);
        return distancia;
    }
    public double distancia (Punto punto){
        double distancia;
        distancia = calcularDistancia(this.x, this.y, punto.x, punto.y);
        return distancia;
    }
}
