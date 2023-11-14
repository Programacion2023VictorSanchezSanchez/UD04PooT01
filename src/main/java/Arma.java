/**
 * La clase Arma contiene estadisticas de posibles armas
 * Autor: Víctor Sánchez Sánchez
 */
public class Arma {

    private double damage;
    private int municion;
    private String nombre;
    private String rareza;

    //Setters y getters de daño
    public void setDamage(double damage){
        //El arma no puede hacer 0 de daño o daño negativo ni más de 80
        if(damage <= 0 || damage > 80){
            System.err.println("El daño no es válido");
        }
        else{
            this.damage = damage;
        }
    }
    public double getDamage(){
        return this.damage;
    }

    //Setters y getters de municion
    public void setMunicion(int municion){
        //cargador mínimo de 5 balas
        if(municion < 5){
            this.municion = 5;
        }
        else{
        this.municion = municion;
        }
    }
    public int getMunicion(){
        return this.municion;
    }

    //Setters y getters de nombre
    public void setNombre(String nombre){
        if(nombre.isEmpty()){
            this.nombre = "";
        }
        else{
        this.nombre = nombre;
        }
    }
    public String getNombre(){
        return this.nombre.toUpperCase();
    }

    //Setters y getters de rareza
    public void setRareza(String rareza){
        if(rareza.isEmpty()){
            this.rareza = "Común";
        }
        else{
            this.rareza = rareza;
        }
    }
    public String getRareza(){
        return this.rareza.toUpperCase();
    }

    //Comprobamos si es modificable el arma
    public boolean esModificable(){
        boolean modificable = false;
        //Solo hay un modelo modificable
        if(this.nombre == "M4A1" || this.nombre == "M4a1"){
            modificable = true;
        }
        return modificable;
    }

}
