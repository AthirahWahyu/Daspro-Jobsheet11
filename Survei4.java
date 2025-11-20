import java.util.Scanner;

public class Survei4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] survei = new int[jumlahResponden][jumlahPertanyaan];

        // Menyimpan hasil survei
        System.out.println("--- INPUT DATA SURVEI KEPUASAN LAYANAN ---");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i+1));

            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai pertanyaan " + (j+1) + " (1-5): ");
                survei[i][j] = input.nextInt();
            }
            System.out.println();
        }
        // Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("-----------------------------------------------");
        System.out.println("--- NILAI RATA - RATA SETIAP RESPONDEN ---");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalR = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalR += survei[i][j];
            }
            double rataR = totalR / jumlahPertanyaan;
            System.out.println("Rata-rata responden ke-" + (i+1) + "  : " + rataR);
        }
        // Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("------------------------------------------------");
        System.out.println("--- NILAI RATA - RATA SETIAP PERTANYAAN ---");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalP = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalP += survei[i][j];
            }
            double rataP = totalP / jumlahResponden;
            System.out.println("Rata-rata pertanyaan " + (j+1) + ": " + rataP);
        }
        // Menampilkan nilai rata-rata secara keseluruhan
        double totalK = 0;
        int jumlahData = jumlahPertanyaan * jumlahResponden;

        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalK += survei[i][j];
            }  
        }
        double rataK = totalK / jumlahData;
        System.out.println("------------------------------------------------");
        System.out.println("--- NILAI RATA - RATA KESELURUHAN ---");
        System.out.println("Rata-rata keseluruhan: " + rataK);

        input.close();
    }
}
