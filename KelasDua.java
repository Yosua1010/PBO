package com.mycompany.kelassatu;

public class KelasDua {
    {
        System.out.println(5);
    }

    public static void main(String[] args) {
        System.out.println(6);
        KelasSatu satu = new KelasSatu();
        KelasSatu dua = new KelasSatu(10);
        satu.printTen();
    }
}
