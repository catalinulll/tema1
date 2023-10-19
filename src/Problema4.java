public class Problema4 {
    // Cerinta 1
    // cmi = cea mai ieftina
    public static int ceaMaiIeftinaTastatura(int[] pretT) {
        if (pretT.length == 0) {
            return -1;
        }

        int cmi = pretT[0];
        for (int i = 0; i < pretT.length; i++) {
            int n = pretT[i];
            if (n < cmi) {
                cmi = n;
            }
        }

        return cmi;
    }
}
