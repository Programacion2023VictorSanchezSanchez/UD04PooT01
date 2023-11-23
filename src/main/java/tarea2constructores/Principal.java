package tarea2constructores;

import tarea1clases.Persona;

import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
       Principal principal = new Principal();

        int opc;

        //Leemos la opción
        opc=principal.menu();


        /**
         * Llamamos con un switch al metodo necesario para la opcion introducida por el usuario
         * @return opcion seleccionada por el usuario
         */
        //Salimos cuando el usuario pulsa la opcion "5-Salir"
        while (opc != 5){
            switch(opc) {
                case 1: //Probar cliente vip
                    principal.testClienteVip();
                    break;
                case 2: //Probar superficie
                    principal.testSuperficie();
                    break;
                case 3: //Probar persona

                    break;
                case 4: //Probar mi clase

                    break;
            }
            opc=principal.menu();
        }
        System.out.println("Saliendo...");
    }

    /**
     * Menu que mostramos para obtener el parametro que darle al switch
     * @return la opción que introduzca el usuario entre el 1 y el 5
     */
    int menu(){
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
            System.out.println("1-Probar cliente vip");
            System.out.println("2-Probar superficie");
            System.out.println("3-Probar ");
            System.out.println("4-Probar ");
            System.out.println("5-Salir");

            System.out.println("Elije una opción: (1-5) ");
            opc = sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Has elegido la opción 1: Probar mi cliente vip");
                    break;
                case 2:
                    System.out.println("Has elegido la opción 2: Probar mi superficie");
                    break;
                case 3:
                    System.out.println("Has elegido la opción 3: Probar mi");
                    break;
                case 4:
                    System.out.println("Has elegido la opción 4: Probar mi");
                    break;
                case 5:
                    System.out.println("Has elegido la opción 5: Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opc < 1 || opc > 5);
        return opc;
    }

    /**
     * Probamos la clase ClienteVip
     */
    private void testClienteVip(){
        //Constructor sin parametros
        ClienteVip clienteVip = new ClienteVip();
        System.out.println(clienteVip.toString());

        //Constructor con 2 parametros
        Persona persona = new Persona();
        persona.setNombre("Pepe");
        persona.setApellido("Apellido");

        clienteVip = new ClienteVip(persona, 1000.0);
        System.out.println(clienteVip.toString());

        //Constructor de 4 parametros
        Persona personaDos = new Persona();
        personaDos.setNombre("Maria");
        personaDos.setApellido("Apellido");

        clienteVip = new ClienteVip(personaDos,TiposVip.GOLD,200000.0,"maria@correo.es");
        System.out.println(clienteVip.toString());
    }
    /**
     * Probamos la clase Superficie
     */
    private void testSuperficie(){

        //Constructor con 2 parametros
        Superficie superficie = new Superficie(5,4);
        System.out.println("Area = " + superficie.getArea());

        //Cambiamos un parametro y mostramos
        superficie.setAlto(-1.5);
        System.out.println("Ancho = " + superficie.getAncho());
        System.out.println("Alto = " + superficie.getAlto());
        System.out.println("Area = " + superficie.getArea());


    }
}
