import java.util.Scanner;

public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];

        double totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        System.out.println("\n=== Hasil Penilaian ===");
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i] + " = LULUS");
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i] + " = TIDAK LULUS");
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rataLulus = jumlahLulus > 0 ? totalLulus / jumlahLulus : 0;
        double rataTidakLulus = jumlahTidakLulus > 0 ? totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("\nRata-rata nilai LULUS       : " + rataLulus);
        System.out.println("Rata-rata nilai TIDAK LULUS : " + rataTidakLulus);

        sc.close();
    }
}