import java.util.Scanner;

// Pertanyaan 3 (Percobaan 1): prediksi + modifikasi bilangan ganjil
public class StarPertanyaan314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Kode soal: untuk n = 9 mencetak "2 4 6 8 "
        System.out.print("Bilangan genap: ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Modifikasi: bilangan ganjil positif <= n
        System.out.print("Bilangan ganjil: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}