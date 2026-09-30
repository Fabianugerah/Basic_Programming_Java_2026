// NAMA : FABIANUGERAH BAINASSHIDDIQ
// NIM : 264107020026
// KELAS : TI - 1D

import java.util.Scanner;

public class quiz14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel data Driver 
        double tarifDasar, jarakDriver, biayaBahanBakar, resikoKeterlambatan;
        int jumlahTransaksiDriver;

        // Deklarasi variabel data Merchant 
        double hargaJualMakanan, biayaMakanan, resikoKerusakanBarang;
        int jumlahTransaksiMerchant;

        // Deklarasi variabel data umum 
        double komisiPerusahaan;

        // INPUT DATA DRIVER 
        System.out.println("=== INPUT DATA DRIVER ===");
        System.out.print("Tarif dasar (Rp/km) : ");
        tarifDasar = sc.nextDouble();
        System.out.print("Jarak perjalanan (km) : ");
        jarakDriver = sc.nextDouble();
        System.out.print("Biaya bahan bakar (Rp/km) : ");
        biayaBahanBakar = sc.nextDouble();
        System.out.print("Resiko keterlambatan (%) : ");
        resikoKeterlambatan = sc.nextDouble();
        System.out.print("Jumlah transaksi driver : ");
        jumlahTransaksiDriver = sc.nextInt();

        // INPUT DATA MERCHANT 
        System.out.println("\n=== INPUT DATA MERCHANT ===");
        System.out.print("Harga jual makanan (Rp) : ");
        hargaJualMakanan = sc.nextDouble();
        System.out.print("Biaya makanan (Rp) : ");
        biayaMakanan = sc.nextDouble();
        System.out.print("Resiko kerusakan barang (%) : ");
        resikoKerusakanBarang = sc.nextDouble();
        System.out.print("Jumlah transaksi merchant : ");
        jumlahTransaksiMerchant = sc.nextInt();

        // INPUT DATA UMUM 
        System.out.println("\n=== INPUT DATA UMUM ===");
        System.out.print("Komisi perusahaan (%) : ");
        komisiPerusahaan = sc.nextDouble();

        // Keuntungan Driver
        double keuntunganDriver = (tarifDasar * jarakDriver - biayaBahanBakar * jarakDriver) * (1 - komisiPerusahaan / 100) * (1 - resikoKeterlambatan / 100) * jumlahTransaksiDriver;

        // Keuntungan Merchant
        double keuntunganMerchant = (hargaJualMakanan - biayaMakanan) * (1 - komisiPerusahaan / 100) * (1 - resikoKerusakanBarang / 100) * jumlahTransaksiMerchant;

        // Total keuntungan gabungan dari kedua mitra
        double totalKeuntungan = keuntunganDriver + keuntunganMerchant;

        // Total transaksi dari kedua mitra (untuk menghitung rata-rata)
        int totalTransaksi = jumlahTransaksiDriver + jumlahTransaksiMerchant;

        // Rata-rata keuntungan per transaksi (total keuntungan dibagi total transaksi)
        double rataRataKeuntungan = totalKeuntungan / totalTransaksi;

        // Persentase kontribusi masing-masing mitra terhadap total keuntungan
        double persenDriver = (keuntunganDriver / totalKeuntungan) * 100;
        double persenMerchant = (keuntunganMerchant / totalKeuntungan) * 100;

        // OUTPUT HASIL 
        System.out.println("Keuntungan Driver : Rp. " + keuntunganDriver);
        System.out.println("Keuntungan Merchant : Rp. " + keuntunganMerchant);
        System.out.println("Total Keuntungan : Rp. " + totalKeuntungan);
        System.out.println("Rata-rata Keuntungan : Rp. " + rataRataKeuntungan + " / transaksi");
        System.out.println("Kontribusi Driver : " + persenDriver + " %");
        System.out.println("Kontribusi Merchant : " + persenMerchant + " %");

        sc.close();
    }
}
