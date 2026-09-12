import java.util.Scanner;

public class studikasus2_14 {
    public static void main(String[] args) {
        // PROGRAM INPUT STATIS
        // double lebar = 30;
        // double panjang = 100;
        // double diameterKolam = 5;
        // double sisiTaman = 2;
        // double pi = 3.14;
        // Batas Komentar ============================================================

        // PROGRAM INPUT DINAMIS
        Scanner sc = new Scanner(System.in);

        double lebar, panjang, diameterKolam, sisiTaman;
        double pi = 3.14;

        System.out.print("Masukkan lebar tanah (m): ");
        lebar = sc.nextDouble();
        System.out.print("Masukkan panjang tanah (m): ");
        panjang = sc.nextDouble();
        System.out.print("Masukkan diameter kolam (m): ");
        diameterKolam = sc.nextDouble();
        System.out.print("Masukkan sisi taman bunga (m): ");
        sisiTaman = sc.nextDouble();
        // Batas Komentar ============================================================

        double luasTanah = panjang * lebar;
 
        double jariJari = diameterKolam / 2;
        double luasKolam = pi * jariJari * jariJari;
 
        double luasTaman = sisiTaman * sisiTaman;
 
        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;
        

        System.out.println("====== Perhitungan Luas Tanah ======");
        System.out.println("Luas tanah             : " + luasTanah + " m2");
        System.out.println("Luas kolam (lingkaran) : " + luasKolam + " m2");
        System.out.println("Luas taman (persegi)   : " + luasTaman + " m2");
        System.out.println("Luas tidak digunakan   : " + luasTidakDigunakan + " m2");
        System.out.println("====================================");

        // KODE UNTUK INPUT DINAMIS
        sc.close();
    }
}
