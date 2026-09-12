import java.util.Scanner;

public class Bank14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.print("Masukkan jumlah tabungan awal anda: Rp");
        jml_tabungan_awal = input.nextInt();
        System.out.print("Masukkan lama menabung anda (dalam tahun): ");
        lama_menabung = input.nextInt();

        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = jml_tabungan_awal + bunga;

        System.out.println("Keuntungan bunga anda adalah Rp" + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah: Rp" + jml_tabungan_akhir);

        input.close();
    }
}
