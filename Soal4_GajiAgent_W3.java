import java.util.Scanner;

public class Soal4_GajiAgent_W3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jumlah penjualan bulan ini
        int jumlahPenjualan = scanner.nextInt();

        // Gaji pokok
        int gajiPokok = 500000;

        // Harga setiap item
        int hargaItem = 50000;

        // Inisialisasi bonus penjualan
        double bonusPenjualan = 0;

        if (jumlahPenjualan >= 40) {
            if (jumlahPenjualan > 80) {
                // Bonus 35% dari total penjualan
                bonusPenjualan = 0.35 * hargaItem * jumlahPenjualan;
            } else {
                // Bonus 25% dari total penjualan
                bonusPenjualan = 0.25 * hargaItem * jumlahPenjualan;
            }
        } else if (jumlahPenjualan < 15) {
            // Denda pemotongan gaji pokok 15%
            gajiPokok -= 0.15 * gajiPokok;
        } else {
            // Bonus 10% per item
            bonusPenjualan = 0.10 * hargaItem * jumlahPenjualan;
        }

        // Menghitung gaji total
        int gajiTotal = gajiPokok + (int) bonusPenjualan;

        // Menampilkan gaji total
        System.out.println(gajiTotal);

        scanner.close();
    }
}
