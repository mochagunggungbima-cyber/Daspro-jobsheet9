import java.util.Scanner;

public class ArrayNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        int total = 0;

        System.out.println("=== Input Nilai Akhir Mahasiswa ===");
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilaiAkhir[i] = sc.nextInt();
            total += nilaiAkhir[i];
        }

        System.out.println("\n=== Daftar Nilai Akhir ===");
        for (int i = 0; i < 10; i++) {
            String status = (nilaiAkhir[i] >= 60) ? "Lulus" : "Tidak Lulus";
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i] + " (" + status + ")");
        }

        double rataRata = (double) total / 10;

        int tertinggi = nilaiAkhir[0];
        int terendah = nilaiAkhir[0];
        for (int i = 1; i < 10; i++) {
            if (nilaiAkhir[i] > tertinggi) tertinggi = nilaiAkhir[i];
            if (nilaiAkhir[i] < terendah) terendah = nilaiAkhir[i];
        }
        System.out.println("\n=== Hasil Analisis Nilai ===");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        sc.close();
    }
}