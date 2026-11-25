import java.util.Arrays;

public class Numbers14 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        // Pertanyaan 2: Arrays.toString() pada array 2 dimensi
        System.out.println();
        System.out.println("Pertanyaan 2: Arrays.toString(myNumbers)");
        System.out.println(Arrays.toString(myNumbers));

        // Pertanyaan 3: Arrays.deepToString()
        System.out.println();
        System.out.println("Pertanyaan 3: Arrays.deepToString(myNumbers)");
        System.out.println(Arrays.deepToString(myNumbers));

        // Pertanyaan 5: panjang setiap baris
        System.out.println();
        System.out.println("Pertanyaan 5: panjang setiap baris");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }

        // Pertanyaan 7: mengganti baris pertama dengan array baru
        System.out.println();
        System.out.println("Pertanyaan 7: myNumbers[0] = new int[7]");
        myNumbers[0] = new int[7];
        System.out.println("myNumbers.length    : " + myNumbers.length);
        System.out.println("myNumbers[0].length : " + myNumbers[0].length);

        // Pertanyaan Diskusi: menyalin array 2 dimensi
        System.out.println();
        System.out.println("Diskusi: menyalin array 2 dimensi");

        // 1) Menyalin referensi: kedua variabel menunjuk array yang sama
        int[][] salinan = myNumbers;
        salinan[0][0] = 99;
        System.out.println("Setelah salinan[0][0] = 99, myNumbers[0][0] = " + myNumbers[0][0]);

        // 2) clone() hanya menyalin lapisan luar (shallow copy)
        int[][] klon = myNumbers.clone();
        klon[2][0] = 77;
        System.out.println("Setelah klon[2][0] = 77, myNumbers[2][0] = " + myNumbers[2][0]);

        // 3) Salinan dalam (deep copy)
        int[][] salinanDalam = new int[myNumbers.length][];
        for (int i = 0; i < myNumbers.length; i++) {
            salinanDalam[i] = new int[myNumbers[i].length];
            for (int j = 0; j < myNumbers[i].length; j++) {
                salinanDalam[i][j] = myNumbers[i][j];
            }
        }
        salinanDalam[1][0] = 55;
        System.out.println("Setelah salinanDalam[1][0] = 55, myNumbers[1][0] = " + myNumbers[1][0]);
    }
}