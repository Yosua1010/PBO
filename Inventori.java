/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.inventori;

import com.mycompany.barang.Barang;

public class Inventori {
    Barang[] barangs;

    public Inventori() {
        // Inisialisasi barang pada saat pembuatan objek Inventori
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    public void showBarang() {
        for (Barang barang : barangs) {
            System.out.printf("%s (%d)%n", barang.getNama(), barang.getStok());
        }
    }

    public void pengadaan() {
        // Tambahkan stok barang langsung pada saat inisialisasi
        barangs[0].tambahStok(20);
        barangs[0].kurangStok(10);
        barangs[1].tambahStok(30);

        // Tampilkan stok barang
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
