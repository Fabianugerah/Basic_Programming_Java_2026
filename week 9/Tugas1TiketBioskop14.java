import java.util.Scanner;

public class Tugas1TiketBioskop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0;
        double totalHarga, diskon, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan jumlah tiket yang valid!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }

            diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 15;
            } else if (jumlahTiket > 4) {
                diskon = 10;
            }

            totalHarga = jumlahTiket * hargaTiket * (100 - diskon) / 100;
            System.out.println("Diskon: " + diskon + "%");
            System.out.println("Total bayar: Rp " + (totalHarga));

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);

        sc.close();
    }
}