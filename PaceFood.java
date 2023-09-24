/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pacefood;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Scanner;

class Produk {
    String namaProduk;
    double harga;
    int qty;

    public Produk(String namaProduk, double harga, int qty) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.qty = qty;
    }

    public double getTotalHarga() {
        return harga * qty;
    }
}

class Penjualan {
    ArrayList<Produk> pesanan = new ArrayList<>();

    public void tambahPesanan(Produk produk) {
        pesanan.add(produk);
    }

    public double getTotalBayar() {
        double totalBayar = 0;
        for (Produk produk : pesanan) {
            totalBayar += produk.getTotalHarga();
        }
        return totalBayar;
    }
}

public class PaceFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penjualan penjualan = new Penjualan();

        // Menampilkan menu makanan beserta harga (minimal 12 produk)
        System.out.println("Menu Makanan:");
        System.out.println("1. Nasi Goreng - Rp. 20,000");
        System.out.println("2. Mie Goreng - Rp. 18,000");
        System.out.println("3. Ayam Goreng - Rp. 25,000");
        System.out.println("4. Sate Ayam - Rp. 30,000");
        System.out.println("5. Soto Ayam - Rp. 22,000");
        System.out.println("6. Nasi Kuning - Rp. 18,000");
        System.out.println("7. Bakso - Rp. 15,000");
        System.out.println("8. Rendang - Rp. 28,000");
        System.out.println("9. Nasi Uduk - Rp. 21,000");
        System.out.println("10. Sate Padang - Rp. 35,000");
        System.out.println("11. Sop Iga - Rp. 24,000");
        System.out.println("12. Capcay - Rp. 17,000");

        while (true) {
            System.out.print("Pilih nomor menu (0 untuk selesai): ");
            int nomorMenu = scanner.nextInt();
            if (nomorMenu == 0) {
                break;
            }

            // Validasi nomor menu
            if (nomorMenu < 1 || nomorMenu > 12) {
                System.out.println("Menu tidak valid.");
                continue;
            }

            // Input jumlah pesanan
            System.out.print("Jumlah pesanan: ");
            int qty = scanner.nextInt();

            // Tambahkan pesanan ke Penjualan
            switch (nomorMenu) {
                case 1:
                    penjualan.tambahPesanan(new Produk("Nasi Goreng", 20000, qty));
                    break;
                case 2:
                    penjualan.tambahPesanan(new Produk("Mie Goreng", 18000, qty));
                    break;
                case 3:
                    penjualan.tambahPesanan(new Produk("Ayam Goreng", 25000, qty));
                    break;
                case 4:
                    penjualan.tambahPesanan(new Produk("Sate Ayam", 30000, qty));
                    break;
                case 5:
                    penjualan.tambahPesanan(new Produk("Soto Ayam", 22000, qty));
                    break;
                case 6:
                    penjualan.tambahPesanan(new Produk("Nasi Kuning", 18000, qty));
                    break;
                case 7:
                    penjualan.tambahPesanan(new Produk("Bakso", 15000, qty));
                    break;
                case 8:
                    penjualan.tambahPesanan(new Produk("Rendang", 28000, qty));
                    break;
                case 9:
                    penjualan.tambahPesanan(new Produk("Nasi Uduk", 21000, qty));
                    break;
                case 10:
                    penjualan.tambahPesanan(new Produk("Sate Padang", 35000, qty));
                    break;
                case 11:
                    penjualan.tambahPesanan(new Produk("Sop Iga", 24000, qty));
                    break;
                case 12:
                    penjualan.tambahPesanan(new Produk("Capcay", 17000, qty));
                    break;
            }
        }

        // Menampilkan pesanan dan total bayar
        System.out.println("Pesanan Anda:");
        for (Produk produk : penjualan.pesanan) {
            System.out.println(produk.namaProduk + " x" + produk.qty + " - Rp. " + produk.getTotalHarga());
        }
        System.out.println("Total Bayar: Rp. " + penjualan.getTotalBayar());

        // Konfirmasi pesanan lain
        System.out.print("Apakah Anda ingin memesan item makanan lain? (ya/tidak): ");
        String pesanLagi = scanner.next();
        if (pesanLagi.equalsIgnoreCase("tidak")) {
            System.out.println("Terima kasih telah memesan!");
        }
    }
}
