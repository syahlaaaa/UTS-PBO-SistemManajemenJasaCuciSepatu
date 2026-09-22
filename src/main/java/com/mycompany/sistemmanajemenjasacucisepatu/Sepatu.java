package com.mycompany.sistemmanajemenjasacucisepatu;

public class Sepatu {

    private String idSepatu;
    private String namaSepatu;
    private String jenisSepatu;

    public Sepatu(String idSepatu, String namaSepatu, String jenisSepatu) {
        this.idSepatu = idSepatu;
        this.namaSepatu = namaSepatu;
        this.jenisSepatu = jenisSepatu;
    }

    public String getIdSepatu() {
        return idSepatu;
    }

    public String getNamaSepatu() {
        return namaSepatu;
    }

    public String getJenisSepatu() {
        return jenisSepatu;
    }

    public void tampilkanData() {
        System.out.println("ID Sepatu    : " + idSepatu);
        System.out.println("Nama Sepatu  : " + namaSepatu);
        System.out.println("Jenis Sepatu : " + jenisSepatu);
    }
}