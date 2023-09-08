

// Mengimpor pustaka (library) Scanner dari Java untuk penggunaan input
import java.util.Scanner;

// Mendefinisikan kelas (class) utama bernama Soal5
public class Soal5_BukaTutupJalan_W3 {

    // Metode (method) utama yang akan dieksekusi saat program dijalankan
    public static void main(String [] args){
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input dari pengguna dalam satu baris
        String input = scanner.nextLine();
        
        // Menutup objek Scanner setelah selesai digunakan
        scanner.close();
        
        // Memisahkan plat nomor mobil menjadi array dengan spasi sebagai pemisah
        String[] platNumbers = input.split(" ");
        
        // Variabel untuk menyimpan total plat nomor mobil
        int total = 0;
        
        // Melakukan iterasi (perulangan) untuk menghitung total plat nomor mobil
        for (String platNumber : platNumbers) {
            // Mengonversi plat nomor ke tipe data integer
            int number = Integer.parseInt(platNumber);
            // Menambahkan nilai plat nomor ke total
            total += number;
        }
        
        // Memeriksa apakah total tersebut memenuhi syarat untuk berhenti atau tidak
        if ((total - 999999) % 5 == 0) {
            // Jika syarat terpenuhi, mencetak "Berhenti"
            System.out.println("Berhenti");
        } else {
            // Jika syarat tidak terpenuhi, mencetak "Jalan"
            System.out.println("Jalan");
        }
    }
}
