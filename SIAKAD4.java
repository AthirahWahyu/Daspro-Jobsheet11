import java.util.Scanner;

public class SIAKAD4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i,j;

        // Input jumlah siswa & matkul
        System.out.print("Masukkan jumlah mahasiswa  : ");
        int jumlahMahasiswa = input.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = input.nextInt();
        System.out.println();

        // Membuat array dinamis 
        int[][] nilai = new int[jumlahMahasiswa][jumlahMatkul];

        // Input nilai mahasiswa 
        for (i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));

            for (j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = input.nextInt();
            }
        }

        // Hitung rata-rata setiap mahasiswa
        System.out.println("-----------------------------------");
        System.out.println("Rata-rata Nilai setiap Mahasiswa:");

        for (i = 0; i < jumlahMahasiswa; i++) {
            double totalPerSiswa = 0;

            for (j = 0; j < jumlahMatkul; j++) {
                totalPerSiswa += nilai[i][j];
            }
            double rataPerSiswa = totalPerSiswa / jumlahMatkul;
            System.out.println("Rata-rata mahasiswa ke-" + (i+1) + ": " + rataPerSiswa);
        }

        // Hitung rata-rata per mata kuliah 
        System.out.println("-----------------------------------");
        System.out.println("Rata-rata nilai setiap mata kuliah:");
        for (j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;
            
            for (i = 0; i < jumlahMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            
            System.out.println("Mata kuliah " + (j + 1) + ": " + (totalPerMatkul/jumlahMahasiswa));
        }
        input.close();
    }
}



