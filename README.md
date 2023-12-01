# UD04PooT01
## Reto 105
No me lo aceptaron hice bastantes pruebas y no logro encontrar por qué no me lo aceptan cuando he probado todos los casos que se me ocurren y lo muestra tal y como quiere.
## Reto 664
## Ejercicios Tarea 3
### 1.Sin usar el IntelliJ, intenta contestar a la siguiente pregunta. ¿Cuál es la salida del siguiente programa? ¿Por qué?
Primer valor de la variable local: 7, luego imprimer Valor del parametro: 7, y luego imprime Segundo valor de la variable local: 7. siempre nos basamos en la variable var con valor 7 y esta no se modifica en ningún momento.

### 2.Si cambiamos ligeramente el programa anterior. De forma que, el método invocado print () realiza un cambio en su copia del valor en su parámetro formal x.
Primer valor de la variable local: 7, luego imprime Valor del parametro: 7, luego imrprime Valor del parametro: 100 y luego imprime Segundo valor de la variable local: 7
Sigue imprimiendo 7 en el main porque la variable local no se modifica en ningún momento.

### 3.Si volvemos a modificar el código anterior por el siguiente código.
Primer valor de la variable resultado 0, luego imprime Valor del parametro: 7, luego imrprime Valor del parametro: 100 y luego imprime Siguiente valor de la variable resultado: 100.
Hemos obtenido el valor 100 en la variable resultado porque la hemos almacenado.

### 4.Sin usar el IntelliJ, ¿qué imprime el siguiente código?
x: 1 y: 2, luego imprime x: 45 y: 83 y luego vuelve a imprimir x: 45 y: 83 ,se cambia porque el segundo metodo lo que hace es usar y modificar las variables del primer metodo

### 5.Explica la diferencia entre cada uno de los siguientes pares de conceptos.
A. Una variable de instancia y una variable local.
Una variable local es una que tiene ocupación en el programa principal por así decirlo, y una de instancia es una que se crea en un objeto y tiene uso en este objeto o metodo externo al local.

B. Getter y setter
Los setters son para asignar valor a un parametro de un objeto y los getter para devolver ese valor.

C. Crear una instancia y variable de instancia.
Una instancia es un lugar ocupado por decirlo de alguna manera por un objeto y una variable de instancia es una variable que puede ocupar un lugar volátil como puede ser dentro de uno de estos objetos.

D. Paso por valor y paso por referencia.
Paso por referencia es cuanto apuntamos a un metodo de un objeto o como su nombre indica a la referencia del metodo de un objeto, mientras que pasar por valor pasamos valores locales los cuales no acaban siendo modificados si no los asignamos bien dentro de metodos que esten fuera del bloque principal. 

### 6. Comprueba que imprime el siguiente código. ¿Por qué el valor de la variable data no cambia?
Imprime 50 dos veces, porque la variable data que cambia es la de dentro del metodo llamado que no afecta en nada a la variable data de fuera.

## Ejercicios Tarea 4
### 1. ¿Qué sucede cuando se compila y ejecuta el siguiente programa?
Muestra 1, luego 1 y luego 6, el único contador que se ha ido acumulando conforme se han ido creando nuevos objetos ha sido el static, los demás empiezan en 1.

### 2.¿Qué sucede cuando intenta compilar y ejecutar el siguiente programa? 
Primero muestra 16 ya que x * x con x valiendo 4 da 16, luego muestra x 16-y1
