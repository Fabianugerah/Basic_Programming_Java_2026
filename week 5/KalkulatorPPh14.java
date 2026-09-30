import java.util.Scanner;

public class KalkulatorPPh14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan PKP (Penghasilan Kena Pajak): ");
        double pkp = sc.nextDouble();

        double pajak;

        double batas1 = 60000000;
        double batas2 = 250000000;
        double batas3 = 500000000;

        double pajakLapisan1 = 0.05 * batas1;
        double pajakLapisan2 = pajakLapisan1 + 0.15 * (batas2 - batas1);
        double pajakLapisan3 = pajakLapisan2 + 0.25 * (batas3 - batas2);

        if (pkp <= 0) {
            pajak = 0;
        } else if (pkp <= batas1) {
            pajak = 0.05 * pkp;
        } else if (pkp <= batas2) {
            pajak = pajakLapisan1 + 0.15 * (pkp - batas1);
        } else if (pkp <= batas3) {
            pajak = pajakLapisan2 + 0.25 * (pkp - batas2);
        } else {
            pajak = pajakLapisan3 + 0.30 * (pkp - batas3);
        }

        System.out.println("PPh 21 Tahunan: Rp " + pajak);

        sc.close();
    }
}