import java.util.Scanner;

public class Tugas2_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                "Teh Tarik", "Cappucino", "Chocolate Ice" };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };

        // ===== Tampilkan daftar menu =====
        System.out.println("===== DAFTAR MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        // ===== Fitur pencarian menu (linear search) =====
        System.out.println();
        System.out.println("--- FITUR PENCARIAN MENU ---");
        System.out.print("Masukkan nama menu yang dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu ditemukan. Harga " + menu[i] + " adalah Rp " + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");
        }

        // ===== Fitur pemesanan =====
        System.out.println();
        System.out.println("--- FITUR PEMESANAN ---");
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // membersihkan sisa enter setelah nextInt()

        String[] pesanan = new String[jumlah];     // array pesanan (terpisah dari array menu)
        int[] hargaPesanan = new int[jumlah];      // harga tiap pesanan
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            boolean valid = false;
            // ulangi terus sampai nama menu yang dimasukkan ada di daftar menu
            while (!valid) {
                System.out.print("Item ke-" + (i + 1) + ", masukkan nama menu: ");
                String nama = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        total = total + harga[j];
                        valid = true;
                        break;
                    }
                }
                if (!valid) {
                    System.out.println("Menu tidak tersedia. Silakan masukkan lagi.");
                }
            }
        }

        // ===== Tampilkan daftar pesanan dan total biaya =====
        System.out.println();
        System.out.println("===== DAFTAR PESANAN =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("--------------------------");
        System.out.println("TOTAL BIAYA : Rp " + total);
        System.out.println("==========================");

        sc.close();
    }
}