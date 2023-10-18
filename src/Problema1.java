import java.util.Arrays;

public class Problema1 {
    // Cerinta 1
    public static int[] noteMaiMiciDecat40(int[] note) {
        int cnt = 0;
        int[] listaNoteProaste = new int[note.length];
        for (int i = 0; i < note.length; i++) {
            if (note[i] < 40 && note[i] >= 1 && note[i] <= 100) {
                listaNoteProaste[cnt] = note[i];
                cnt++;
            }
        }
        return Arrays.copyOf(listaNoteProaste, cnt);
    }

    // Cerinta 2
    public static double mediaNotelor(int[] note) {
        int s = 0;
        if (note.length == 0) {
            return 0.000;
        }
        for (int i = 0; i < note.length; i++) {
            int n = note[i];
            {
                if (n >= 0 && n <=100)
                    s += n;
            }}
        return (double) s / note.length;
    }

    // Cerinta 3
    public static int[] noteleRotunjite(int[] note) {
        int[] noteRotunjite = new int[note.length];
        for (int i = 0; i < note.length; i++) {
            if (note[i] >= 0 && note[i] <= 100) {
                if (note[i] < 38) {
                    noteRotunjite[i] = note[i];
                } else {
                    int urmMultDe5 = ((note[i] + 4) / 5) * 5;
                    if (urmMultDe5 - note[i] < 3) {
                        noteRotunjite[i] = urmMultDe5;
                    } else {
                        noteRotunjite[i] = note[i];
                    }
                }
            } else {
                noteRotunjite[i] = -1;
            }
        }
        return noteRotunjite;
    }
}