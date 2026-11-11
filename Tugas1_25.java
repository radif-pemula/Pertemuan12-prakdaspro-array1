import java.util.Scanner;

public class Tugas1_25 {

    // Batas nilai minimal untuk dinyatakan LULUS (bisa diubah sesuai ketentuan dosen)
    static final int BATAS_LULUS = 60;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Memasukkan banyaknya mahasiswa
        int jumlah;
        do {
            System.out.print("Masukkan banyaknya mahasiswa : ");
            jumlah = input.nextInt();
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0!");
            }
        } while (jumlah <= 0);

        int[] nilai = new int[jumlah];

        // 2. Memasukkan setiap nilai mahasiswa satu per satu
        System.out.println();
        for (int i = 0; i < jumlah; i++) {
            do {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " (0-100) : ");
                nilai[i] = input.nextInt();
                if (nilai[i] < 0 || nilai[i] > 100) {
                    System.out.println("Nilai harus antara 0 sampai 100!");
                }
            } while (nilai[i] < 0 || nilai[i] > 100);
        }

        // 3. Menghitung rata-rata
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
        }
        double rataRata = (double) total / jumlah;

        // 4. Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        // Menampilkan hasil
        System.out.println();
        System.out.println("=========================================");
        System.out.println("            HASIL PENGOLAHAN NILAI       ");
        System.out.println("=========================================");
        System.out.printf("Rata-rata nilai : %.2f%n", rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

        // 5. Menampilkan semua nilai beserta status kelulusan
        System.out.println();
        System.out.println("Daftar Nilai Mahasiswa (Batas lulus = " + BATAS_LULUS + ")");
        System.out.println("-----------------------------------------");
        System.out.printf("%-5s %-10s %-15s%n", "No", "Nilai", "Status");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < jumlah; i++) {
            String status = (nilai[i] >= BATAS_LULUS) ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-5d %-10d %-15s%n", (i + 1), nilai[i], status);
        }
        System.out.println("-----------------------------------------");

        input.close();
    }
}