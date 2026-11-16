import java.util.Scanner;

public class ArrayNilai14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }

        // Modifikasi Code Pertanyaan 2: Hanya tampilkan mahasiswa yang lulus
        System.out.println();
        System.out.println("Pertanyaan 2: Mahasiswa yang lulus (nilai > 70)");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i]);
            }
        }

        // Modifikasi Code Pertanyaan 3: Menampilkan dengan foreach
        System.out.println();
        System.out.println("Pertanyaan 3: Tampilan dengan foreach");
        int nomor = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + nomor + ": " + nilai + " (" + status + ")");
            nomor++;
        }

        // Modifikasi Code Pertanyaan 4: Jumlah lulus dan tidak lulus
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        System.out.println();
        System.out.println("Pertanyaan 4: Rekap kelulusan");
        System.out.println("Jumlah mahasiswa lulus : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);

        input.close();
    }
}