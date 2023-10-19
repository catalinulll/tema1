public class Problema3 {
    private int[] x;
    private int[] y;

    public Problema3(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }

    // Cerinta 1
    public int[] suma() {
        int s = 0;
        int n = x.length;
        int[] finall = new int[n];
        int ceRamane = 0;

        for (int i = n - 1; i >= 0; i--) {
            s = x[i] + y[i] + ceRamane;
            finall[i] = s % 10;
            ceRamane = s / 10;
        }

        if (ceRamane > 0) {
            int[] rez = new int[n + 1];
            rez[0] = ceRamane;
            System.arraycopy(finall, 0, rez, 1, n);
            return rez;
        }

        return finall;
    }

    // Cerinta 2
    public int[] diferenta() {
        int n = x.length;
        int[] finall = new int[n];
        int ceSeIa = 0;

        for (int i = n - 1; i >= 0; i--) {
            int d = x[i] - y[i] - ceSeIa;
            if (d < 0) {
                d += 10;
                ceSeIa = 1;
            } else {
                ceSeIa = 0;
            }
            finall[i] = d;
        }

        return finall;
    }
}
