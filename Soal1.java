 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.soal1;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Soal1 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Membaca jumlah kasus uji

        for (int i = 0; i < T; i++) {
            try {
                long n = scanner.nextLong(); // Membaca input integer

                System.out.println(n + " can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // Tidak perlu mengecek range untuk long, karena n sudah bertipe long
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    
    


    }
    
}

