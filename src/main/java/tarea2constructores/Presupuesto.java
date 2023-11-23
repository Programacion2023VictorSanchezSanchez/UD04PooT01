package tarea2constructores;

import tarea1clases.Persona;

public class Presupuesto {
    private Superficie suelo;
    private Alfombra alfombra;
    private Persona cliente;

    //Constructor de presupuesto
    public Presupuesto(Superficie suelo, Alfombra alfombra, Persona cliente){
        this.alfombra = alfombra;
        this.suelo = suelo;
        this.cliente = cliente;
    }

    //Getters y setters de suelo
    public Superficie getSuelo() {
        return this.suelo;
    }
    public void setSuelo(Superficie suelo) {
        this.suelo = suelo;
    }

    //Getters y setters de alfombra
    public Alfombra getAlfombra() {
        return this.alfombra;
    }
    public void setAlfombra(Alfombra alfombra) {
        this.alfombra = alfombra;
    }

    //Getters y setters de cliente
    public Persona getCliente() {
        return this.cliente;
    }
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    //Metodo para conseguir el coste total
    public double getCosteTotal(){
        double coste;

        coste = this.alfombra.getCoste() * this.suelo.getArea();

        return coste;
    }

    //Metodo para comparar presupuestos
    public void comparaPresupuesto(Presupuesto presupuesto){
        if(this.getCosteTotal() < presupuesto.getCosteTotal()){
            System.out.println("El presupuesto alfombra " + alfombra.getTiposTejido() + " es mejor por " + (presupuesto.getCosteTotal() - this.getCosteTotal()) + "€");
        }
        else if(this.getCosteTotal() > presupuesto.getCosteTotal()){
            System.out.println("El presupuesto alfombra " + this.alfombra.getTiposTejido() + " es mejor por " + (this.getCosteTotal() - presupuesto.getCosteTotal()) + "€");
        }
        else{
            System.out.println("Los dos son iguales con un precio de " + this.getCosteTotal() + "€");
        }
    }

    //Sobrecargamos toString
    public String toString() {
        return "Presupuesto: " + this.alfombra.getNombre() + "\n" +
                "Tejido: " + this.alfombra.getTiposTejido() + "\n" +
                "Cliente: " + this.cliente.getFullName() + "\n" +
                "Superficie: " + this.suelo.getArea() + "\n" +
                "Total: " + this.getCosteTotal() + "€" + "\n";
    }
}
