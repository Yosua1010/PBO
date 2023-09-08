import java.util.Scanner;

public class Soal2_InputOutput2_W3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input secara berulang sampai tidak ada input lagi
        while (scanner.hasNext()) {
            String str = scanner.next();
            int num = scanner.nextInt();

            // Mencetak output dengan format yang sesuai
            System.out.printf("%-15s%03d%n", str, num);
        }

        scanner.close();
    }
}
