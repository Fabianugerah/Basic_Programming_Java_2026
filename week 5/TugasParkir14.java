import java.util.Scanner;

public class TugasParkir14 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Masukkan lama parkir (jam): ");

        int lamaParkir = sc.nextInt();
        int tarif;

        if (lamaParkir <= 2) {
            tarif = 2000;
        } else {
            int jamLebih = lamaParkir - 2;
            tarif = 2000 + (jamLebih * 1000);
        }

        System.out.println("Total tarif parkir: Rp " + tarif);

        sc.close();
    }
}
