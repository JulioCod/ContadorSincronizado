public class Suma10kContSinc extends Thread{

    private ContSinc cuenta;

    public Suma10kContSinc(ContSinc cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            cuenta.suma1();
        }
    }

}
