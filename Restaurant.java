/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurant;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private Map<String, Double> menuMakanan;  // Menyimpan menu makanan dan harganya
    private Map<String, Integer> stokMakanan; // Menyimpan stok makanan

    public Restaurant() {
        menuMakanan = new HashMap<>();
        stokMakanan = new HashMap<>();
    }

    // Menambahkan menu makanan ke dalam daftar menu
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        menuMakanan.put(nama, harga);
        stokMakanan.put(nama, stok);
    }

    // Menampilkan menu makanan yang tersedia beserta stoknya
    public void tampilMenuMakanan() {
        for (Map.Entry<String, Double> entry : menuMakanan.entrySet()) {
            String nama = entry.getKey();
            double harga = entry.getValue();
            int stok = stokMakanan.get(nama);

            if (stok > 0) {
                System.out.println(nama + "[" + stok + "]" + "\tRp. " + harga);
            }
        }
    }

    // Melakukan pemesanan makanan dengan mengurangi stok jika tersedia
    public boolean pesanMakanan(String nama) {
        if (menuMakanan.containsKey(nama)) {
            int stok = stokMakanan.get(nama);
            if (stok > 0) {
                stokMakanan.put(nama, stok - 1);
                return true; // Pesanan berhasil
            }
        }
        return false; // Pesanan gagal
    }

    // Mengurangi stok makanan berdasarkan nama menu dan jumlah yang dipesan
    public void kurangiStok(String nama, int jumlah) {
        if (stokMakanan.containsKey(nama)) {
            int stok = stokMakanan.get(nama);
            if (stok >= jumlah) {
                stokMakanan.put(nama, stok - jumlah);
            } else {
                System.out.println("Stok tidak mencukupi.");
            }
        } else {
            System.out.println("Menu tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        // Menambahkan menu makanan ke dalam daftar menu
        menu.tambahMenuMakanan("Bala-Bala", 1000, 20);
        menu.tambahMenuMakanan("Gehu", 1000, 20);
        menu.tambahMenuMakanan("Tahu", 1000, 0);
        menu.tambahMenuMakanan("Molen", 1000, 20);

        // Menampilkan menu makanan yang tersedia
        menu.tampilMenuMakanan();

        // pemesanan
        if (menu.pesanMakanan("Bala-Bala")) {
            System.out.println("Pesanan Bala-Bala berhasil.");
        } else {
            System.out.println("Pesanan Bala-Bala gagal.");
        }

        //  mengurangi stok
        menu.kurangiStok("Bala-Bala", 2);
        menu.tampilMenuMakanan();
    }
}
