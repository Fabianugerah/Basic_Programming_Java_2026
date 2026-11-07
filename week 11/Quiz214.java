import java.util.Scanner;

public class Quiz214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = "Fabianugerah Bainasshiddiq";
        int noAbsen = 14;
        int k = noAbsen % 5;
        System.out.println("Nama : " + nama);
        System.out.println("Kode personal K = " + k);

        // Batas identitas

        System.out.print("Masukkan jumlah kurir: ");
        int jumlahKurir = sc.nextInt();

        int kurir = 1;
        int kurirTerbaik = 0;
        int ongkirTertinggi = -1;
        int jumlahPaketBesar = 0;

        while (kurir <= jumlahKurir) {
            System.out.println("Kurir " + kurir);
            System.out.print("Jumlah Paket: ");
            int jumlahPaket = sc.nextInt();

            int total = 0;

            for (int i = 1;i <= jumlahPaket;i++) {
                System.out.print("Berat paket " + i + " (kg): ");
                double berat = sc.nextDouble();

                int tarif;
                if (berat <= 1) {
                    tarif = 8000;
                } else if (berat <= 10) {
                    tarif = 20000;
                } else {
                    tarif = 40000;
                    jumlahPaketBesar++;
                }

                total = total + tarif + (k * 500);
            }

            double rata = 0;
            if (jumlahPaket > 0) {
                rata = (double) total / jumlahPaket;
            }

            System.out.printf("Total : %d | Rata per paket: %.2f%n", total, rata);

            if (total > ongkirTertinggi) {
                ongkirTertinggi = total;
                kurirTerbaik = kurir;
            }

            kurir++;            
        }

        if (ongkirTertinggi < 0) {
            ongkirTertinggi = 0;
        }

        System.out.println("=================================");
        System.out.println("Kurir Terbaik      : " + kurirTerbaik);
        System.out.println("Ongkir Tertinggi   : " + ongkirTertinggi);
        System.out.println("Jumlah Paket Besar : " + jumlahPaketBesar);

        sc.close();
    }
}
