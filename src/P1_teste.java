import java.util.Arrays;


public class P1_teste {
    public static void main(String[] args) {
        testNoteMaiMiciDecat40();
        testGresitNoteMaiMiciDecat40();
        testMediaNotelor();
        testGresitMediaNotelor();
        testNoteleRotunjite();
        testGresitNoteleRotunjite();
        testCeaMaiMareNotaRotunjita();
        testGresitCeaMaiMareNotaRotunjita();
    }

    public static void testNoteMaiMiciDecat40() {
        int[] note = {45, 37, 50, 22, 60, 30};
        int[] noteProasteAsteptate = {37, 22, 30};
        int[] rezultat = Problema1.noteMaiMiciDecat40(note);
        assert Arrays.equals(rezultat, noteProasteAsteptate);
    }

    public static void testMediaNotelor() {
        int[] note = {45, 60, 75};
        double mediaAsteptata = 60.0;
        double rezultat = Problema1.mediaNotelor(note);
        assert Math.abs(rezultat - mediaAsteptata) < 1e-5;
    }

    public static void testNoteleRotunjite() {
        int[] note = {45, 37, 50, 22, 60, 30};
        int[] noteRotunjiteAsteptate = {45, 37, 50, 20, 60, 30};
        int[] rezultat = Problema1.noteleRotunjite(note);
        assert Arrays.equals(rezultat, noteRotunjiteAsteptate);
    }

    public static void testCeaMaiMareNotaRotunjita() {
        int[] note = {45, 37, 50, 22, 60, 30};
        int notaMaxAsteptata = 60;
        int rezultat = Problema1.ceaMaiMareNotaRotunjita(note);
        assert rezultat == notaMaxAsteptata;
    }

    public static void testGresitNoteMaiMiciDecat40() {
        int[] note = {45, 105, 120, 130, 0, -5};
        int[] noteProasteAsteptate = {0};
        int[] rezultat = Problema1.noteMaiMiciDecat40(note);
        assert Arrays.equals(rezultat, noteProasteAsteptate);
    }

    public static void testGresitMediaNotelor() {
        int[] note = {};
        double mediaAsteptata = 0.0;
        double rezultat = Problema1.mediaNotelor(note);
        assert Math.abs(rezultat - mediaAsteptata) < 1e-5;
    }

    public static void testGresitNoteleRotunjite() {
        int[] note = {45, 105, 120, 130, 0, -5};
        int[] noteRotunjiteAsteptate = {45, -1, -1, -1, 0, -1};
        int[] rezultat = Problema1.noteleRotunjite(note);
        assert Arrays.equals(rezultat, noteRotunjiteAsteptate);
    }

    public static void testGresitCeaMaiMareNotaRotunjita() {
        int[] note = {45, 105, 120, 130, 0, -5};
        int notaMaxAsteptata = 45;
        int rezultat = Problema1.ceaMaiMareNotaRotunjita(note);
        assert rezultat == notaMaxAsteptata;
    }

}