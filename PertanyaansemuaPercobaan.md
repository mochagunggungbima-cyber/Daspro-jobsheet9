Percobaan 1

1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000.
Apa yang terjadi? Mengapa bisa demikian?
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus
pada saat deklarasi array
3. Ubah statement pada langkah No 4 menjadi seperti berikut!
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran
dari program? Mengapa demikian?

Perocbaan 2

1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ? 
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program
hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai
> 70):
Jalankan program dan jelaskan alur program!
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan
nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus,
seperti ilustrasi output berikut!

Percobaan 3

1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)
agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa
yang memiliki lebih besar dari 70 (>70).
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)sehingga
program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan
output seperti berikut ini:

percobaan 4

1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di
atas.
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima
input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin
dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil
program:
Dasar Pemrograman 2025
7
Team Teaching Dasar Pemrograman 2025
Politeknik Negeri Malang
3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan
"Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array.
Contoh tampilan program sebagai berikut!

Jawaban 

Percobaan 1

1. Program eror tidak bisa dijalankan, karena bil menggunakan tipe data int hanya bisa menyimpan bilangan bulat.
2. int[] bil = {5, 13, -7, 17};
3. done.
4. Perulangan akan terjadi 5 kali, karena di mulai dari nol sampai 4.
3. Menggunakan perulangan yang otomatis, tidak perlu menulis sistem.out.ptintln 4 kali.
4. Tidak terjadi looping 5x, karena array cuma 4.

Percobaan 2

1. Program melakukan perulangan sebanyak panjang array (10x).
2. 
2. Perulangan dijalankan sesuai panjang array nilaiAkhir.
3. Langkah ke 6 melakukan perulangan mulai dari mahasiswa dengan nomor terendah tetapi yang lulus.
4. Done.

Percobaan 3

1. Done
2. Done

Percobaan 4

1. Dalam loop (for, while, do-while): break; menghentikan eksekusi loop terdekat secara langsung dan melompat ke pernyataan setelah loop.
2. ![SearchNilai](SearchNilai.png)
3. Done.