import java.util.Scanner;

public class operatorLogikaWifi14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunBlokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunBlokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunBlokir) {
            System.out.println("Akses Wifi diberikan");
        } else {
            System.out.println("Akses Wifi ditolak");
        }

        sc.close();
    }
}
