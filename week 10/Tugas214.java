import java.util.Scanner;

public class Tugas214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
 
        if (n < 3) {
            System.out.println("n harus minimal 3.");
        } else {
            int jumlah = 0;
            for (int i = 1; i <= n; i++) {          // nomor baris
                for (int j = 1; j <= n; j++) {      // nomor kolom
                    int hasil = i * j;
                    System.out.printf("%4d", hasil);
                    jumlah += hasil;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka: " + jumlah);
        }
        sc.close();
    }
}
