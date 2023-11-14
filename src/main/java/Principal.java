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
                case 1: //Probar coche
                    break;
                case 2: //Probar calculadora
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
            System.out.println("1-Probar coche");
            System.out.println("2-Probar calculadora");
            System.out.println("3-Probar persona");
            System.out.println("4-Probar mi clase");
            System.out.println("5-Salir");

            System.out.println("Elije una opción: (1-5) ");
            opc = sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Has elegido la opción 1: Probar mi coche");
                    break;
                case 2:
                    System.out.println("Has elegido la opción 2: Probar mi calculadora");
                    break;
                case 3:
                    System.out.println("Has elegido la opción 3: Probar mi persona");
                    break;
                case 4:
                    System.out.println("Has elegido la opción 4: Probar mi clase");
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
}
