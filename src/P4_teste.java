public class P4_teste {
    public static void main(String[] args) {
        testCeaMaiIeftinaTastatura();
        testGresitCeaMaiIeftinaTastatura();
        testCelMaiScumpObiect();
        testGresitCelMaiScumpObiect();
        testCeaMaiScumpaUnitateUSB();
        testGresitCeaMaiScumpaUnitateUSB();
        testBuget();
        testGresitBuget();
    }

    public static void testCeaMaiIeftinaTastatura() {
        int[] pretT = {40, 35, 70, 15, 45};
        int rezultatAsteptat = 15;
        int rezultat = Problema4.ceaMaiIeftinaTastatura(pretT);
        assert rezultat == rezultatAsteptat;
    }

    public static void testCelMaiScumpObiect() {
        int[] pretT = {15, 20, 10, 35};
        int[] pretUSB = {20, 15, 40, 15};
        int rezultatAsteptat = 40;
        int rezultat = Problema4.celMaiScumpObiect(pretT, pretUSB);
        assert rezultat == rezultatAsteptat;
    }

    public static void testCeaMaiScumpaUnitateUSB() {
        int[] pretUSB = {15, 45, 20};
        int buget = 30;
        int rezultatAsteptat = 20;
        int rezultat = Problema4.ceaMaiScumpaUnitateUSB(pretUSB, buget);
        assert rezultat == rezultatAsteptat;
    }

    public static void testBuget() {
        int buget = 60;
        int[] pretT = {40, 50, 60};
        int[] pretUSB = {8, 12};
        int rezultatAsteptat = 58;
        int rezultat = Problema4.buget(buget, pretT, pretUSB);
        assert rezultat == rezultatAsteptat;
    }

    public static void testGresitCeaMaiIeftinaTastatura() {
        int[] pretT = {};
        int rezultat = Problema4.ceaMaiIeftinaTastatura(pretT);
        assert rezultat == -1;
    }

    public static void testGresitCelMaiScumpObiect() {
        int[] pretT = {};
        int[] pretUSB = {};
        int rezultat = Problema4.celMaiScumpObiect(pretT, pretUSB);
        assert rezultat == -1;
    }

    public static void testGresitCeaMaiScumpaUnitateUSB() {
        int[] pretUSB = {10, 30, 40, 50};
        int buget = 5;
        int rezultat = Problema4.ceaMaiScumpaUnitateUSB(pretUSB, buget);
        assert rezultat == -1;
    }

    public static void testGresitBuget() {
        int buget = 50;
        int[] pretT = {60, 70};
        int[] pretUSB = {30, 40};
        int rezultat = Problema4.buget(buget, pretT, pretUSB);
        assert rezultat == -1;
    }
}
