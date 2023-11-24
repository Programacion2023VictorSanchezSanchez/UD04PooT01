package tarea2constructores;

import java.util.Scanner;

public class Reto105 {
    public static void main(String[] args) {
        double num = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las ventas de esta semana o -1 para salir");

        //Bucle que se ejecuta mientras el numero introducido no sea -1
        while ((num = sc.nextDouble()) != -1) {
            //Inicializamos las variables al numero introducido
            double mayor = num;
            double menor = num;
            double suma = num;

            //Inicializamos las variables en 0
            int indiceMayor = 0;
            int indiceMenor = 0;

            //Inicializamos las variables en false
            boolean esMayor = false;
            boolean esMenor = false;


            //Bucle que almacena las ventas de la semana
            for (int i = 1; i <= 5; i++) {
                num = sc.nextDouble();
                suma += num;
                if (num == mayor) {
                    esMayor = true;
                } else if (num > mayor) {
                    mayor = num;
                    indiceMayor = i;
                    esMayor = false;
                } else if (num == menor) {
                    esMenor = true;
                } else if (num < menor) {
                    menor = num;
                    indiceMenor = i;
                    esMenor = false;
                }
            }

            //Mostramos resultado si ambos son falsos, si alguno de los 2 es true mostramos empate
            if (!esMayor && !esMenor) {
                System.out.println(selectorDia(indiceMayor) + " " + selectorDia(indiceMenor) + " " + (suma / 6 < num ? "SI" : "NO"));

            } else {
                System.out.println("EMPATE");
            }

        }
        sc.close();
    }

    /**
     * Metodo con switch que selecciona el dia
     * @param i el indice que estamos almacenando
     * @return dia de la semana
     */
    private static String selectorDia(int i){
        String dia = "";
        switch (i){
            case 0:
                dia = "MARTES";
                break;
            case 1:
                dia = "MIERCOLES";
                break;
            case 2:
                dia = "JUEVES";
                break;
            case 3:
                dia = "VIERNES";
                break;
            case 4:
                dia = "SABADO";
                break;
            default:
                dia = "DOMINGO";
                break;
        }
        return dia;
    }
}

