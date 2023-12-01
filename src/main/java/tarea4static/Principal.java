package tarea4static;

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
        //Salimos cuando el usuario pulsa la opcion "2-Salir"
        while (opc != 2){
            switch(opc) {
                case 1: //Probar temperatura
                    principal.testTemperatura();
                    break;

            }
            opc=principal.menu();
        }
        System.out.println("Saliendo...");
    }

    /**
     * Menu que mostramos para obtener el parametro que darle al switch
     * @return la opción que introduzca el usuario entre el 1 y el 2
     */
    int menu(){
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
            System.out.println("1-Probar temperatura");
            System.out.println("2-Salir");

            System.out.println("Elije una opción: (1-2) ");
            opc = sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Has elegido la opción 1: Probar mi temperatura");
                    break;
                case 2:
                    System.out.println("Has elegido la opción 2: Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opc < 1 || opc > 5);
        return opc;
    }

    /**
     * Metodo para probar la clase temperatura
     */
    private void testTemperatura(){
        //Mostramos configuracion actual
        System.out.println(Temperatura.getConfiguracionActual());

        //Creamos objetos para dias de la semana
        Temperatura lunes = new Temperatura(DiaSemana.LUNES, 36.6);
        Temperatura martes = new Temperatura(DiaSemana.MARTES, 67.2);
        Temperatura miercoles = new Temperatura(DiaSemana.MIERCOLES, 10.1);

        //Cambiamos configuracion actual y la mostramos
        Temperatura.setToFahrenheit();
        System.out.println(Temperatura.getConfiguracionActual());

        //Mostramos temperaturas actuales
        System.out.println(lunes);
        System.out.println(martes);
        System.out.println(miercoles);

        //Cambiamos configuracion actual y la mostramos
        Temperatura.setToCelsius();
        System.out.println(Temperatura.getConfiguracionActual());

        //Mostramos temperaturas actuales
        System.out.println(lunes);
        System.out.println(martes);
        System.out.println(miercoles);

        //Pedimos temperaturas y las mostramos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una temperatura Celsius para pasarla a Fahrenheit: ");
        double temperatura = sc.nextDouble();
        System.out.println(Temperatura.toFahrenheit(temperatura));

        System.out.println("Introduce una temperatura Fahrenheit para pasarla a Celsius: ");
        temperatura = sc.nextDouble();
        System.out.println(Temperatura.toCelsius(temperatura));

    }
}


