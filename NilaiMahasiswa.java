import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = input.nextInt();
        
        int[] nilai = new int[n];
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
            if (nilai[i] > max) max = nilai[i];
            if (nilai[i] < min) min = nilai[i];
        }

        System.out.println("\nSemua nilai mahasiswa:");
        for (int val : nilai) {
            System.out.print(val + " ");
        }
        System.out.println("\nNilai rata-rata: " + (double) total / n);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
    }
}
