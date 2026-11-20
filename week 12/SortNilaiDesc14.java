import java.util.Arrays;

public class SortNilaiDesc14 {
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};

        System.out.println("Mengurutkan dari nilai terkecil ke terbesar: " + Arrays.toString(nilai));

        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] < nilai[j + 1]) {   // tanda dibalik dari > menjadi <
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("Mengurutkan dari nilai terbesar ke terkecil: " + Arrays.toString(nilai));
    }
}