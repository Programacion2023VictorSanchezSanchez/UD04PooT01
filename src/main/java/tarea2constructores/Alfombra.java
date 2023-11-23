package tarea2constructores;

/**
 * La clase de Alfombra contiene información sobre las alfombras
 * Autor: Víctor Sánchez
 */
public class Alfombra {
    private String nombre;
    private double coste;
    private TiposTejido tiposTejido;

    //Constructor
    public Alfombra(String nombre, double coste, TiposTejido tiposTejido){
        this.nombre = nombre;
        this.coste = coste;
        this.tiposTejido = tiposTejido;
    }

    //Getter y setters de nombre
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getters y setters de coste
    public double getCoste() {
        return this.coste;
    }
    public void setCoste(double coste) {
        this.coste = coste;
    }

    //Getters y setters de tipos de tejido
    public TiposTejido getTiposTejido() {
        return this.tiposTejido;
    }
    public void setTiposTejido(TiposTejido tiposTejido) {
        this.tiposTejido = tiposTejido;
    }
}
