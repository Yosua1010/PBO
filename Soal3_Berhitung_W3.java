import java.util.Scanner;

public class Soal3_Berhitung_W3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input sebagai satu baris
        String input = scanner.nextLine();

        // Memisahkan input menjadi bilangan A, operator, dan bilangan B
        String[] parts = input.split(" ");
        int A = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int B = Integer.parseInt(parts[2]);

        // Menghitung hasil berdasarkan operator
        int hasil = 0;

        if (operator.equals("+")) {
            hasil = A + B;
        } else if (operator.equals("-")) {
            hasil = A - B;
        } else if (operator.equals("*")) {
            hasil = A * B;
        } else if (operator.equals("/")) {
            hasil = A / B;
        } else if (operator.equals("%")) {
            hasil = A % B;
        }

        // Menampilkan hasil
        System.out.println(hasil);

        scanner.close();
    }
}
