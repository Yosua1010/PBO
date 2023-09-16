package com.mycompany.kelassatu;

public class KelasSatu {
    public KelasSatu(int i) {
        System.out.println(3);
    }

    public KelasSatu() {
        System.out.println(4);
    }

    public void printTen() {
        System.out.println(10);
    }

    public static void main(String[] args) {
        System.out.println(2);
        KelasSatu satu = new KelasSatu();
        KelasSatu dua = new KelasSatu(10);
        satu.printTen();
    }
}
