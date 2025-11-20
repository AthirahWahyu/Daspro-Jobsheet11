# JOBSHEET 11

# PERCOBAAN 

## - Percobaan 1 : Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi 

## - Percobaan 1 : Verifikasi Hasil Percobaan 

![Verifikasi1](.\Verifikasi1.png)

_Pertanyaan:_

1.  Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks
ke-0? Jelaskan!
2.  Mengapa terdapat null pada daftar nama penonton?
3.  Lengkapi daftar penonton pada langkah ke-4 sebagai berikut

![P1P1](.\P1P1.png)

4.  Tambahkan kode program sebagai berikut:

![P1P2](.\P1p2.PNG)

Jelaskan fungsi dari penonton.length dan penonton[0].length!
Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan
penonton[3].length memiliki nilai yang sama? Mengapa?

5.  Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris
pada array menggunakan for loop. Compile, run, lalu amati hasilnya.

![P1P5](.\P1P5.png)

6.  Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris
pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.

![P1P6](.\P1P6.png)

7.  Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3
menggunakan for loop. Compile, run, lalu amati hasilnya.

![P1P7](.\P1P7.png)

8.  Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach
loop. Compile, run, lalu lakukan amati hasilnya.

![P1P8](.\P1P8.png)

9.  Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama
penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.

![P1P9](.\P1P9.png)

10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for
loop?
11. Berapa indeks baris maksimal untuk array penonton?
12. Berapa indeks kolom maksimal untuk array penonton?
13. Apa fungsi dari String.join()?

_Jawaban:_

1.  Tidak, pengisian array tidak harus dilakukan secara berurutan mulai dari indeks ke-0. Kita bebas mengisi elemen mana pun terlebih dahulu, asalkan : 
- Indeks yang diakses valid (tidak melebihi batas array) 
- Tipe datanya sesuai 
2.  null muncul karena ada elemen array yang belum diisi nilai setelah array dibuat. Java tidak otomatis mengisinya dengan string kosong atau nilai default lainnya, tetapi dengan null untuk menandai bahwa belum ada objek String yang disimpan di sana.
3.  Code : 
    ```java 
        public class Bioskop4 {
            public static void main(String[] args) {
                String[][] penonton = new String[4][2];
        
                penonton[0][0] = "Amin";
                penonton[0][1] = "Bena";
                penonton[1][0] = "Candra";
                penonton[1][1] = "Dela";
                penonton[2][0] = "Eka";
                penonton[2][1] = "Farhan";
                penonton[3][0] = "Gisel";
                penonton[3][1] = "Hana";

                System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
                System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
                System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
                System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);
            }
        }
    ```
4.  1. Fungsi penonton.length adalah memberikan jumlah baris dalam array. Karena kita membuat [4][2], maka jumlah baris = 4
    2. Fungsi penonton[0].length 
        - penonton[0] adalah baris pertama dari array, yaitu sebuah array 1D berisi 2 kolom 
        - penonton[0].length menunjukkan jumlah kolom pada pada baris ke-0
    3.  Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan
penonton[3].length memiliki nilai yang sama? 
        - ya, penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3] semuanya memiliki nilai yang sama, yaitu 2. Karena array dibuat dengan perintah : String[][] penonton = new String[4][2];. Yang artinya Java membuat 4 baris dan setiap baris langsung dibuat dengan panjang 2 kolom.
5.  Output : 

![P1J5](.\P1J5.png)

6.  Output : 

![P1J6](.\P1J6.png)

7.  Output : 

![P1J7](.\P1J7.png)

8.  Output : 

![P1J8](.\P1J8.png)

9.  Output : 

![P1J9](.\P1J9.png)

10. a. foreach loop
    - Kelebihan : Lebih ringkas, rapi, dan mudah dibaca. Tidak membutuhkan indeks sehingga dapat mengurangi risiko error indeks. Cocok untuk membaca semua elemen array atau koleksi.
    - Kekurangan : Tidak bisa akses indeks, jadi kurang fleksibel. Tidak cocok untuk memodifikasi array/koleksi saat iterasi. Tidak bisa mengatur iterasi (misalnya melompat, mundur, atau lagkah khusus).

    b. for loop 
    - Kelebihan : Fleksibel, bisa mengakses indeks, bisa iterasi maju atau mundur, cocok untuk perulangan dengan kondisi tertentu, dan dapat mengolah beberapa array sekaligus.
    - Kekurangan : Lebih rawan error, kode lebih panjang, tidak secara otomatis memproses semua elemen, dan lebih sulit dibaca untuk pemula.
        








