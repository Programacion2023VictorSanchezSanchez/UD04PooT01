public class Personas {

    private String nombre;
    private String apellido;
    private String nif;
    private int edad;

    //Setters y getters de nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    //Setters y getters de apellido
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return this.apellido;
    }

    //Setters y getters de nif
    public void setNif(String nif){
        this.nif = nif;
    }
    public String getNif(){
        return this.nif;
    }

    //Setters y getters de edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

}
