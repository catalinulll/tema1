public class Problema2 {
    private int[] nr;

    public Problema2(int[] nr) {
        this.nr = nr;
    }

    // Cerinta 1
    public int nrMaxim() {
        int nrMax = nr[0];
        for (int i = 0; i < nr.length; i++) {
            int n = nr[i];
            if (n > nrMax) {
                nrMax = n;
            }
        }
        return nrMax;
    }

    // Cerinta 2
    public int nrMinim() {
        int nrMin = nr[0];
        for (int i = 0; i < nr.length; i++) {
            int n = nr[i];
            if (n < nrMin) {
                nrMin = n;
            }
        }
        return nrMin;
    }

    // Cerinta 3
    public int sumaFaraCelMaiMicNumar() {
        int s = 0;
        int nrMin = nr[0];
        for (int i = 0; i < nr.length; i++) {
            int n = nr[i];
            s += n;
            if (n < nrMin) {
                nrMin = n;
            }
        }
        return s - nrMin;
    }

    // Cerinta 4
    public int sumaFaraCelMaiMareNumar() {
        int s = 0;
        int nrMax = nr[0];
        for (int i = 0; i < nr.length; i++) {
            int n = nr[i];
            s += n;
            if (n > nrMax) {
                nrMax = n;
            }
        }
        return s - nrMax;
    }
}
