package com.mycompany.sistemmanajemenjasacucisepatu;

public class Layanan {

    protected String namaLayanan;
    protected double harga;
    protected int estimasiHari;

    public Layanan(String namaLayanan, double harga, int estimasiHari) {
        this.namaLayanan = namaLayanan;
        this.harga = harga;
        this.estimasiHari = estimasiHari;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public double getHarga() {
        return harga;
    }

    public int getEstimasiHari() {
        return estimasiHari;
    }

    public void tampilkanLayanan() {
        System.out.println("Nama Layanan : " + namaLayanan);
        System.out.println("Harga        : Rp" + String.format("%.0f", harga));
        System.out.println("Estimasi     : " + estimasiHari + " hari");
    }
}