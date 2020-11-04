public class ContSinc {
    private int cuenta;

    public ContSinc() {
        this.cuenta = 0;
    }

    public int getCuenta() {
        return cuenta;
    }

    public synchronized void suma1() {
        cuenta++;
    }
}
