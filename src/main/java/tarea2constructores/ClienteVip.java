package tarea2constructores;

import tarea1clases.Persona;

/**
 * La clase de ClienteVip contiene informacion de los clientes vip
 * Autor: Víctor Sánchez
 */
public class ClienteVip {
     private Persona cliente;
     private TiposVip tiposVip;
     private double limiteCredito;
     private String email;

    //Setters y getters de limiteCredito
    public void setLimiteCredito(double limiteCredito) {
        if(limiteCredito >= 0){
            this.limiteCredito = limiteCredito;
        }
        else{
            this.limiteCredito = 0;
        }
    }
    public double getLimiteCredito() {
        return this.limiteCredito;
    }

    //Setters y getters de email
    public void setEmail(String email) {
        if(email.contains("@")) {
            this.email = email;
        }
        else{
            this.email = "";
        }
    }
    public String getEmail() {
        return this.email;
    }

    //Setters y getters de cliente
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    public Persona getCliente() {
        return cliente;
    }

    //Setters y getters de tiposvip
    public void setTiposVip(TiposVip tiposVip) {
        this.tiposVip = tiposVip;
    }
    public TiposVip getTiposVip() {
        return tiposVip;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getFullName() + "\n" +
                "Tipo cliente: " + this.tiposVip + "\n" +
                "email: " + this.email + "\n" +
                "limite crédito: " + this.limiteCredito + "\n";
    }


    //Asignamos defaults
    static final String CORREO_POR_DEFECTO="anonimo@sincorreo.es";
    static final String NOMBRE_POR_DEFECTO="Anonimo";
    static final double CREDITO_POR_DEFECTO=0;

    //Constructores
    public ClienteVip(){
        this(new Persona(),TiposVip.NORMAL,CREDITO_POR_DEFECTO,CORREO_POR_DEFECTO);
        cliente.setNombre(NOMBRE_POR_DEFECTO);
    }
    public ClienteVip(Persona cliente, TiposVip tiposVip, double limiteCredito, String email) {
        this.cliente = cliente;
        this.tiposVip = tiposVip;
        if(limiteCredito >= 0){
            this.limiteCredito = limiteCredito;
        }
        else{
            this.limiteCredito = 0;
        }
        if(email.contains("@")) {
            this.email = email;
        }
        else{
            this.email = "";
        }
    }
    public ClienteVip(Persona cliente, double limiteCredito){
        this(cliente,TiposVip.NORMAL,limiteCredito,CORREO_POR_DEFECTO);

    }
}
