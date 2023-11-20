package tarea1clases;

/**
 * La clase tarea1clases.Coche contiene la información de los coches
 * Autor: Víctor Sánchez
 */
public class Coche {
    private int ruedas;
    private int puertas;
    private double peso;
    private double precio;
    private String motor;
    private String modelo;
    private String color;

    //Setter y getter de puertas
    public void setPuertas (int puertas){
        this.puertas = puertas;
    }
    public int getPuertas(){
        return this.puertas;
    }

    //Setter y getter de peso
    public void setPeso(double peso){
        if(peso < 0){
            System.err.println("Error: El peso no puede ser menor de 0");
        }
        else {
            this.peso = peso;
        }
    }
    public double getPeso(){
        return this.peso;
    }

    //Setter y getter de precio
    public void setPrecio(double precio){
        if(precio > 20000){
            System.err.println("Error: El precio no puede superar los 20000€");
        }
        else{
            this.precio = precio;
        }
    }
    public double getPrecio(){
        return this.precio;
    }

    //Setter y getter de motor
    public void setMotor(String motor){
        this.motor = motor;
    }
    public String getMotor(){
        return this.motor;
    }

    //Setter y getter de modelo
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }

    //Setter y getter de color
    public void setColor(String color){
        this.color = color.toUpperCase();
    }
    public String getColor(){
        return this.color;
    }

    //Setter y getter de ruedas
    public void setRuedas(int ruedas){
        this.ruedas = ruedas;
    }
    public int getRuedas(){
        return this.ruedas;
    }

}
