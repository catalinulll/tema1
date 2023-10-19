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

    // Cerinta 2
    // cms = cel mai scump
    public static int celMaiScumpObiect(int[] pretT, int[] pretUSB) {
        int cms = -1;

        if (pretT.length > 0) {
            int maxPretT = pretT[0];
            for (int val : pretT) {
                if (val > maxPretT) {
                    maxPretT = val;
                }
            }
            cms = maxPretT;
        }

        if (pretUSB.length > 0) {
            int maxPretUSB = pretUSB[0];
            for (int val : pretUSB) {
                if (val > maxPretUSB) {
                    maxPretUSB = val;
                }
            }

            if (maxPretUSB > cms) {
                cms = maxPretUSB;
            }
        }

        return cms;
    }
}
