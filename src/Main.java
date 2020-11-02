public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*En este bloque no se va a sincronizar
        creamos un objeto contador se usará por dos hilos
        */
        Contador contador = new Contador();
        //Cada hilo se va a sumar 10.000
        Suma10000 suma10000 = new Suma10000(contador);
        Suma10000 sumaOtros10000 = new Suma10000(contador);
        //iniciamos los hilos
        suma10000.start();
        sumaOtros10000.start();
        //Hacemos join() para que la última linea espere a que terminen
        suma10000.join();
        sumaOtros10000.join();
        /*Debería de dar 20.000 pero a veces los dos hilos intentan escribir a la vez
        * en el objeto o uno lee mientras el otro efectua varias operaciones
        * Esto hace que los resultados sean inconsistentes.*/
        System.out.println("Resultado con el contador normal: " + contador.getCuenta());



        /*ahora vamos a usar metodos sincronizados
        * El ContadorSincronizado tiene el metodo suma1 sincronizado
        * lo que hace que cuando se una ponga una bandera y nadie pueda usarlo
        * hasta que se libere. Suma10000Sincronizado crea un hilo usando ese
        * metodo sincornizado.*/
        ContadorSincronizado contadorSincronizado = new ContadorSincronizado();
        Suma10000aContadorSincronizado suma10000contador2 = new Suma10000aContadorSincronizado(contadorSincronizado);
        Suma10000aContadorSincronizado sumaOtros10000contador2 = new Suma10000aContadorSincronizado(contadorSincronizado);
        suma10000contador2.start();
        sumaOtros10000contador2.start();
        suma10000contador2.join();
        sumaOtros10000contador2.join();
        System.out.println("Resultado con el contador sincronizado: " + contadorSincronizado.getCuenta());

    }

}
