import java.util.Scanner; // import harus ditempatkan di luar metode main

public class Soal5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input string A dan B
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        
        // Langkah 1: Menghitung panjang A dan B
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);
        
        // Langkah 2: Menentukan apakah A lebih besar secara leksikografis 
        //dibandingkan B
        String result = (A.compareTo(B) > 0) ? "Yes" : "No";
        System.out.println(result);
        
        // Langkah 3: Kapitalkan huruf pertama pada A dan B, lalu cetak keduanya
        //dengan dipisahkan oleh spasi
        String capitalizedA = A.substring(0, 1).toUpperCase() 
                + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase()
                + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
        
        scanner.close();
    }
}
