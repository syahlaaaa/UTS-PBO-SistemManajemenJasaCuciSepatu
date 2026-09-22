package com.mycompany.sistemmanajemenjasacucisepatu;

public class CuciExpress extends Layanan {

    public CuciExpress() {
        super("Cuci Express", 50000, 1);
    }

    @Override
    public void tampilkanLayanan() {
        System.out.println("Jenis Layanan : Cuci Express");
        System.out.println("Harga         : Rp" + String.format("%.0f", harga));
        System.out.println("Estimasi      : " + estimasiHari + " hari");
    }
}