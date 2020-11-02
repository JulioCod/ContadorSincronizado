public class ContadorSincronizado {
    private int cuenta;

    public ContadorSincronizado() {
        this.cuenta = 0;
    }

    public int getCuenta() {
        return cuenta;
    }

    public synchronized void suma1() {
        cuenta++;
    }
}
