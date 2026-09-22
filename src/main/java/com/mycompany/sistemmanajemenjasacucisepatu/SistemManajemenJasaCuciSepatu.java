package com.mycompany.sistemmanajemenjasacucisepatu;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemManajemenJasaCuciSepatu {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    static ArrayList<Sepatu> daftarSepatu = new ArrayList<>();
    static ArrayList<Layanan> daftarLayanan = new ArrayList<>();
    static ArrayList<Booking> daftarBooking = new ArrayList<>();

    static int nomorBookingBerikutnya = 1;

    public static void main(String[] args) {


        daftarLayanan.add(new CuciReguler());
        daftarLayanan.add(new CuciExpress());
        daftarLayanan.add(new CuciPremium());

        Pelanggan p1 = new Pelanggan(
                "P001",
                "Syahla",
                "08123456789"
        );

        Pelanggan p2 = new Pelanggan(
                "P002",
                "Calaa",
                "08234567890"
        );

        daftarPelanggan.add(p1);
        daftarPelanggan.add(p2);

        Sepatu s1 = new Sepatu(
                "S001",
                "Nike Air Force 1",
                "Sneakers"
        );

        Sepatu s2 = new Sepatu(
                "S002",
                "Adidas Samba",
                "Sneakers"
        );

        daftarSepatu.add(s1);
        daftarSepatu.add(s2);

        loading("Menyiapkan sistem");

        int pilihan;

        do {

            System.out.println();
            System.out.println("============================================");
            System.out.println("      SISTEM MANAJEMEN JASA CUCI SEPATU");
            System.out.println("============================================");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat Data Pelanggan");
            System.out.println("3. Tambah Sepatu");
            System.out.println("4. Lihat Data Sepatu");
            System.out.println("5. Lihat Daftar Layanan");
            System.out.println("6. Buat Booking");
            System.out.println("7. Lihat Data Booking");
            System.out.println("8. Update Status Booking");
            System.out.println("9. Hapus Booking");
            System.out.println("10. Keluar");
            System.out.println("============================================");

            System.out.print("Pilih menu: ");

            while (!input.hasNextInt()) {

                System.out.println("Input harus berupa angka.");
                input.next();

                System.out.print("Pilih menu: ");
            }

            pilihan = input.nextInt();
            input.nextLine();

            System.out.println();

            switch (pilihan) {

                case 1:
                    tambahPelanggan();
                    break;

                case 2:
                    lihatPelanggan();
                    break;

                case 3:
                    tambahSepatu();
                    break;

                case 4:
                    lihatSepatu();
                    break;

                case 5:
                    lihatLayanan();
                    break;

                case 6:
                    buatBooking();
                    break;

                case 7:
                    lihatBooking();
                    break;

                case 8:
                    updateStatusBooking();
                    break;

                case 9:
                    hapusBooking();
                    break;

                case 10:
                    System.out.println("============================================");
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    System.out.println("============================================");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 10);

        input.close();
    }


    public static void loading(String teks) {

        System.out.print(teks);

        for (int i = 0; i < 3; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.print(".");
        }

        System.out.println();
        System.out.println("Sistem siap digunakan!");
    }

    public static void tambahPelanggan() {

        System.out.println("========================================");
        System.out.println("          TAMBAH DATA PELANGGAN");
        System.out.println("========================================");

        System.out.println("Data Pelanggan Saat Ini:");

        if (daftarPelanggan.isEmpty()) {

            System.out.println("Belum ada data pelanggan.");

        } else {

            for (Pelanggan pelanggan : daftarPelanggan) {

                System.out.println(
                        pelanggan.getIdPelanggan()
                        + " - "
                        + pelanggan.getNamaPelanggan()
                        + " - "
                        + pelanggan.getNoTelepon()
                );
            }
        }

        System.out.println();

        String idBaru = generateIdPelanggan();

        System.out.println("ID Pelanggan otomatis : " + idBaru);

        System.out.print("Nama         : ");
        String nama = input.nextLine();

        System.out.print("No. Telepon  : ");
        String telepon = input.nextLine();

        Pelanggan pelangganBaru = new Pelanggan(
                idBaru,
                nama,
                telepon
        );

        daftarPelanggan.add(pelangganBaru);

        System.out.println();
        System.out.println("Data pelanggan berhasil ditambahkan.");
    }

    public static String generateIdPelanggan() {

        int nomorTerbesar = 0;

        for (Pelanggan pelanggan : daftarPelanggan) {

            String id = pelanggan.getIdPelanggan();

            try {

                int nomor = Integer.parseInt(
                        id.substring(1)
                );

                if (nomor > nomorTerbesar) {
                    nomorTerbesar = nomor;
                }

            } catch (NumberFormatException e) {

            }
        }

        return "P"
                + String.format("%03d", nomorTerbesar + 1);
    }

    public static void lihatPelanggan() {

        System.out.println("========================================");
        System.out.println("            DATA PELANGGAN");
        System.out.println("========================================");

        if (daftarPelanggan.isEmpty()) {

            System.out.println("Belum ada data pelanggan.");

            return;
        }

        for (Pelanggan pelanggan : daftarPelanggan) {

            pelanggan.tampilkanData();

            System.out.println("----------------------------------------");
        }
    }


    public static void tambahSepatu() {

        System.out.println("========================================");
        System.out.println("             TAMBAH DATA SEPATU");
        System.out.println("========================================");

        System.out.println("Data Sepatu Saat Ini:");

        if (daftarSepatu.isEmpty()) {

            System.out.println("Belum ada data sepatu.");

        } else {

            for (Sepatu sepatu : daftarSepatu) {

                System.out.println(
                        sepatu.getIdSepatu()
                        + " - "
                        + sepatu.getNamaSepatu()
                        + " - "
                        + sepatu.getJenisSepatu()
                );
            }
        }

        System.out.println();

        String idBaru = generateIdSepatu();

        System.out.println("ID Sepatu otomatis : " + idBaru);

        System.out.print("Nama Sepatu  : ");
        String nama = input.nextLine();

        System.out.print("Jenis Sepatu : ");
        String jenis = input.nextLine();

        Sepatu sepatuBaru = new Sepatu(
                idBaru,
                nama,
                jenis
        );

        daftarSepatu.add(sepatuBaru);

        System.out.println();
        System.out.println("Data sepatu berhasil ditambahkan.");
    }

    public static String generateIdSepatu() {

        int nomorTerbesar = 0;

        for (Sepatu sepatu : daftarSepatu) {

            String id = sepatu.getIdSepatu();

            try {

                int nomor = Integer.parseInt(
                        id.substring(1)
                );

                if (nomor > nomorTerbesar) {
                    nomorTerbesar = nomor;
                }

            } catch (NumberFormatException e) {

                // Mengabaikan ID yang formatnya tidak sesuai
            }
        }

        return "S"
                + String.format("%03d", nomorTerbesar + 1);
    }

    public static void lihatSepatu() {

        System.out.println("========================================");
        System.out.println("              DATA SEPATU");
        System.out.println("========================================");

        if (daftarSepatu.isEmpty()) {

            System.out.println("Belum ada data sepatu.");

            return;
        }

        for (Sepatu sepatu : daftarSepatu) {

            sepatu.tampilkanData();

            System.out.println("----------------------------------------");
        }
    }


    public static void lihatLayanan() {

        System.out.println("========================================");
        System.out.println("             DAFTAR LAYANAN");
        System.out.println("========================================");

        for (int i = 0; i < daftarLayanan.size(); i++) {

            System.out.println("Layanan " + (i + 1));

            // POLYMORPHISM
            daftarLayanan.get(i).tampilkanLayanan();

            System.out.println("----------------------------------------");
        }
    }

    public static void buatBooking() {

        System.out.println("========================================");
        System.out.println("              BUAT BOOKING");
        System.out.println("========================================");

        if (daftarPelanggan.isEmpty()) {

            System.out.println("Belum ada data pelanggan.");

            return;
        }

        if (daftarSepatu.isEmpty()) {

            System.out.println("Belum ada data sepatu.");

            return;
        }

        String idBooking =
                "B" + String.format(
                        "%03d",
                        nomorBookingBerikutnya
                );

        nomorBookingBerikutnya++;

        System.out.println(
                "ID Booking otomatis : "
                + idBooking
        );


        System.out.println();
        System.out.println("Daftar Pelanggan:");

        for (Pelanggan pelanggan : daftarPelanggan) {

            System.out.println(
                    pelanggan.getIdPelanggan()
                    + " - "
                    + pelanggan.getNamaPelanggan()
            );
        }

        System.out.print("Masukkan ID Pelanggan: ");

        String idPelanggan = input.nextLine();

        Pelanggan pelanggan =
                cariPelanggan(idPelanggan);

        if (pelanggan == null) {

            System.out.println(
                    "Pelanggan tidak ditemukan."
            );

            return;
        }


        System.out.println();
        System.out.println("Daftar Sepatu:");

        for (Sepatu sepatu : daftarSepatu) {

            System.out.println(
                    sepatu.getIdSepatu()
                    + " - "
                    + sepatu.getNamaSepatu()
            );
        }

        System.out.print("Masukkan ID Sepatu: ");

        String idSepatu = input.nextLine();

        Sepatu sepatu =
                cariSepatu(idSepatu);

        if (sepatu == null) {

            System.out.println(
                    "Sepatu tidak ditemukan."
            );

            return;
        }

        System.out.println();
        System.out.println("Daftar Layanan:");

        for (int i = 0;
                i < daftarLayanan.size();
                i++) {

            Layanan layanan =
                    daftarLayanan.get(i);

            System.out.println(
                    (i + 1)
                    + ". "
                    + layanan.getNamaLayanan()
                    + " - Rp"
                    + String.format(
                            "%.0f",
                            layanan.getHarga()
                    )
            );
        }

        System.out.print("Pilih layanan: ");

        while (!input.hasNextInt()) {

            System.out.println(
                    "Pilihan harus berupa angka."
            );

            input.next();

            System.out.print(
                    "Pilih layanan: "
            );
        }

        int pilihanLayanan =
                input.nextInt();

        input.nextLine();

        if (pilihanLayanan < 1
                || pilihanLayanan
                > daftarLayanan.size()) {

            System.out.println(
                    "Pilihan layanan tidak tersedia."
            );

            return;
        }

        Layanan layanan =
                daftarLayanan.get(
                        pilihanLayanan - 1
                );
        loading("Memproses booking");

        Booking booking =
                new Booking(
                        idBooking,
                        pelanggan,
                        sepatu,
                        layanan
                );

        daftarBooking.add(booking);

        System.out.println();
        System.out.println(
                "Booking berhasil dibuat!"
        );

        System.out.println(
                "ID Booking : "
                + idBooking
        );

        System.out.println(
                "Tanggal     : otomatis"
        );

        System.out.println(
                "Status     : Diproses"
        );
    }

    public static Pelanggan cariPelanggan(
            String id) {

        for (Pelanggan pelanggan :
                daftarPelanggan) {

            if (pelanggan
                    .getIdPelanggan()
                    .equalsIgnoreCase(id)) {

                return pelanggan;
            }
        }

        return null;
    }

    public static Sepatu cariSepatu(
            String id) {

        for (Sepatu sepatu :
                daftarSepatu) {

            if (sepatu
                    .getIdSepatu()
                    .equalsIgnoreCase(id)) {

                return sepatu;
            }
        }

        return null;
    }

    public static void lihatBooking() {

        System.out.println("========================================");
        System.out.println("              DATA BOOKING");
        System.out.println("========================================");

        if (daftarBooking.isEmpty()) {

            System.out.println(
                    "Belum ada booking."
            );

            return;
        }

        for (Booking booking :
                daftarBooking) {

            booking.tampilkanBooking();

            System.out.println();
        }
    }

    public static void updateStatusBooking() {

        System.out.println("========================================");
        System.out.println("          UPDATE STATUS BOOKING");
        System.out.println("========================================");

        if (daftarBooking.isEmpty()) {

            System.out.println(
                    "Belum ada booking."
            );

            return;
        }

        System.out.println(
                "Daftar Booking:"
        );

        for (Booking booking :
                daftarBooking) {

            System.out.println(
                    booking.getIdBooking()
                    + " - Status: "
                    + booking.getStatus()
            );
        }

        System.out.println();

        System.out.print(
                "Masukkan ID Booking: "
        );

        String idBooking =
                input.nextLine();

        Booking booking =
                cariBooking(idBooking);

        if (booking == null) {

            System.out.println(
                    "Booking tidak ditemukan."
            );

            return;
        }

        System.out.println();

        System.out.println(
                "Status saat ini: "
                + booking.getStatus()
        );

        System.out.println();

        System.out.println(
                "Pilih Status Baru:"
        );

        System.out.println(
                "1. Diproses"
        );

        System.out.println(
                "2. Selesai"
        );

        System.out.println(
                "3. Diambil"
        );

        System.out.print(
                "Pilihan: "
        );

        while (!input.hasNextInt()) {

            System.out.println(
                    "Pilihan harus berupa angka."
            );

            input.next();

            System.out.print(
                    "Pilihan: "
            );
        }

        int pilihan =
                input.nextInt();

        input.nextLine();

        String statusBaru;

        if (pilihan == 1) {

            statusBaru =
                    "Diproses";

        } else if (pilihan == 2) {

            statusBaru =
                    "Selesai";

        } else if (pilihan == 3) {

            statusBaru =
                    "Diambil";

        } else {

            System.out.println(
                    "Pilihan status tidak tersedia."
            );

            return;
        }

        booking.ubahStatus(
                statusBaru
        );

        System.out.println();

        System.out.println(
                "Status booking berhasil "
                + "diubah menjadi "
                + statusBaru + "."
        );
    }


    public static Booking cariBooking(
            String id) {

        for (Booking booking :
                daftarBooking) {

            if (booking
                    .getIdBooking()
                    .equalsIgnoreCase(id)) {

                return booking;
            }
        }

        return null;
    }


    public static void hapusBooking() {

        System.out.println("========================================");
        System.out.println("             HAPUS BOOKING");
        System.out.println("========================================");

        if (daftarBooking.isEmpty()) {

            System.out.println(
                    "Belum ada booking."
            );

            return;
        }

        System.out.println(
                "Daftar Booking:"
        );

        for (Booking booking :
                daftarBooking) {

            System.out.println(
                    booking.getIdBooking()
                    + " - Status: "
                    + booking.getStatus()
            );
        }

        System.out.println();

        System.out.print(
                "Masukkan ID Booking: "
        );

        String idBooking =
                input.nextLine();

        Booking booking =
                cariBooking(idBooking);

        if (booking == null) {

            System.out.println(
                    "Booking tidak ditemukan."
            );

            return;
        }

        if (!booking
                .getStatus()
                .equalsIgnoreCase("Diambil")) {

            System.out.println();

            System.out.println(
                    "Booking belum dapat dihapus."
            );

            System.out.println(
                    "Status saat ini: "
                    + booking.getStatus()
            );

            System.out.println(
                    "Booking hanya dapat dihapus "
                    + "jika statusnya Diambil."
            );

            return;
        }

        daftarBooking.remove(
                booking
        );

        System.out.println();

        System.out.println(
                "Booking "
                + idBooking
                + " berhasil dihapus."
        );
    }
}