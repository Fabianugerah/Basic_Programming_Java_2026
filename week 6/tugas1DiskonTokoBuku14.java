import java.util.Scanner;

public class tugas1DiskonTokoBuku14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diskon = 0;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenis = sc.nextLine().trim();
        System.out.print("Masukkan jumlah buku: ");
        int jumlah = sc.nextInt();
        System.out.print("Masukkan harga per buku: Rp");
        double harga = sc.nextDouble();

        if (jenis.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jumlah > 2) {
                diskon += 2;
            }
        } else if (jenis.equalsIgnoreCase("novel")){
            diskon = 7;
            if (jumlah > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            if (jumlah > 3) {
                diskon = 5;
            }
        }

        double totalAwal = harga * jumlah;
        double jumlahDiskon = totalAwal * diskon / 100;
        double totalBayar = totalAwal - jumlahDiskon;

        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Jumlah Diskon : Rp" + jumlahDiskon);
        System.out.println("Total Bayar : Rp" + totalBayar);

        sc.close();
    }
}