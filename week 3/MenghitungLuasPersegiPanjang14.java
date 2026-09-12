import java.util.Scanner;

public class MenghitungLuasPersegiPanjang14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        panjang = sc.nextInt();
        lebar = sc.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang = " + luas);

        sc.close();
    }
}
