import java.util.Scanner;

public class GajiKaryawan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajipokok;
        double bonus, totGaj;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        gajipokok = sc.nextInt();

        bonus = 0.05 * gajipokok;   
        totGaj = gajipokok + tunjTransp + tunjMkn + bonus - (0.1 * gajipokok);

        System.out.println("Bonus bulanan anda adalah Rp" + bonus);
        System.out.println("Gaji yang diterima adalah Rp" + (int) totGaj);

        sc.close();

    }
}
