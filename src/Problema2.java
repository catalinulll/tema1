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
    }}
