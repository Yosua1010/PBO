import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        // Memecah string input menjadi token menggunakan ekspresi reguler
        String[] tokens = s.split("[^A-Za-z]+");

        // Menampilkan jumlah token
        System.out.println(tokens.length);

        // Menampilkan setiap token di baris baru
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }

        scanner.close();
    }
}
