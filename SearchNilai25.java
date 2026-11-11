import java.util.Scanner;

public class SearchNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak elemen array: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari (key): ");
        int key = sc.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
        sc.close();
    }
}