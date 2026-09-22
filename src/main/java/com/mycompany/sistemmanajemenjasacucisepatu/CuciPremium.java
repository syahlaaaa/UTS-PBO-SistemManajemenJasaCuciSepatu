package com.mycompany.sistemmanajemenjasacucisepatu;

public class CuciPremium extends CuciExpress {

    public CuciPremium() {
        super();

        namaLayanan = "Cuci Premium";
        harga = 75000;
        estimasiHari = 1;
    }

    @Override
    public void tampilkanLayanan() {
        System.out.println("Jenis Layanan : Cuci Premium");
        System.out.println("Harga         : Rp" + String.format("%.0f", harga));
        System.out.println("Estimasi      : " + estimasiHari + " hari");
    }
}