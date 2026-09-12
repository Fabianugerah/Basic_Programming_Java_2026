import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga, uangMuka;
        int lamaCicilan;
        double bunga = 0.02;
        double sisaHarga, totalBunga, totalBayar, cicilanPerBulan;

        System.out.print("Masukkan harga laptop: Rp");
        harga = sc.nextDouble();

        System.out.print("Masukkan uang muka: Rp");
        uangMuka = sc.nextDouble();

        System.out.print("Masukkan lama cicilan (bulan): ");
        lamaCicilan = sc.nextInt();

        sisaHarga = harga - uangMuka;
        totalBunga = bunga * sisaHarga * lamaCicilan;
        totalBayar = sisaHarga + totalBunga;
        cicilanPerBulan = totalBayar / lamaCicilan;

        System.out.println("Cicilan yang harus dibayar Rina setiap bulan adalah Rp" + cicilanPerBulan);

        sc.close();
    }
}
