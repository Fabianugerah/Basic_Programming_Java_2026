import java.util.Scanner;

// Modifikasi Pertanyaan 2 sampai 5 (Percobaan 2): menu, validasi baris/kolom,
public class BioskopMenu14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan = 0;

        while (pilihan != 3) {
            System.out.println();
            System.out.println("===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Input harus berupa angka.");
                continue;
            }
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();

                boolean tersimpan = false;
                while (!tersimpan) {
                    System.out.print("Masukkan baris: ");
                    if (!sc.hasNextInt()) {
                        sc.nextLine();
                        System.out.println("Baris harus berupa angka.");
                        continue;
                    }
                    int baris = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Masukkan kolom: ");
                    if (!sc.hasNextInt()) {
                        sc.nextLine();
                        System.out.println("Kolom harus berupa angka.");
                        continue;
                    }
                    int kolom = sc.nextInt();
                    sc.nextLine();

                    // Pertanyaan 3: cek rentang baris dan kolom
                    if (baris < 1 || baris > penonton.length) {
                        System.out.println("Baris tidak tersedia. Pilih baris 1 sampai " + penonton.length + ".");
                    } else if (kolom < 1 || kolom > penonton[baris - 1].length) {
                        System.out.println("Kolom tidak tersedia. Pilih kolom 1 sampai " + penonton[baris - 1].length + ".");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        // Pertanyaan 4: kursi sudah terisi
                        System.out.println("Kursi (" + baris + "," + kolom + ") sudah terisi oleh "
                                + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                        tersimpan = true;
                    }
                }

            } else if (pilihan == 2) {
                // Pertanyaan 5: kursi kosong ditampilkan sebagai ***
                System.out.println("--- Daftar Penonton ---");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris " + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.printf("%-10s", isi);
                    }
                    System.out.println();
                }

            } else if (pilihan != 3) {
                System.out.println("Menu tidak tersedia.");
            }
        }

        System.out.println("Terima kasih.");
        sc.close();
    }
}