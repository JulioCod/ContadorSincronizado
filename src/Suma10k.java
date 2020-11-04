public class Suma10k extends Thread{

    private Contador cuenta;

    public Suma10k(Contador cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            cuenta.suma1();
        }
    }

}
