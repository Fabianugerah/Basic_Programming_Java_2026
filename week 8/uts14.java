// NAMA : FABIANUGERAH BAINASSHIDDIQ
// NIM : 264107020026
// KELAS : TI - 1D
import java.util.Scanner;

public class uts14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisSenjata, bagianTubuh;

        System.out.print("Senjata (AR/SMG/Sniper): ");
        jenisSenjata = sc.nextLine();
        System.out.print("Bagian Tubuh (kepala/badan): ");
        bagianTubuh = sc.nextLine();

        boolean senjataValid, bagianValid;

        senjataValid = jenisSenjata.equalsIgnoreCase("AR") || jenisSenjata.equalsIgnoreCase("SMG") || jenisSenjata.equalsIgnoreCase("Sniper");
        bagianValid = bagianTubuh.equalsIgnoreCase("kepala") || bagianTubuh.equalsIgnoreCase("badan");


        if (!senjataValid || !bagianValid) {
            System.out.println("Input tidak valid. Pastikan senjata = (AR/SMG/Sniper) dan bagian = (kepala/badan).");
        } else if (jenisSenjata.equalsIgnoreCase("Sniper") && bagianTubuh.equalsIgnoreCase("kepala")) {
            System.out.println("HEADSHOT! Musuh langsung knock.");
        } else {
            int damageDasar;
            int persenRompi;

            if (jenisSenjata.equalsIgnoreCase("AR")) {
                if (bagianTubuh.equalsIgnoreCase("kepala")) {
                    damageDasar = 60;
                    persenRompi = 0;
                } else {
                    damageDasar = 35;
                    persenRompi = 20;
                }
            } else if (jenisSenjata.equalsIgnoreCase("SMG")) {
                persenRompi = 30;
                if (bagianTubuh.equalsIgnoreCase("kepala")) {
                    damageDasar = 45;
                } else {
                    damageDasar = 25;
                }
            } else {
                damageDasar = 90;
                persenRompi = 0;
            }

            double pengurangan = damageDasar * persenRompi / 100.0;
            double damageAkhir = damageDasar - pengurangan;

            System.out.println("Damage dasar: " + damageDasar);
            System.out.println("Pengurangan rompi: " + persenRompi + "% (" + pengurangan + ")");
            System.out.println("Damage akhir: " + damageAkhir);
        }
        
        sc.close();
    }

}
