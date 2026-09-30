import java.util.Scanner;

public class TugasAntrean14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode layanan (1-4): ");
        int kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Layanan: Legalisir Ijazah, Loket: A");
                break;
            case 2:
                System.out.println("Layanan: Surat Keterangan Aktif Kuliah, Loket: B");
                break;
            case 3:
                System.out.println("Layanan: Pembayaran UKT, Loket: C");
                break;
            case 4:
                System.out.println("Layanan: Pengajuan Cuti Akademik, Loket: D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }

        sc.close();
    }
}