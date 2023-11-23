package tarea2constructores;

/**
 * La clase de Superficie contiene los datos de una superficie
 * Autor: Víctor Sánchez
 */
public class Superficie {
    private double ancho;
    private double alto;

    //Establecemos defaults
    static final double ANCHO_POR_DEFECTO=0;
    static final double ALTO_POR_DEFECTO=0;

    //Constructores
    public Superficie(){
        this(ANCHO_POR_DEFECTO,ALTO_POR_DEFECTO);
    }
    public Superficie(double ancho, double alto){
        if(ancho < 0){
            this.ancho = 0;
    }
        else{
            this.ancho = ancho;
    }
        if(alto < 0){
            this.alto = 0;
    }
        else{
            this.alto = alto;
    }
    }

    //Setters y getters de ancho
    public double getAncho() {
        return this.ancho;
    }
    public void setAncho(double ancho) {
        if (ancho < 0) {
            this.ancho = 0;
        } else {
            this.ancho = ancho;
        }
    }

    //Setters y getters de alto
    public double getAlto() {
        return this.alto;
    }
    public void setAlto(double alto) {
        if(alto < 0){
            this.alto = 0;
        }
        else{
            this.alto = alto;
        }
    }

    //Metodo para el area
    public double getArea(){
        double area;
        area = this.ancho * this.alto;
        return area;
    }
}
