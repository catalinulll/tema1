import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Problema 1

        int[] note = {13, 5, 39, 41, 89, 63, 58, 103, -1, -2, 0};
        System.out.println("\t\t\t~Problema 1~");
        System.out.println("~ Cerinta 1 (Notele sub 40): " + Arrays.toString(Problema1.noteMaiMiciDecat40(note)));
        System.out.println("~ Cerinta 2 (Media notelor): " + Problema1.mediaNotelor(note));
        System.out.println("~ Cerinta 3 (Notele rotunjite): " + Arrays.toString(Problema1.noteleRotunjite(note)));
        System.out.println("~ Cerinta 4 (Cea mai mare nota rotunjita): " + Problema1.ceaMaiMareNotaRotunjita(note));
        System.out.println("\n");

        // Problema 2

        int[] nr = {-1, -89, 45, 1, 117, 35, 0};
        Problema2 problema2 = new Problema2(nr);
        System.out.println("\t\t\t~Problema 2~");
        System.out.println("~ Cerinta 1 (Numarul cel mai mare): " + problema2.nrMaxim());
        System.out.println("~ Cerinta 2 (Numarul cel mai mic): " + problema2.nrMinim());
        System.out.println("~ Cerinta 3 (Suma fara cel mai mic nr): " + problema2.sumaFaraCelMaiMicNumar());
        System.out.println("~ Cerinta 4 (Suma fara cel mai mare nr): " + problema2.sumaFaraCelMaiMareNumar());
        System.out.println("\n");
    }
}

