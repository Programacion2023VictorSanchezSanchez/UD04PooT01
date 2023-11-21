package tarea1clases;

/**
 * La clase persona contiene la información de personas guardadas
 * Autor: Víctor Sánchez
 */
public class Persona {
    private String nombre = "";
    private String apellido = "";
    private String nif = "";
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

    //Devuelve el nombre completo
    public String getFullName(){
        String fullName = this.nombre + "" +  this.apellido;
        if(this.nombre.isEmpty() && this.apellido.isEmpty()){
            fullName = "";
        }
        if(this.nombre.isEmpty()){
            fullName = this.apellido;
        }
        if(this.apellido.isEmpty()){
            fullName = this.nombre;
        }

        return fullName;
    }

    //Setters y getters de nif
    public void setNif(int dni, char letra){
        if(validarNif(dni, letra)){
        this.nif = "" + dni + "" + letra;
        }
        else{
            System.err.println("Error al introducir el NIF");
        }
    }
    public String getNif(){
        return this.nif;
    }

    //Setters y getters de edad
    public void setEdad(int edad){
        if(edad < 0 || edad > 100){
            this.edad = 0;
        }
        else{
            this.edad = edad;
        }

    }
    public int getEdad(){
        return this.edad;
    }

    //Comprueba si es adolescente
    public boolean esAdolescente(){
        boolean adolescente = false;
        if(this.edad > 12 && this.edad < 20){
            adolescente = true;
        }
        return adolescente;
    }

    // Comprobamos si es valido el Nif
    public boolean validarNif(int dni, char letra){
        boolean valido = true;
        String dniStr = "" + dni;
        if(dniStr.length() != 8){
            valido = false;
        }
        if (!Character.isLetter(letra)) {
            valido = false;
        }
        return valido;
    }
}
