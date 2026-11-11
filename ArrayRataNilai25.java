import java.util.Scanner;

public class ArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        // Validasi: ukuran array harus positif
        while (jumlah <= 0) {
            System.out.print("Jumlah harus lebih dari 0, masukkan lagi: ");
            jumlah = input.nextInt();
        }

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        int jumlahLulus = 0;
        double rataRata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        rataRata = (double) total / nilaiMhs.length;
        System.out.println("Total nilai mahasiswa: " + total);
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi)
                tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah)
                terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus (> 70): " + jumlahLulus);

        String predikat;
        if (rataRata >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rataRata >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        System.out.println("Predikat kelas: " + predikat);
    }
}