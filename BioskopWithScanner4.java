import java.util.Scanner;

public class BioskopWithScanner4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu, baris, kolom;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n--- MENU BIOSKOP MOON ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    // Input data penonton
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan kolom (1-2: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    // Validasi baris & kolom 
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Posisi tidak valid!");
                    } else if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi sudah terisi!");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");
                    }
                    break;

                case 2 : 
                // Tampilkan daftar penonton
                System.out.println("\n--- DAFTAR PENONTON ---");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(isi + "\t");
                    }
                    System.out.println();            
                }
                    break;

                case 3: 
                // Exit 
                System.out.println("Terima kasih!");
                sc.close();
                return;

                default: 
                System.out.println("Pilihan menu tidak valid!");
            }
        }
    }  
}
