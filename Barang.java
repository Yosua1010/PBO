package com.mycompany.barang;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    // Getter untuk mendapatkan nilai nama_barang
    public String getNama() {
        return nama_barang;
    }

    // Getter untuk mendapatkan nilai stok
    public int getStok() {
        return stok;
    }

    // Setter untuk mengubah nilai stok dengan penambahan
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah penambahan stok harus lebih dari 0.");
        }
    }

    // Setter untuk mengubah nilai stok dengan pengurangan
    public void kurangStok(int jumlah) {
        if (jumlah > 0 && jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Jumlah pengurangan stok tidak valid.");
        }
    }

    public static void main(String[] args) {
        //  penggunaan class Barang
        Barang barang = new Barang("001", "Baju", 10);
        System.out.println("Nama Barang: " + barang.getNama());
        System.out.println("Stok Barang: " + barang.getStok());
        barang.tambahStok(20);
        System.out.println("Stok Barang Setelah Penambahan: " + barang.getStok());
    }
}
