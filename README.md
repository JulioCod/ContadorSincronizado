# Contador sincronizado
Intentado explicarme a mi mismo como funciona synchronized en java
## Explicación
Se crea una clase Contador.
 
Esa clase solo tiene un contador y un método para sumarle 1.

Se crea una clase para hacer hilo que sumen 10.000 contador que se le pase usando el metodo suma1 10.000 veces.

Si instanciamos esa clase dos veces debería de sumar 10.000 al contador.

No da resultados consistentes porque los dos hilos acceden a la vez y se "molestan" el uno al otro.

La solución hacer que el método para sumar 1 sea sincronizado y así evitar que dos hilos accedan al mimo tiempo.

Ejecutando el programa varias veces se puede ver como la primera implementación varía en el resultado mientras que la segunda es consistente.

## Ejemplos de resultados.

1. Ejecución
    - Resultado con el contador normal: 12422
    - Resultado con el contador sincronizado: 20000

2. Ejecución
    - Resultado con el contador normal: 11978
    - Resultado con el contador sincronizado: 20000

3. Ejecución
    - Resultado con el contador normal: 20000
    - Resultado con el contador sincronizado: 20000

4. Ejecución

    - Resultado con el contador normal: 13560
    - Resultado con el contador sincronizado: 20000






