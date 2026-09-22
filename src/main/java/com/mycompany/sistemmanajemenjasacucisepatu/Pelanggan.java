package com.mycompany.sistemmanajemenjasacucisepatu;

public class Pelanggan {

    private String idPelanggan;
    private String namaPelanggan;
    private String noTelepon;

    public Pelanggan(String idPelanggan, String namaPelanggan, String noTelepon) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.noTelepon = noTelepon;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void tampilkanData() {
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Nama         : " + namaPelanggan);
        System.out.println("No. Telepon  : " + noTelepon);
    }
}