public class P2_teste {
    public static void main(String[] args) {
        testNrMaxim();
        testGresitNrMaxim();
        testNrMinim();
        testGresitNrMinim();
        testSumaFaraCelMaiMicNumar();
        testGresitSumaFaraCelMaiMicNumar();
        testSumaFaraCelMaiMareNumar();
        testGresitSumaFaraCelMaiMareNumar();
    }

    public static void testNrMaxim() {
        int[] numere = {45, 37, 50, 22, 60, 30};
        Problema2 problema = new Problema2(numere);
        int nrMaxAsteptat = 60;
        int rezultat = problema.nrMaxim();
        assert rezultat == nrMaxAsteptat;
    }

    public static void testNrMinim() {
        int[] numere = {45, 37, 50, 22, 60, 30};
        Problema2 problema = new Problema2(numere);
        int nrMinAsteptat = 22;
        int rezultat = problema.nrMinim();
        assert rezultat == nrMinAsteptat;
    }

    public static void testSumaFaraCelMaiMicNumar() {
        int[] numere = {45, 37, 50, 22, 60, 30};
        Problema2 problema = new Problema2(numere);
        int sumaAsteptata = 213;
        int rezultat = problema.sumaFaraCelMaiMicNumar();
        assert rezultat == sumaAsteptata;
    }

    public static void testSumaFaraCelMaiMareNumar() {
        int[] numere = {45, 37, 50, 22, 60, 30};
        Problema2 problema = new Problema2(numere);
        int sumaAsteptata = 207;
        int rezultat = problema.sumaFaraCelMaiMareNumar();
        assert rezultat == sumaAsteptata;
    }

    public static void testGresitNrMaxim() {
        int[] numere = {};
        Problema2 problema = new Problema2(numere);
        int nrMaxAsteptat = -1;
        int rezultat = problema.nrMaxim();
        assert rezultat == nrMaxAsteptat;
    }

    public static void testGresitNrMinim() {
        int[] numere = {};
        Problema2 problema = new Problema2(numere);
        int nrMinAsteptat = -1;
        int rezultat = problema.nrMinim();
        assert rezultat == nrMinAsteptat;
    }

    public static void testGresitSumaFaraCelMaiMicNumar() {
        int[] numere = {};
        Problema2 problema = new Problema2(numere);
        int sumaAsteptata = -1;
        int rezultat = problema.sumaFaraCelMaiMicNumar();
        assert rezultat == sumaAsteptata;
    }

    public static void testGresitSumaFaraCelMaiMareNumar() {
        int[] numere = {};
        Problema2 problema = new Problema2(numere);
        int sumaAsteptata = -1;
        int rezultat = problema.sumaFaraCelMaiMareNumar();
        assert rezultat == sumaAsteptata;
    }

}