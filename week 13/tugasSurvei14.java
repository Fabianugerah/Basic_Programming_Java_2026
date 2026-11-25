import java.util.Scanner;

public class tugasSurvei14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                int jawaban;
                do {
                    System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = sc.nextInt();
                    if (jawaban < 1 || jawaban > 5) {
                        System.out.println("Jawaban tidak valid. Masukkan angka 1 sampai 5!");
                    }
                } while (jawaban < 1 || jawaban > 5);

                survei[i][j] = jawaban;
            }
        }

        System.out.println("\n========================================");
        System.out.println("Rata-rata nilai setiap responden:");
        double totalSemua = 0;

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            double totalPerResponden = 0;

            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalPerResponden += survei[i][j];
            }

            totalSemua += totalPerResponden;
            System.out.printf("Responden %d: %.2f%n", (i + 1), totalPerResponden / JUMLAH_PERTANYAAN);
        }

        System.out.println("\n========================================");
        System.out.println("Rata-rata nilai setiap pertanyaan:");

        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double totalPerPertanyaan = 0;

            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                totalPerPertanyaan += survei[i][j];
            }

            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), totalPerPertanyaan / JUMLAH_RESPONDEN);
        }

        System.out.println("\n========================================");
        System.out.printf("Rata-rata keseluruhan: %.2f%n", totalSemua / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN));

        sc.close();
    }
}