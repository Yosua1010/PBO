import java.math.BigInteger;
import java.util.Scanner;

public class Soal6_BigNumber_W3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca dua angka sebagai string
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // Membuat objek BigInteger dari string input
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        // Menjumlahkan num1 dan num2
        BigInteger sum = num1.add(num2);

        // Mengalikan num1 dan num2
        BigInteger product = num1.multiply(num2);

        // Menampilkan hasil penjumlahan dan perkalian
        System.out.println(sum.toString());
        System.out.println(product.toString());

        scanner.close();
    }
}
