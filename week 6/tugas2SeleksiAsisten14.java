import java.util.Scanner;

public class tugas2SeleksiAsisten14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean aktif = sc.nextBoolean();
        System.out.print("Apakah sedang mendapat sanksi akademik? (true/false): ");
        boolean sanksi = sc.nextBoolean();
        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        int nilaiDasPro = sc.nextInt();
        System.out.print("Apakah punya sertifikat kompetensi pemrogramman? (true/false): ");
        boolean sertifikat = sc.nextBoolean();

        if (aktif && !sanksi) {
            if (nilaiDasPro >= 80 || sertifikat) {
                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat! Anda diterima sebagai asisten praktikum");
                } else {
                    System.out.println("Gagal! Nilai wawancara kurang dari 75");
                }
            } else {
                System.out.println("Gagal! Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat");
            }
        } else {
            System.out.println("Gagal! Mahasiswa tidak aktif atau sedang mendapatkan sanksi akademik");
        }

        sc.close();
    }
}
