package tarea4static;

import java.util.Scanner;

public class Reto664 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int carreteras = 1;
        int carriles;
        int resultado;
        int mayorAltura;

        while (carreteras != 0) {
            carreteras = scan.nextInt();

            resultado = Integer.MAX_VALUE;

            for (int i = 0; i < carreteras; i++) {
                int altura;
                carriles = scan.nextInt();

                altura = scan.nextInt();
                mayorAltura = altura;

                for (int j = 0; j < carriles-1; j++) {

                    altura = scan.nextInt();
                    if(altura > mayorAltura){
                        mayorAltura=altura;
                    }
                }
                //Si la altura máxima en esos carriles es menor que la registrada en otro bucle, asigno la respuesta a esta nueva altura
                if(mayorAltura < resultado){
                    resultado = mayorAltura;
                }
            }
            //Imprimo la respuesta si no ha puesto 0 carreteras
            if(carreteras != 0) {
                System.out.println(resultado);
            }
        }
    }
}