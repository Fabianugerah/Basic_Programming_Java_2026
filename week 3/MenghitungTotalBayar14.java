import java.util.Scanner;

public class MenghitungTotalBayar14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ganti menjadi double
        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        // Ganti menjadi nextDouble()
        harga = sc.nextDouble();

        
        potongan = diskon * harga;
        jml_bayar = harga - potongan;
        

        System.out.println("Jumlah yang harus anda bayar adalah Rp" + jml_bayar);

        sc.close();
    }
}
