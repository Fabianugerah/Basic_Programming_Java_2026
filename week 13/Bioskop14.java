public class Bioskop14 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        // Pertanyaan 3: Lengkapi elemen yang belum terisi
        System.out.println();
        System.out.println("Pertanyaan 3: setelah elemen [3][1] dilengkapi");
        penonton[3][1] = "Hana";
        for (int i = 0; i < penonton.length; i++) {
            System.out.printf("%s \t %s\n", penonton[i][0], penonton[i][1]);
        }

        // Pertanyaan 4: Panjang array dan panjang tiap baris
        System.out.println();
        System.out.println("Pertanyaan 4: panjang array dan panjang tiap baris");
        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        // Pertanyaan 6: Panjang setiap baris dengan for loop
        System.out.println();
        System.out.println("Pertanyaan 6: for loop");
        System.out.println(penonton.length);
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + penonton[i].length);
        }

        // Pertanyaan 7: Panjang setiap baris dengan foreach loop
        System.out.println();
        System.out.println("Pertanyaan 7: foreach loop");
        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        // Pertanyaan 8: Penonton baris ke-3 dengan for loop
        System.out.println();
        System.out.println("Penonton pada baris ke-3: ");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        // Pertanyaan 9: Penonton baris ke-3 dengan foreach loop
        System.out.println();
        System.out.println("Penonton pada baris ke-3 (foreach): ");
        for (String i : penonton[2]) {
            System.out.println(i);
        }

        // Pertanyaan 10: Penonton setiap baris dengan String.join()
        System.out.println();
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
        }

        // Pertanyaan 12 dan 13: Indeks maksimal
        System.out.println();
        System.out.println("Indeks baris maksimal : " + (penonton.length - 1));
        System.out.println("Indeks kolom maksimal : " + (penonton[0].length - 1));
    }
}