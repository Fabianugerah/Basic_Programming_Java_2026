import java.util.Scanner;

public class Triangle14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
 
        // Segitiga bertingkat (sudah diperbaiki)
        int i = 1;                      // perbaikan: mulai dari 1, bukan 0
        while (i <= n) {                // berjalan tepat n kali
            int j = 0;                  // di-reset setiap baris
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();       // perbaikan: pindah baris
            i++;
        }
 
        // Segitiga terbalik
        i = n;                          // tanpa "int", i sudah dideklarasikan
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}
