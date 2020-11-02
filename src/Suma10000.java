public class Suma10000 extends Thread{

    private Contador cuenta;

    public Suma10000(Contador cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            cuenta.suma1();
        }
    }

}
