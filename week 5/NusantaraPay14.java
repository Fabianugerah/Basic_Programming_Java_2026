import java.util.Scanner;

public class NusantaraPay14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Status akun (contoh: NORMAL/SUSPICIOUS/BLACK-LISTED): ");
        String statusAkun = sc.nextLine();

        System.out.print("Nominal transaksi: ");
        double nominal = sc.nextDouble();

        System.out.print("Sisa saldo: ");
        double sisaSaldo = sc.nextDouble();

        System.out.print("Transaksi dari luar negeri? (true/false): ");
        boolean isBedaNegara = sc.nextBoolean();

        System.out.print("Jam transaksi (0-23): ");
        int jam = sc.nextInt();

        double limitHarian = 10000;
        String status;

        if (statusAkun.equalsIgnoreCase("BLACK-LISTED")) {
            status = "REJECTED_BLACKLIST";
        } else if (nominal > sisaSaldo) {
            status = "REJECTED_SALDO";
        } else if (nominal > limitHarian) {
            status = "REJECTED_LIMIT";
        } else if (isBedaNegara && nominal > 2000) {
            status = "FLAGGED_FRAUD";
        } else if ((jam >= 0 && jam < 4) && nominal > 1000) {
            status = "REQUIRE_OTP_NIGHT";
        } else if (statusAkun.equalsIgnoreCase("SUSPICIOUS") && nominal > 500) {
            status = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            status = "APPROVED";
        }

        System.out.println("Status Transaksi: " + status);

        sc.close();
    }
}