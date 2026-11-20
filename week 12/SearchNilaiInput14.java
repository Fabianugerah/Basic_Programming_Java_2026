import java.util.Arrays;
import java.util.Scanner;

public class SearchNilaiInput14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari (key): ");
        int key = input.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan: nilai " + key
                    + " tidak ada di dalam array " + Arrays.toString(nilai));
        }

        input.close();
    }
}