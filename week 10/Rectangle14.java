import java.util.Scanner;

public class Rectangle14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();
 
        for (int i = 1; i <= baris; i++) {          // outer loop: baris
            for (int j = 1; j <= kolom; j++) {      // inner loop: kolom
                System.out.print("#");              // Pertanyaan 5: karakter diganti #
            }
            System.out.println();                   // pindah baris
        }
        sc.close();
    }
}
