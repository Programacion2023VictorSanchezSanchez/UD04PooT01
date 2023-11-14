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
                    principal.testCoche();
                    break;
                case 2: //Probar calculadora
                    principal.testCalculadora();
                    break;
                case 3: //Probar persona
                    principal.testPersona();
                    break;
                case 4: //Probar mi clase
                    principal.testArma();
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

    /**
     * Probamos la clase Coche
     */
    private void testCoche(){
            //Creamos objetos
            Coche ibiza = new Coche();
            Coche cordoba = new Coche();

            //Establecemos valores a ibiza
            ibiza.setPuertas(4);
            ibiza.setPeso(1500.0);
            ibiza.setPrecio(15000.0);
            ibiza.setMotor("TDI 1200");
            ibiza.setRuedas(4);
            ibiza.setModelo("Ibiza");
            ibiza.setColor("Rojo");

            //Imprimimos
            System.out.println("Información del primer coche");
            System.out.println("Puertas: " + ibiza.getPuertas());
            System.out.println("Peso: " + ibiza.getPeso() + " kg");
            System.out.println("Precio: " + ibiza.getPrecio() + "€");
            System.out.println("Motor: " + ibiza.getMotor());
            System.out.println("Ruedas: " + ibiza.getRuedas());
            System.out.println("Modelo: " + ibiza.getModelo());
            System.out.println("Color: " + ibiza.getColor());

            //Probamos errores
            cordoba.setPuertas(2);
            cordoba.setPeso(-1200.0);
            cordoba.setPrecio(25000.0);
            cordoba.setMotor("TDI 2000");
            cordoba.setRuedas(4);
            cordoba.setModelo("Cordoba");
            cordoba.setColor("Azul");

        }

    /**
     * Probamos la clase Calculadora
     */
    private void testCalculadora(){
            //Creamos el objeto
            Calculadora calculadora = new Calculadora();

            //Setteamos los numeros
            calculadora.setPrimerNumero(5.0);
            calculadora.setSegundoNumero(4);

            //Mostramos resultado suma y resta
            System.out.println("Suma = " + calculadora.getResultadoSuma());
            System.out.println("Resta = " + calculadora.getResultadoResta());

            //Volvemos a settear los numeros
            calculadora.setPrimerNumero(5.25);
            calculadora.setSegundoNumero(0);

            //Mostramos resultado multiplicacion y division con nuevos valores
            System.out.println("Multiplicación = " + calculadora.getResultadoMultiplicacion());
            System.out.println("División = " + calculadora.getResultadoDivision());
        }

    private void testPersona(){
        //Creamos el objeto
        Persona persona = new Persona();

        //Setteamos los valores
        persona.setNombre("");
        persona.setApellido("");
        persona.setEdad(10);

        //Mostramos
        System.out.println("Nombre completo: " + persona.getFullName());
        System.out.println("¿Es adolescente? = " + persona.esAdolescente());

        //Setteamos valores
        persona.setNombre("Mortadelo");
        persona.setEdad(18);

        //Mostramos
        System.out.println("Nombre completo: " + persona.getFullName());
        System.out.println("¿Es adolescente? = " + persona.esAdolescente());

        //Setteamos apellido
        persona.setApellido("Pérez");

        //Mostramos nombre completo
        System.out.println("Nombre completo: " + persona.getFullName());

        //Setteamos nif erroneo
        persona.setNif(9408901,'B');

        //Mostramos Nif
        System.out.println("NIF: " + persona.getNif());

        //Setteamos nif correcto
        persona.setNif(94089010,'S');

        //Mostramos Nif
        System.out.println("NIF: " + persona.getNif());

    }
    private void testArma(){
        Arma arma = new Arma();

        arma.setMunicion(50);
        arma.setRareza("");
        arma.setNombre("M4a1");
        arma.setDamage(43);

        System.out.println("Nombre: " + arma.getNombre());
        System.out.println("Daño: " + arma.getDamage());
        System.out.println("¿Es modificable? " + arma.esModificable());
        System.out.println("Rareza: " + arma.getRareza());
        System.out.println("Munición: " + arma.getMunicion());

        arma.setMunicion(3);
        arma.setRareza("Raro");
        arma.setNombre("Ak47");
        arma.setDamage(89);

        System.out.println("Nombre: " + arma.getNombre());
        System.out.println("Daño: " + arma.getDamage());
        System.out.println("¿Es modificable? " + arma.esModificable());
        System.out.println("Rareza: " + arma.getRareza());
        System.out.println("Munición: " + arma.getMunicion());

    }
}
