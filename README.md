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




