public class Suma10000aContadorSincronizado extends Thread{

    private ContadorSincronizado cuenta;

    public Suma10000aContadorSincronizado(ContadorSincronizado cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            cuenta.suma1();
        }
    }

}
