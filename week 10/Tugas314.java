import java.util.Scanner;

public class Tugas314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
 
        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemuaBarang = 0;
            int barangTerbanyak = -1;   // -1 agar toko pertama pasti tercatat
            int tokoTerbanyak = 0;
 
            for (int toko = 1; toko <= jumlahToko; toko++) {
                int jumlahPelanggan;
                do {
                    System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);
 
                int totalBarangToko = 0;
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Barang yang dibeli pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }
 
                System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);
 
                totalSemuaBarang += totalBarangToko;
                if (totalBarangToko > barangTerbanyak) {    // ">" agar toko bernomor kecil menang saat seri
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }
 
            System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}
