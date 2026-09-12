import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahLembar;
        int biayaPerLembar = 500;
        int biayaJilid = 5000;
        int biayaCetak, totalBiaya;

        System.out.print("Masukkan jumlah lembar: ");
        jumlahLembar = sc.nextInt();

        biayaCetak = jumlahLembar * biayaPerLembar;
        totalBiaya = biayaCetak + biayaJilid;

        System.out.println("Total biaya yang harus dibayar adalah Rp" + totalBiaya);

        sc.close();
    }
}
