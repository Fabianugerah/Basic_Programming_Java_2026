import java.util.Scanner;

public class studikasus1_14 {
    public static void main(String[] args) {
        // PROGRAM INPUT STATIS
        // double gajiPokok = 5000000;
        // double tunjanganPerAnak = 100000;
        // int jumlahAnak = 4;
        // double persenPotonganPensiun = 0.10;

        // double totalTunjanganAnak = tunjanganPerAnak * jumlahAnak;
        // double potonganPensiun = gajiPokok * persenPotonganPensiun;
        // double gajiBersih = gajiPokok + totalTunjanganAnak - potonganPensiun;
        // Batas Komentar ============================================================

        //PROGRAM INPUT DINAMIS
        Scanner sc = new Scanner(System.in);

        double gajiPokok, tunjanganPerAnak, gajiBersih, totalTunjanganAnak, potonganPensiun;
        int jumlahAnak;
        double persenPotonganPensiun = 0.10;

        System.out.print("Masukkan gaji pokok: Rp");
        gajiPokok = sc.nextDouble();
        System.out.print("Masukkan tunjangan per anak: Rp");
        tunjanganPerAnak = sc.nextDouble();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();

        totalTunjanganAnak = tunjanganPerAnak * jumlahAnak;
        potonganPensiun = gajiPokok * persenPotonganPensiun;
        gajiBersih = gajiPokok + totalTunjanganAnak - potonganPensiun;
        // Batas Komentar ============================================================

        System.out.println("============ Slip Gaji ============");
        System.out.println("Gaji pokok            : Rp" + gajiPokok);
        System.out.println("Jumlah anak           : " + jumlahAnak);
        System.out.println("Tunjangan anak        : Rp" + totalTunjanganAnak);
        System.out.println("Potongan pensiun (10%): Rp" + potonganPensiun);
        System.out.println("Gaji bersih           : Rp" + gajiBersih);
        System.out.println("===================================");

        // KODE UNTUK INPUT DINAMIS
        sc.close();
    }
}
