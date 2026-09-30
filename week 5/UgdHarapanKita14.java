import java.util.Scanner;

public class UgdHarapanKita14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saturasi Oksigen / SpO2 (%): ");
        double spo2 = sc.nextDouble();

        System.out.print("Sisa bed ICU: ");
        int sisaBedICU = sc.nextInt();

        System.out.print("Tekanan darah sistolik (mmHg): ");
        double sistolik = sc.nextDouble();

        System.out.print("Kondisi sadar penuh? (true/false): ");
        boolean sadarPenuh = sc.nextBoolean();

        System.out.print("Suhu tubuh (Celcius): ");
        double suhuTubuh = sc.nextDouble();

        System.out.print("Ada riwayat komorbid? (true/false): ");
        boolean riwayatKomorbid = sc.nextBoolean();

        System.out.print("Usia (tahun): ");
        int usia = sc.nextInt();

        System.out.print("Laju napas (x/menit): ");
        int lajuNapas = sc.nextInt();

        String ruang;

        if (spo2 < 85 && sisaBedICU > 0) {
            ruang = "ICU";
        } else if (spo2 < 85 && sisaBedICU == 0) {
            ruang = "UGD_VENTILATOR_MOBIL";
        } else if ((spo2 >= 85 && spo2 <= 89)
                || (sistolik < 90 || sistolik > 180)
                || !sadarPenuh) {
            ruang = "RESUSITASI_UGD";
        } else if (((spo2 >= 90 && spo2 <= 94) || suhuTubuh > 39)
                && riwayatKomorbid
                && usia >= 65) {
            ruang = "HCU_ISOLASI";
        } else if ((spo2 >= 90 && spo2 <= 94) || lajuNapas > 24) {
            ruang = "RAWAT_INAP_UMUM";
        } else {
            ruang = "OBSERVASI_UMUM";
        }

        System.out.println("Ruang Perawatan: " + ruang);

        sc.close();
    }
}