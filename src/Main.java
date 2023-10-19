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

        int[] x = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] y = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        Problema3 problema3 = new Problema3(x, y);
        int[] sumaCalculata = problema3.suma();
        int[] diferentaCalculata = problema3.diferenta();
        int[] inmultireCalculata = problema3.inmultire(2);
        int[] impartireCalculata = problema3.impartire(2);
        System.out.println("\t\t\t\t~Problema 3~");
        System.out.println("~ Cerinta 1 (Suma): " + Arrays.toString(sumaCalculata));
        System.out.println("~ Cerinta 2 (Diferenta): " + Arrays.toString(diferentaCalculata));
        System.out.println("~ Cerinta 3 (Inmultire): " + Arrays.toString(inmultireCalculata));
        System.out.println("~ Cerinta 4 (Impartire): " + Arrays.toString(impartireCalculata));
        System.out.println("\n");

        // Problema 4

        int[] pretT = {40, 35, 70, 15, 45};
        int[] pretUSB = {20, 25, 40, 15};
        int buget = 60;
        System.out.println("\t\t\t~Problema 4~");
        System.out.println("~ Cerinta 1 (Cmi tastatura): " + Problema4.ceaMaiIeftinaTastatura(pretT));
        System.out.println("~ Cerinta 2 (Cms obiect): " + Problema4.celMaiScumpObiect(pretT, pretUSB));
        System.out.println("~ Cerinta 3 (Cms USB care intra in buget): " + Problema4.ceaMaiScumpaUnitateUSB(pretUSB, buget));
        System.out.println("~ Cerinta 4 (Buget si preturi): " + Problema4.buget(buget, pretT, pretUSB));
    }
}

