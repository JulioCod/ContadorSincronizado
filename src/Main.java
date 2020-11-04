public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*En este bloque no se va a sincronizar
        creamos un objeto contador se usará por  dos hilos
        */
        Contador contador = new Contador();
        //Cada hilo se va a sumar 10.000
        Suma10k suma10k_1 = new Suma10k(contador);
        Suma10k suma10k_2 = new Suma10k(contador);
        //iniciamos los hilos
        suma10k_1.start();
        suma10k_2.start();
        //Hacemos join() para que la última linea espere a que terminen
        suma10k_1.join();
        suma10k_2.join();
        /*Debería de dar 20.000 pero a veces los dos hilos intentan escribir a la vez
        * en el objeto o uno lee mientras el otro efectua varias operaciones
        * Esto hace que los resultados sean inconsistentes.*/
        System.out.println("Resultado con el contador normal: " + contador.getCuenta());



        /*ahora vamos a usar metodos sincronizados
        * El ContadorSincronizado tiene el metodo suma1 sincronizado
        * lo que hace que cuando se una ponga una bandera y nadie pueda usarlo
        * hasta que se libere. Suma10000Sincronizado crea un hilo usando ese
        * metodo sincornizado.*/
        ContSinc contSinc = new ContSinc();
        Suma10kContSinc suma10kSinc_1 = new Suma10kContSinc(contSinc);
        Suma10kContSinc suma10kSinc_2 = new Suma10kContSinc(contSinc);
        suma10kSinc_1.start();
        suma10kSinc_2.start();
        suma10kSinc_1.join();
        suma10kSinc_2.join();
        System.out.println("Resultado con el contador sincronizado: " + contSinc.getCuenta());

    }

}
