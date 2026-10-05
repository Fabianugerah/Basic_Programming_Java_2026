# JOBSHEET 6 - PEMILIHAN 2

**Identitas Mahasiswa:**
* **Nama:** Fabianugerah Bainasshiddiq
* **NIM:** 264107020026
* **Kelas / No. Presensi:** 1D / 14

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks pemilihan bersarang.
2. Mahasiswa mampu menerapkan sintaks pemilihan bersarang ke dalam program Java.
3. Mahasiswa mampu menerapkan operator logika &&, ||, dan ! pada struktur pemilihan.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Nested IF untuk Mengecek Syarat Ujian Skripsi

Ini adalah paragraf contoh yang menjelaskan gambaran singkat mengenai percobaan pertama. Pada bagian ini, mahasiswa diminta untuk menerapkan kondisi `nested if` sederhana.

#### 2.1.1 Kode Program Java
```java
import java.util.Scanner;

public class nestedUjianSkripsi14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan= "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);

        sc.close();
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Contoh Gambar Output Percobaan 1](/week%206/assets/Output%20Percobaan%201.png)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apa yang terjadi jika mahasiswa menjawab `No` pada pertanyaan bebas kompen? Mengapa demikian?
  * **Jawab:** Jika mahasiswa menjawab `No`, program menampilkan pesan `"Gagal! Mahasiswa masih memiliki tanggungan kompen"`. 
  Hal ini terjadi karena kondisi `bebasKompen.equalsIgnoreCase("Ya")` hanya bernilai true jika jawabannya `Ya`. Karena `No` tidak sama dengan `Ya`, kondisi bernilai false dan program langsung masuk ke else, sehingga log bimbingan tidak diperiksa sama sekali.

* **Pertanyaan 2:** Jelaskan maksud dari potongan kode berikut!
    ```java
    if (bimbinganP1 >= 8 && bimbinganP2 >= 4)
    ``` 
  * **Jawab:** Kode `if (bimbinganP1 >= 8 && bimbinganP2 >= 4)` memeriksa dua syarat sekaligus yang dihubungkan operator `&& (AND)`. Syarat pertama, `bimbinganP1 >= 8`, berarti bimbingan dengan pembimbing 1 minimal 8 kali. Syarat kedua, `bimbinganP2 >= 4`, berarti bimbingan dengan pembimbing 2 minimal 4 kali. Karena memakai `&&`, blok `if` hanya dijalankan jika kedua syarat terpenuhi. Jika salah satunya tidak terpenuhi, kondisi bernilai false dan program lanjut ke `else if` berikutnya.

* **Pertanyaan 3:** Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!
  * **Jawab:** Alur pemeriksaan dimulai dari level pertama, yaitu cek kompen. Jika mahasiswa belum bebas kompen, program langsung menampilkan `"Gagal! Mahasiswa masih memiliki tanggungan kompen"` dan selesai. Jika sudah bebas kompen, program lanjut ke level kedua untuk memeriksa log bimbingan secara berurutan:

    - Jika `P1 ≥ 8` dan `P2 ≥ 4`, tampil "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi".
    - Jika tidak, dan `P1 < 8` dan `P2 < 4`, tampil "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali".
    - Jika tidak, dan  `P1 < 8`, tampil `"Gagal! Log bimbingan P1 belum mencapai 8 kali"`.
    - Jika semua di atas tidak terpenuhi `(else)`, tampil `"Gagal! Log bimbingan P2 belum mencapai 4 kali"`.

---

### 2.2 Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus

Paragraf ini menjelaskan ringkasan Percobaan 2. Percobaan ini berfokus pada penggunaan operator logika `&& (AND), || (OR), dan ! (NOT)`.

#### 2.2.1 Kode Program Java
```java
import java.util.Scanner;

public class operatorLogikaWifi14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunBlokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunBlokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunBlokir) {
            System.out.println("Akses Wifi diberikan");
        } else {
            System.out.println("Akses Wifi ditolak");
        }

        sc.close();
    }
}
```

#### 2.2.2 Tabel Pengujian Parameter Output
Berikut adalah hasil uji coba program dengan beberapa kombinasi masukan:

| Uji | mahasiswa  | dosen  | akunDiblokir | Status Eksekusi |
| :---: | :---: | :---: | :---: | :---: |
| 1 | `true` | `false` | `false` | Akses WiFi diberikan |
| 2 | `false` | `true` | `false` | Akses WiFi diberikan |
| 3 | `true` | `false` | `true` | Akses WiFi ditolak |
| 4 | `false` | `false` | `false` | Akses WiFi ditolak |

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jelaskan fungsi operator `||, &&, dan !` pada kondisi program tersebut.
  * **Jawab:** Dalam kondisi `(mahasiswa || dosen) && !akunDiblokir`:
    - `|| (OR)`: bernilai `true` jika salah satu atau kedua sisi `true`. Di sini artinya pengguna cukup menjadi `mahasiswa` atau `dosen`.
    - `&& (AND)`: bernilai `true` hanya jika kedua sisi `true`. Di sini artinya syarat `"mahasiswa atau dosen"` dan syarat `"akun tidak diblokir"` harus terpenuhi bersamaan.
    - `! (NOT)`: membalik nilai boolean. `!akunDiblokir` bernilai `true` jika akun tidak diblokir.

* **Pertanyaan 2:** Mengapa pengguna dosen tetap dapat memperoleh akses ketika nilai `mahasiswa = false`?
  * **Jawab:** Karena operator `|| (OR)` hanya membutuhkan salah satu sisi bernilai `true`. Walaupun mahasiswa bernilai `false`, dosen bernilai `true`, sehingga `(mahasiswa || dosen)` tetap `true`. Selama akun tidak diblokir, kondisi keseluruhan `true` dan akses diberikan.

* **Pertanyaan 3:** Ubah operator `||` menjadi `&&`. Jalankan kembali program menggunakan data uji 1 dan 2. Apa yang terjadi dan mengapa?
  * **Jawab:** Kondisi berubah menjadi `(mahasiswa && dosen) && !akunDiblokir`.

    - Uji 1 (`true`, `false`, `false`): `true` && `false` = `false`, sehingga akses ditolak.
    - Uji 2 (`false`, `true`, `false`): `false` && `true` = `false`, sehingga akses ditolak.
Sebelumnya kedua uji ini diberi akses. Setelah diubah, pengguna harus menjadi mahasiswa dan dosen sekaligus, padahal data uji hanya memenuhi salah satunya.

* **Pertanyaan 4:** Pada ekspresi `mahasiswa || dosen`, kapan kondisi dosen tidak perlu dievaluasi? Jelaskan berdasarkan **short-circuit evaluation**
  * **Jawab:** Pada `mahasiswa || dosen`, kondisi `dosen` tidak dievaluasi ketika `mahasiswa` bernilai `true`. Pada operator `||`, jika sisi kiri sudah `true`, hasil keseluruhan pasti `true` apa pun nilai sisi kanan, sehingga Java melewati pengecekan sisi kanan.

* **Pertanyaan 5:**  Pada ekspresi `(mahasiswa || dosen) && !akunDiblokir`, kapan kondisi `!akunDiblokir` tidak perlu dievaluasi? Jelaskan.
  * **Jawab:** Pada `(mahasiswa || dosen) && !akunDiblokir`, kondisi `!akunDiblokir` tidak dievaluasi ketika `(mahasiswa || dosen)` bernilai `false`, yaitu saat `mahasiswa` dan `dosen` sama-sama `false`. Pada operator `&&`, jika sisi kiri sudah `false`, hasil keseluruhan pasti `false`, sehingga sisi kanan dilewati.

---

### 2.3 Percobaan 3: Nested IF dan Operator Logika untuk Menentukan Akses Laboratorium

Paragraf ini menjelaskan ringkasan Percobaan 3. Percobaan ini berfokus pada penggabungan struktur pemilihan bersarang (`nested if`) dengan operator logika `&& (AND), || (OR), dan ! (NOT)`. Pada level pertama, program memeriksa status mahasiswa (aktif dan tidak sedang disanksi), lalu pada level kedua memeriksa izin dosen atau status asisten laboratorium untuk menentukan akses.

#### 2.3.1 Kode Program Java
```java
import java.util.Scanner;

public class nestedAksesLab14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah mahasiswa sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        System.out.print("Apakah mahasiswa punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();

        System.out.print("Apakah mahasiswa asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

        sc.close();
    }
}
```

#### 2.3.2 Tabel Pengujian Parameter Output
Berikut adalah hasil uji coba program dengan beberapa kombinasi masukan:

| Uji | mahasiswaAktif | sedangDisanksi | punyaIzinDosen | asistenLab | Status Eksekusi |
| :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | `true` | `false` | `true` | `false` | Akses laboratorium diberikan |
| 2 | `true` | `false` | `false` | `true` | Akses laboratorium diberikan |
| 3 | `true` | `false` | `false` | `false` | Akses ditolak: membutuhkan izin dosen atau status asisten lab |
| 4 | `false` | `false` | `true` | `true` | Akses ditolak: status mahasiswa tidak memenuhi syarat |
| 5 | `true` | `true` | `true` | `false` | Akses ditolak: status mahasiswa tidak memenuhi syarat |

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Mengapa pemeriksaan `punyaIzinDosen || asistenLab` ditempatkan di dalam IF pertama?
  * **Jawab:** Karena izin dosen atau status asisten lab hanya relevan jika mahasiswa sudah memenuhi syarat dasar, yaitu aktif dan tidak sedang disanksi. Dengan menempatkannya di dalam IF pertama, pemeriksaan kedua hanya dijalankan jika syarat pertama terpenuhi, sehingga alasan penolakan di tiap level tetap jelas.

* **Pertanyaan 2:** Jelaskan fungsi operator `&&, ||, dan !` pada program tersebut.
  * **Jawab:** Dalam program ini:
    - `&& (AND)`: pada `mahasiswaAktif && !sedangDisanksi`, kedua syarat harus terpenuhi bersamaan agar masuk ke level kedua.
    - `|| (OR)`: pada `punyaIzinDosen || asistenLab`, cukup salah satu yang `true` agar akses diberikan.
    - `! (NOT)`: membalik nilai boolean. `!sedangDisanksi` bernilai `true` jika mahasiswa tidak sedang disanksi.

* **Pertanyaan 3:** Apakah syarat akses dapat ditulis menjadi satu kondisi: `mahasiswaAktif && !sedangDisanksi && (punyaIzinDosen || asistenLab)`? Jelaskan apakah keputusan akses akhirnya sama.
  * **Jawab:** Bisa. Keputusan akhirnya sama, karena akses hanya diberikan jika mahasiswa aktif, tidak disanksi, dan punya izin dosen atau asisten lab. Perbedaannya, dengan satu kondisi program tidak dapat membedakan alasan penolakan.

* **Pertanyaan 4:** Apa keuntungan menggunakan Nested IF pada kasus ini dibandingkan hanya satu IF jika sistem perlu menampilkan alasan penolakan yang berbeda?
  * **Jawab:** Nested IF memisahkan pemeriksaan per tingkat, sehingga setiap kegagalan punya `else` sendiri dengan pesan berbeda. Pada satu IF, semua kegagalan jatuh ke satu `else` sehingga hanya bisa menampilkan satu pesan penolakan.

* **Pertanyaan 5:** Buat satu kombinasi masukan yang menyebabkan akses ditolak pada level pertama dan satu kombinasi yang menyebabkan akses ditolak pada level kedua.
  * **Jawab:**
    - Ditolak di level pertama: `mahasiswaAktif = false`, `sedangDisanksi = false`, `punyaIzinDosen = true`, `asistenLab = true`. Output: "Akses ditolak: status mahasiswa tidak memenuhi syarat".
    - Ditolak di level kedua: `mahasiswaAktif = true`, `sedangDisanksi = false`, `punyaIzinDosen = false`, `asistenLab = false`. Output: "Akses ditolak: membutuhkan izin dosen atau status asisten lab".

---

## 4: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [ ] **Tugas 1:** Implementasikan flowchart yang telah Anda buat pada  Latihan 2 Pertemuan 6 terkait sistem diskon toko buku ke dalam program   Java. Program wajib menerapkan struktur pemilihan bersarang (Nested IF).  Gunakan operator logika apabila diperlukan.
- [ ] **Tugas 2:** Buatlah program Java untuk sistem seleksi calon asisten praktikum berdasarkan ketentuan berikut:
- Mahasiswa dapat mengikuti seleksi apabila berstatus aktif dan tidak sedang mendapatkan sanksi akademik.
- Jika syarat tersebut terpenuhi, mahasiswa harus memenuhi syarat berikutnya yaitu nilai Dasar Pemrograman minimal 80 atau memiliki sertifikat kompetensi pemrograman.
- Jika lolos 2 syarat tersebut, mahasiswa akan dipanggil untuk mengikuti wawancara. Mahasiswa diterima sebagai asisten apabila nilai wawancara minimal 75.
- Program harus menampilkan alasan apabila mahasiswa gagal pada setiap tahap seleksi.
- Gunakan pemilihan bersarang dan operator logika. Simpan file dengan nama
tugas2SeleksiAsistenNoPresensi.java.

---

## 5: KESIMPULAN

Berdasarkan hasil praktikum Jobsheet 6 tentang Pemilihan 2, dapat disimpulkan bahwa:

1. **Pemilihan bersarang (`nested if`)** memungkinkan program memeriksa syarat secara bertingkat. Pemeriksaan level kedua hanya dijalankan jika level pertama terpenuhi, sehingga setiap tahap dapat menampilkan alasan kegagalan yang berbeda. Hal ini terlihat pada Percobaan 1 (syarat ujian skripsi) dan Percobaan 3 (akses laboratorium).

2. **Operator logika** dipakai untuk menggabungkan beberapa kondisi dalam satu ekspresi. Operator `&&` bernilai `true` jika semua syarat terpenuhi, `||` bernilai `true` jika salah satu syarat terpenuhi, dan `!` membalik nilai boolean. Penerapannya terlihat pada Percobaan 2 (akses WiFi kampus).

3. **Short-circuit evaluation** membuat Java berhenti mengevaluasi ekspresi ketika hasilnya sudah pasti. Pada `||`, sisi kanan dilewati jika sisi kiri `true`. Pada `&&`, sisi kanan dilewati jika sisi kiri `false`.

4. **Gabungan nested if dan operator logika** menghasilkan program yang lebih ringkas dan tetap informatif. Kondisi yang sama bisa ditulis dalam satu ekspresi, tetapi nested if lebih unggul ketika program perlu membedakan alasan penolakan di setiap tingkat.