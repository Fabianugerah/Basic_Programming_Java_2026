import java.util.Arrays;

public class ArrayBilangan14 {
    public static void main(String[] args) {
        int[] bil = new int[4];

        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));

        // Modifikasi Code Pertanyaan 2: inisialisasi langsung saat deklarasi
        System.out.println();
        System.out.println("Pertanyaan 2: inisialisasi saat deklarasi");
        int[] bilLangsung = {5, 13, -7, 17};
        System.out.println(Arrays.toString(bilLangsung));

        // Modifikasi Code Pertanyaan 3: tampilkan juga nilai dikali 2
        System.out.println();
        System.out.println("Pertanyaan 3: tampilkan nilai dan double");
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }
    }
}