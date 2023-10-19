public class P3_teste {
    public static void main(String[] args) {
        testSuma();
        testGresitSuma();
        testDiferenta();
        testGresitDiferenta();
        testInmultire();
        testGresitInmultire();
        testImpartire();
        testGresitImpartire();
    }

    public static void testSuma() {
        int[] x = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] y = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        Problema3 problema = new Problema3(x, y);
        int[] rezultatAsteptat = {9, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultat = problema.suma();
        assert java.util.Arrays.equals(rezultat, rezultatAsteptat);
    }

    public static void testDiferenta() {
        int[] x = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] y = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        Problema3 problema = new Problema3(x, y);
        int[] rezultatAsteptat = {2, 9, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultat = problema.diferenta();
        assert java.util.Arrays.equals(rezultat, rezultatAsteptat);
    }

    public static void testInmultire() {
        int[] x = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int c = 2;
        Problema3 problema = new Problema3(x, new int[x.length]);
        int[] rezultatAsteptat = {4, 7, 2, 0, 0, 0, 0, 0, 0};
        int[] rezultat = problema.inmultire(c);
        assert java.util.Arrays.equals(rezultat, rezultatAsteptat);
    }

    public static void testImpartire() {
        int[] x = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int c = 2;
        int[] y = {1, 1, 8, 0, 0, 0, 0, 0, 0};
        Problema3 problema = new Problema3(x, y);
        int[] rezultatAsteptat = {1, 1, 3, 0, 0, 0, 0, 0, 0};
        int[] rezultat = problema.impartire(c);
        assert java.util.Arrays.equals(rezultat, rezultatAsteptat);
    }

    public static void testGresitSuma() {
        int[] x = {1, 2, 3};
        int[] y = {4, 5, 6, 7};
        Problema3 problema = new Problema3(x, y);
        try {
            int[] rezultat = problema.suma();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void testGresitDiferenta() {
        int[] x = {5, 3, 1};
        int[] y = {6, 7};
        Problema3 problema = new Problema3(x, y);
        try {
            int[] rezultat = problema.diferenta();
            // Acesta ar trebui să genereze o eroare sau excepție pentru că numerele nu au aceeași lungime
        } catch (Exception e) {
            // Testul trece dacă o eroare sau excepție este aruncată corect
        }
    }

    public static void testGresitInmultire() {
        int[] x = {1, 2, 3};
        int c = -1;
        Problema3 problema = new Problema3(x, x);
        try {
            int[] rezultat = problema.inmultire(c);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void testGresitImpartire() {
        int[] x = {1, 2, 3};
        int c = 0;
        Problema3 problema = new Problema3(x, x);
        try {
            int[] rezultat = problema.impartire(c);
        } catch (Exception e){
            System.out.println("Exception");
        }
    }

}