# JOBSHEET 8 - PERULANGAN 2

**Identitas Mahasiswa:**

- **Nama:** Fabianugerah Bainasshiddiq
- **NIM:** 264107020026
- **Kelas / No. Presensi:** 1D / 14

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa memahami konsep perulangan bersarang pada algoritma.
2. Mahasiswa memahami alur perulangan bersarang.
3. Mahasiswa mengenal sintaks perulangan bersarang.
4. Mahasiswa mampu menerapkan perulangan bersarang untuk menyelesaikan studi kasus sederhana.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Review Perulangan 1

Percobaan ini mengulang konsep perulangan `for` sebelum mempelajari perulangan bersarang. Program menampilkan karakter `*` sebanyak `n` kali secara mendatar.

#### 2.1.1 Kode Program Java

```java
import java.util.Scanner;

public class Star14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output

![Output Percobaan 1](/week%208/assets/Output%20Percobaan%201.png)

| Uji | Input n | Output | Jumlah `*` |
| :-: | :-: | :-: | :-: |
| 1 | 3 | `***` | 3 |
| 2 | 5 | `*****` | 5 |
| 3 | 7 | `*******` | 7 |

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi

- **Pertanyaan 1:** Jika inisialisasi `i = 1` diubah menjadi `i = 0` tanpa mengubah kondisi, berapa karakter `*` yang tercetak ketika n = 5?
  - **Jawab:** Tercetak **6** karakter `*`. Nilai `i` yang memenuhi `i <= 5` adalah 0, 1, 2, 3, 4, 5 (enam nilai), karena perulangan mulai satu putaran lebih awal sementara batas atasnya tetap.

- **Pertanyaan 2:** Jika kondisi `i <= n` diganti menjadi `i < n`, berapa kali perulangan dijalankan saat n = 5? Mengapa berbeda?
  - **Jawab:** Perulangan berjalan **4 kali** (`i` = 1, 2, 3, 4). Saat `i = 5`, kondisi `5 < 5` bernilai `false` sehingga berhenti. Pada `i <= n`, `5 <= 5` masih `true`, jadi berjalan 5 kali. Perbedaannya ada pada operator `<=` yang menyertakan batas, sedangkan `<` tidak.

- **Pertanyaan 3:** Prediksi output potongan kode berikut ketika n = 9, lalu modifikasi agar mencetak bilangan ganjil positif yang tidak melebihi n.

  ```java
  for (int i = 2; i <= n; i += 2) {
      System.out.print(i + " ");
  }
  ```

  - **Jawab:** Prediksi output: `2 4 6 8 ` (nilai `i` = 2, 4, 6, 8; berikutnya 10 > 9 sehingga berhenti). Modifikasi untuk bilangan ganjil:

```java
import java.util.Scanner;

// Pertanyaan 3 (Percobaan 1): prediksi + modifikasi bilangan ganjil
public class StarGanjil14 {
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
```

    Untuk n = 9 hasilnya `1 3 5 7 9 `.

- **Pertanyaan 4:** Jelaskan mengapa perubahan `i++` menjadi `i--` (kondisi tetap `i <= n`) membuat perulangan tidak berhenti dalam waktu wajar.
  - **Jawab:** `i` dimulai dari 1 lalu terus berkurang (0, -1, -2, ...), sehingga `i <= n` selalu `true` dan kondisi berhenti tidak pernah tercapai. Perulangan baru berhenti jika `i` melewati batas bawah `int` lalu *overflow* menjadi bilangan positif yang sangat besar, yang butuh lebih dari 2 miliar putaran. Praktisnya ini menjadi perulangan tak hingga.

---

### 2.2 Percobaan 2: Pola Bintang Persegi Panjang (Nested FOR)

Percobaan ini memakai *nested loop* `for` untuk mencetak persegi panjang. *Outer loop* mengatur baris, sedangkan *inner loop* mengatur kolom. Karakter yang dicetak sudah diganti menjadi `#` sesuai Pertanyaan 5.

#### 2.2.1 Kode Program Java

```java
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
```

#### 2.2.2 Hasil Running / Screenshot Output

![Output Percobaan 2](/week%208/assets/Output%20Percobaan%202.png)

| Uji | Baris | Kolom | Bentuk Output |
| :-: | :-: | :-: | :-: |
| 1 | 3 | 6 | 3 baris × 6 karakter |
| 2 | 4 | 2 | 4 baris × 2 karakter |
| 3 | 1 | 5 | 1 baris × 5 karakter |

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi

- **Pertanyaan 1:** Tentukan fungsi variabel `i` dan `j`.
  - **Jawab:** `i` adalah penghitung **baris** (outer loop), sedangkan `j` adalah penghitung **kolom** (inner loop).

- **Pertanyaan 2:** Berapa kali *outer loop*, *inner loop*, dan `print("*")` dijalankan untuk baris = 4 dan kolom = 7?
  - **Jawab:** *Outer loop* berjalan **4 kali**. *Inner loop* dimulai 4 kali dan tiap kali berjalan 7 putaran, sehingga totalnya **28 putaran**. Perintah `print("*")` dijalankan **28 kali** (4 × 7).

- **Pertanyaan 3:** Apa yang terjadi jika batas perulangan luar dan dalam ditukar (outer = `kolom`, inner = `baris`) untuk baris = 3 dan kolom = 6?
  - **Jawab:** *Outer loop* berjalan 6 kali dan tiap kali *inner loop* mencetak 3 karakter, sehingga hasilnya **6 baris × 3 karakter** (bukan 3 baris × 6 karakter). Jumlah total tetap 18, tetapi bentuknya tertukar.

- **Pertanyaan 4:** Jelaskan akibat penghapusan `System.out.println();` setelah *inner loop*.
  - **Jawab:** Kursor tidak pindah baris, sehingga seluruh karakter tercetak dalam **satu baris panjang** (untuk 3 × 6 menjadi 18 karakter berderet).

- **Pertanyaan 5:** Modifikasi program agar karakter yang dicetak adalah `#`.
  - **Jawab:** Perintah `System.out.print("*")` diganti menjadi `System.out.print("#")` (sudah diterapkan pada kode di atas).

---

### 2.3 Percobaan 3: Debugging Bintang Segitiga – Nested WHILE

Pada percobaan ini kode awal sengaja dibuat belum benar. Tugasnya adalah mencari kesalahan dan memperbaikinya tanpa mengganti `while` menjadi `for`.

#### 2.3.1 Kode Program Java

**Kode awal (belum benar):**

```java
import java.util.Scanner;

public class Triangle14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        sc.close();
    }
}
```

**Kode akhir (sudah diperbaiki + segitiga terbalik):**

```java
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
```

#### 2.3.2 Hasil Running / Screenshot Output

![Output Percobaan 3](/week%208/assets/Output%20Percobaan%203.png)

Output kode awal:

| Uji | Input n | Output Aktual | Output Target |
| :-: | :-: | :-: | :-: |
| 1 | 3 | `******` (satu baris, 6 bintang) | `*`, `**`, `***` |
| 2 | 5 | `***************` (satu baris, 15 bintang) | `*` sampai `*****` |

Output kode akhir untuk n = 5:

```
*
**
***
****
*****
*****
****
***
**
*
```

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi

- **Langkah 5 (debug `[i=...]`, n = 5):**
  - a. *Outer loop* berjalan **6 kali** (`i` = 0 sampai 5), tidak sama dengan jumlah baris yang diinginkan (5).
  - b. Saat `i = 0` tercetak **0** bintang karena `j < 0` langsung `false`.
  - c. Semua karakter tampil dalam satu baris karena tidak ada `System.out.println();`.

- **Langkah 6:** Setelah `System.out.println();` ditambahkan sebelum `i++`, segitiga mulai terbentuk tetapi masih ada baris kosong di awal (dari `i = 0`). Lalu inisialisasi `int i = 0` diubah menjadi `int i = 1` sehingga perulangan berjalan tepat n kali tanpa baris kosong.

- **Pertanyaan 1:** Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan.
  - **Jawab:** Ketidaksesuaiannya: semua bintang berada dalam satu baris, dan ada iterasi tambahan `i = 0` yang menghasilkan baris kosong (total 6 putaran, bukan 5). Perbaikannya: (1) menambahkan `System.out.println();` setelah *inner loop* agar pindah baris, dan (2) mengubah inisialisasi `i` dari 0 menjadi 1 agar *outer loop* berjalan tepat n kali.

- **Pertanyaan 2:** Jelaskan peran `i` dan `j`. Mengapa `j` harus diinisialisasi kembali ke 0 pada setiap iterasi *outer loop*? Apa yang terjadi jika tidak di-*reset*?
  - **Jawab:** `i` adalah nomor baris yang menentukan banyaknya bintang pada baris itu, sedangkan `j` adalah penghitung bintang di dalam satu baris. `j` harus di-*reset* karena tiap baris menghitung bintangnya dari awal. Jika `j` tidak di-*reset* (dideklarasikan di luar *outer loop*), nilainya terbawa dari baris sebelumnya: setelah baris 1 `j = 1`, pada baris 2 kondisi `j < 2` hanya benar sekali sehingga hanya 1 bintang tercetak, begitu seterusnya. Akibatnya setiap baris hanya berisi 1 bintang dan segitiga tidak terbentuk.

- **Pertanyaan 3:** Jelaskan perubahan inisialisasi, kondisi, dan *update* pada *outer loop* untuk segitiga terbalik.
  - **Jawab:** Inisialisasi diubah menjadi `i = n` (mulai dari baris terpanjang, tanpa `int` karena `i` sudah dideklarasikan), kondisi menjadi `i >= 1`, dan *update* menjadi `i--` agar jumlah bintang menurun setiap baris.

---

### 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

Program menghitung rata-rata nilai tiap kelompok dan menentukan kelompok dengan rata-rata tertinggi menggunakan tiga tingkat perulangan: `while` (kelompok), `for` (penilai), dan `do-while` (validasi nilai).

#### 2.4.1 Kode Program Java

```java
import java.util.Scanner;

public class NilaiKelompok14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai  : ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;          // penghitung outer loop
            double rataTertinggi = -1;      // -1 agar kelompok pertama pasti tercatat
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;      // di-reset tiap kelompok

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("  Nilai dari Penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("  Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }

                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok
                        + ": nilai rata-rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }

                nomorKelompok++;
            }

            System.out.println("==============================");
            System.out.println("Kelompok terbaik    : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }
        sc.close();
    }
}
```

#### 2.4.2 Hasil Running / Screenshot Output

![Output Percobaan 4](/week%208/assets/Output%20Percobaan%204.png)

| Uji | Kelompok | Penilai | Input Nilai | Hasil |
| :-: | :-: | :-: | :-: | :-: |
| 1 | 3 | 2 | K1: 80, 90; K2: 75, 105 (ditolak), 85; K3: 90, 96 | Rata-rata 85.0, 80.0, 93.0; terbaik kelompok 3 (93.0) |
| 2 | 2 | 3 | K1: 70, 80, 90; K2: 60, 75, 90 | Rata-rata 80.0, 75.0; terbaik kelompok 1 (80.0) |
| 3 | 0 | 2 | - | "Jumlah kelompok dan penilai harus > 0." |

#### 2.4.3 Jawaban Pertanyaan / Pertanyaan Refleksi

- **Pertanyaan 1:** Mengapa `totalNilai` perlu di-*reset* di dalam *outer loop*, tetapi `rataTertinggi` tidak?
  - **Jawab:** `totalNilai` adalah jumlah nilai per kelompok sehingga harus mulai dari 0 untuk tiap kelompok. `rataTertinggi` adalah rekor dari seluruh kelompok yang terus dibandingkan; jika di-*reset*, rekor sebelumnya hilang dan kelompok terakhir selalu dianggap terbaik.

- **Pertanyaan 2:** Untuk 3 kelompok dan 2 penilai, berapa kali badan perulangan FOR dijalankan?
  - **Jawab:** 3 × 2 = **6 kali**.

- **Pertanyaan 3:** Apa yang terjadi jika `totalNilai` bertipe `int` dan rata-rata dihitung dengan pembagian dua bilangan bulat?
  - **Jawab:** Hasil pembagian dibulatkan ke bawah (bagian desimal terbuang). Contoh: nilai 80 dan 85 menghasilkan total 165, dan 165 / 2 = **82**, bukan 82.5. Rata-rata menjadi tidak akurat dan bisa memengaruhi penentuan kelompok terbaik.

- **Pertanyaan 4:** Mengapa `rataTertinggi` diberi nilai awal -1, bukan 0?
  - **Jawab:** Rata-rata terkecil yang mungkin adalah 0. Dengan nilai awal 0, kondisi `rataNilai > rataTertinggi` menjadi `0 > 0` (`false`) sehingga tidak pernah ter-update. Contoh: 2 kelompok, 2 penilai, semua nilai 0, hasilnya `kelompokTerbaik = 0` (kelompok tidak ada). Dengan nilai awal -1, kelompok pertama selalu tercatat.

- **Pertanyaan 5:** Sebutkan jenis perulangan pada tiga tingkat beserta perannya.
  - **Jawab:** `while` (luar) memproses kelompok satu per satu; `for` (tengah) mengulang untuk setiap penilai dalam satu kelompok; `do-while` (dalam) meminta input nilai minimal sekali dan mengulanginya selama nilai di luar 0–100.

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Pola bilangan bertingkat dan total angka yang dicetak. File: `Tugas114.java`.
- [x] **Tugas 2:** Tabel perkalian n × n (n minimal 3) dan jumlah seluruh angka. File: `Tugas214.java`.
- [x] **Tugas 3:** Rekap penjualan beberapa toko dan toko dengan barang terbanyak. File: `Tugas314.java`.

### 3.1 Tugas 1: Pola Bilangan Bertingkat

Program mencetak pola `1`, `1 2`, `1 2 3`, dan seterusnya sampai baris ke-n, lalu menampilkan total angka yang tercetak.

#### 3.1.1 Kode Program Java

```java
import java.util.Scanner;

public class Tugas114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n harus minimal 1.");
        } else {
            int total = 0;
            for (int i = 1; i <= n; i++) {          // baris
                for (int j = 1; j <= i; j++) {      // angka 1 sampai i
                    System.out.print(j);
                    if (j < i) {
                        System.out.print(" ");
                    }
                    total++;
                }
                System.out.println();
            }
            System.out.println("Total angka tercetak: " + total);
        }
        sc.close();
    }
}
```

#### 3.1.2 Tabel Pengujian Parameter Output

| Uji | Input n | Output | Total Angka |
| :-: | :-: | :-: | :-: |
| 1 | 5 | 5 baris (`1` sampai `1 2 3 4 5`) | 15 |
| 2 | 3 | `1`, `1 2`, `1 2 3` | 6 |
| 3 | 1 | `1` | 1 |
| 4 | 0 | "n harus minimal 1." | - |

### 3.2 Tugas 2: Tabel Perkalian

Program menampilkan tabel perkalian n × n dengan nested `for`, format rata kanan memakai `printf("%4d")`, lalu menjumlahkan seluruh angka pada tabel.

#### 3.2.1 Kode Program Java

```java
import java.util.Scanner;

public class Tugas214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("n harus minimal 3.");
        } else {
            int jumlah = 0;
            for (int i = 1; i <= n; i++) {          // nomor baris
                for (int j = 1; j <= n; j++) {      // nomor kolom
                    int hasil = i * j;
                    System.out.printf("%4d", hasil);
                    jumlah += hasil;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka: " + jumlah);
        }
        sc.close();
    }
}
```

#### 3.2.2 Tabel Pengujian Parameter Output

| Uji | Input n | Jumlah Seluruh Angka |
| :-: | :-: | :-: |
| 1 | 4 | 100 |
| 2 | 3 | 36 |
| 3 | 5 | 225 |
| 4 | 2 | "n harus minimal 3." |

### 3.3 Tugas 3: Rekap Penjualan Beberapa Toko

Program meminta jumlah toko, jumlah pelanggan tiap toko, dan jumlah barang tiap pelanggan (tidak boleh negatif). Hasilnya total pelanggan dan barang per toko, total barang seluruh toko, dan toko dengan barang terbanyak (jika seri, nomor toko terkecil).

#### 3.3.1 Kode Program Java

```java
import java.util.Scanner;

public class Tugas314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemuaBarang = 0;
            int barangTerbanyak = -1;   // -1 agar toko pertama pasti tercatat
            int tokoTerbanyak = 0;

            for (int toko = 1; toko <= jumlahToko; toko++) {
                int jumlahPelanggan;
                do {
                    System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Barang yang dibeli pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);

                totalSemuaBarang += totalBarangToko;
                if (totalBarangToko > barangTerbanyak) {    // ">" agar toko bernomor kecil menang saat seri
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }

            System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}
```

#### 3.3.2 Tabel Pengujian Parameter Output

| Uji | Data Input | Hasil |
| :-: | :-: | :-: |
| 1 | Toko 1: 2 pelanggan (3, 2); Toko 2: 3 pelanggan (1, 4, 2) | Toko 1 total 5, Toko 2 total 7, total 12, terbanyak toko 2 |
| 2 | Toko 1: 2 pelanggan (2, 2); Toko 2: 1 pelanggan (4) | Total barang sama (4), terbanyak toko 1 |
| 3 | Toko 1: 0 pelanggan; Toko 2: 1 pelanggan (3) | Toko 1 total 0, Toko 2 total 3, terbanyak toko 2 |
| 4 | Jumlah barang -2 | "Tidak boleh negatif. Ulangi input!" |

---

## 4: KESIMPULAN

Berdasarkan hasil praktikum Jobsheet 8 tentang Perulangan 2, dapat disimpulkan bahwa:

1. **Perulangan bersarang (*nested loop*)** adalah perulangan di dalam perulangan. *Outer loop* mengatur tingkat luar (misalnya baris), sedangkan *inner loop* berjalan penuh setiap kali satu putaran *outer loop*, sehingga jumlah eksekusi badan terdalam adalah hasil kali kedua batas (contoh: 4 × 7 = 28).

2. **Posisi `System.out.println()` dan inisialisasi variabel** sangat berpengaruh pada bentuk output. `println()` di akhir *outer loop* membuat tiap baris pindah baris, dan variabel penghitung *inner loop* harus di-*reset* pada setiap iterasi *outer loop* agar pola segitiga terbentuk dengan benar.

3. **Nilai awal, kondisi, dan *update*** menentukan banyak putaran. Perbedaan `<` dan `<=`, atau `i = 0` dan `i = 1`, mengubah jumlah putaran; *update* yang salah (`i--` pada kondisi `i <= n`) menyebabkan perulangan tak hingga.

4. **Variabel akumulator** seperti `totalNilai` perlu di-*reset* per kelompok, sedangkan variabel rekor seperti `rataTertinggi` harus bertahan selama semua kelompok diproses dan diberi nilai awal yang aman (-1).

5. **Kombinasi `while`, `for`, dan `do-while`** dapat dipakai bersamaan sesuai kebutuhan: `while` untuk jumlah iterasi yang bergantung kondisi, `for` untuk jumlah pasti, dan `do-while` untuk validasi input yang harus dijalankan minimal sekali.