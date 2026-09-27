### 👟 Sistem Manajemen Jasa Cuci Sepatu

 🧼 Aplikasi sederhana berbasis Java untuk membantu mengelola layanan jasa cuci sepatu.
 ### 👤 Identitas
 | Data | Keterangan |
|---|---|
| 👩 Nama | **Dliya Syahla Hariyanto** |
| 🆔 NIM | **2509116095** |
| 📚 Program Studi | **Sistem Informasi** |
| 📖 Mata Kuliah | **Pemrograman Berorientasi Objek (PBO)** |
| 💻 Bahasa Pemrograman | **Java** |
| 🛠️ IDE | **NetBeans** |

### 📌 Tentang Project

**Sistem Manajemen Jasa Cuci Sepatu** merupakan program berbasis Java yang dibuat untuk membantu mengelola proses jasa cuci sepatu secara sederhana.

Program ini dapat digunakan untuk mengelola data pelanggan, data sepatu, daftar layanan, serta booking jasa cuci sepatu. Pengguna dapat menambahkan data pelanggan dan sepatu, melihat daftar layanan, membuat booking, melihat data booking, mengubah status booking, serta menghapus booking yang sudah selesai diambil.

Program ini dibuat dengan menerapkan beberapa konsep dasar Pemrograman Berorientasi Objek (PBO), seperti class dan object, constructor, encapsulation, ArrayList, inheritance, polymorphism, method overriding, percabangan, dan perulangan.

### 📌 Studi Kasus

Studi kasus yang digunakan adalah **Sistem Manajemen Jasa Cuci Sepatu**.

Sistem menggambarkan proses sederhana pada jasa cuci sepatu, mulai dari pendataan pelanggan dan sepatu hingga proses booking layanan.

Pada saat membuat booking, pengguna dapat memilih pelanggan, sepatu, dan jenis layanan yang tersedia. Setiap booking memiliki status proses, yaitu:

**Diproses - Selesai - Diambil**

Booking yang sudah berstatus **Diambil** dapat dihapus dari sistem.

Program juga menyediakan beberapa jenis layanan, yaitu:

- Cuci Reguler
- Cuci Express
- Cuci Premium

Setiap layanan memiliki harga dan estimasi waktu pengerjaan yang berbeda.

---

Aplikasi ini dibuat dengan menerapkan konsep **Object-Oriented Programming (OOP)**, seperti:

- 🧩 Class dan Object
- 🔐 Encapsulation
- 🏗️ Constructor
- 📚 ArrayList
- 🔄 Inheritance
- 🔍 Method
- 🛡️ Input Validation

### ⚙️ Fitur Program

Program memiliki beberapa menu utama:

1. Tambah Pelanggan
2. Lihat Data Pelanggan
3. Tambah Sepatu
4. Lihat Data Sepatu
5. Lihat Daftar Layanan
6. Buat Booking
7. Lihat Data Booking
8. Update Status Booking
9. Hapus Booking
10. Keluar

ID pelanggan, ID sepatu, dan ID booking dibuat secara otomatis oleh sistem.

Tanggal booking juga dibuat secara otomatis berdasarkan tanggal saat booking dibuat.

---

### 1. Class dan Object

Program menggunakan beberapa class yang mewakili objek dalam sistem, yaitu:

- `Pelanggan`
- `Sepatu`
- `Layanan`
- `CuciReguler`
- `CuciExpress`
- `CuciPremium`
- `Booking`

Setiap class memiliki atribut dan method sesuai dengan fungsi masing-masing.

---

### 2. Encapsulation

Encapsulation diterapkan dengan menggunakan access modifier `private` pada atribut class dan menyediakan getter untuk mengakses data tersebut.

Contohnya pada class `Pelanggan`:

```java
private String idPelanggan;
private String namaPelanggan;
private String noTelepon;
```
Data tersebut tidak diakses secara langsung dari luar class.

### 3. Constructor

Constructor digunakan untuk memberikan nilai awal ketika object dibuat.

Contohnya:
```
public Pelanggan(String idPelanggan, String namaPelanggan, String noTelepon) {
    this.idPelanggan = idPelanggan;
    this.namaPelanggan = namaPelanggan;
    this.noTelepon = noTelepon;
}
```
4. ArrayList

ArrayList digunakan untuk menyimpan data yang ada di dalam program.

Contohnya:
```
ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
ArrayList<Sepatu> daftarSepatu = new ArrayList<>();
ArrayList<Layanan> daftarLayanan = new ArrayList<>();
ArrayList<Booking> daftarBooking = new ArrayList<>();
```

Dengan ArrayList, data dapat ditambahkan dan ditampilkan selama program berjalan.

### 🔄 Inheritance

Program menerapkan dua tipe inheritance, yaitu **Hierarchical Inheritance** dan **Multilevel Inheritance**.

<img width="545" height="428" alt="image" src="https://github.com/user-attachments/assets/6fc4cfb7-c55a-4d55-9c5d-d5e09078c00d" />

- **Hierarchical Inheritance:** `Layanan` diturunkan menjadi `CuciReguler` dan `CuciExpress`.
- **Multilevel Inheritance:** `Layanan` → `CuciExpress` → `CuciPremium`.

### 🔁 6. Polymorphism

Polymorphism diterapkan menggunakan method overriding.

Method:
```
tampilkanLayanan()
```
yang terdapat pada class Layanan dioverride pada class:

CuciReguler
CuciExpress
CuciPremium

Contohnya:
```
@Override
public void tampilkanLayanan() {
    System.out.println("Cuci Reguler");
}
```
Object dari beberapa subclass tersebut dapat disimpan dalam:
```
ArrayList<Layanan>
```
Kemudian method tampilkanLayanan() dipanggil sesuai dengan object yang digunakan.

.

### 🔀 7. Condition (If-Else)

Percabangan if-else digunakan untuk menentukan kondisi tertentu dalam program.

Contohnya pada proses update status booking:
```
if (pilihan == 1) {
    booking.ubahStatus("Diproses");
} else if (pilihan == 2) {
    booking.ubahStatus("Selesai");
} else if (pilihan == 3) {
    booking.ubahStatus("Diambil");
}
```
Percabangan juga digunakan untuk melakukan validasi dan menentukan apakah booking dapat dihapus atau belum.

### 🔁 8. Looping

Program menggunakan perulangan untuk menampilkan data dan menjalankan menu secara berulang.

Perulangan for digunakan untuk menampilkan data dalam ArrayList.

Contohnya:
```
for (Pelanggan p : daftarPelanggan) {
    p.tampilkanData();
}
```
Sedangkan do-while digunakan agar menu utama terus ditampilkan sampai pengguna memilih menu keluar.
```
do {
    tampilkanMenu();
    // proses menu
} while (pilihan != 10);
```
### 🗂️ Dummy Data

Program memiliki beberapa dummy data sebagai data awal agar fitur dapat langsung diuji ketika program dijalankan.

Dummy data yang tersedia antara lain:

# Data Pelanggan
P001 - Syahla
P002 - Alya
# Data Sepatu
S001 - Nike Air Force 1
S002 - Adidas Samba
# Data Layanan
Cuci Reguler
Cuci Express
Cuci Premium

Data booking tidak dibuat sebagai dummy data. Booking dibuat oleh pengguna melalui menu Buat Booking.

### 🔄 Alur Program

Alur penggunaan program adalah sebagai berikut:
<img width="870" height="695" alt="image" src="https://github.com/user-attachments/assets/646c0791-df61-4fc4-a7f8-e9b355a12558" />

### 📸 Penjelasan Output Program
## 1. Tambah Pelanggan

<img width="378" height="265" alt="image" src="https://github.com/user-attachments/assets/b6da2e3b-dc2a-4869-9fc8-5a8a559a63ed" />

Menampilkan seluruh menu yang tersedia dalam sistem, mulai dari pengelolaan pelanggan hingga menu keluar.

## 2.Lihat Data Pelanggan

<img width="422" height="316" alt="image" src="https://github.com/user-attachments/assets/58cf0301-0b41-412f-a4fd-43fbd2ceb92e" />

Menampilkan seluruh data pelanggan yang tersimpan dalam ArrayList.

## 3.Tambah Data Sepatu

<img width="383" height="262" alt="image" src="https://github.com/user-attachments/assets/35c9d8bf-a347-471f-b069-20f15737e3bf" />

Digunakan untuk menambahkan data sepatu baru. ID sepatu dibuat secara otomatis.

## 4.Lihat Data Sepatu

<img width="393" height="322" alt="image" src="https://github.com/user-attachments/assets/20abe321-7a78-415d-aafe-698a1f2b0975" />

Menampilkan data sepatu yang telah tersimpan.

## 5.Daftar Layanan

<img width="417" height="385" alt="image" src="https://github.com/user-attachments/assets/f206a864-a1b8-4fff-8f6b-b8c84e1617aa" />

Menampilkan layanan yang tersedia beserta harga dan estimasi pengerjaan.

Layanan yang tersedia yaitu Cuci Reguler, Cuci Express, dan Cuci Premium.

## 6.Buat Booking

<img width="415" height="616" alt="image" src="https://github.com/user-attachments/assets/eb4b3ea7-be43-4ea1-806e-0753ee9c7cb5" />

Digunakan untuk membuat booking dengan memilih pelanggan, sepatu, dan layanan.

ID booking dan tanggal booking dibuat secara otomatis oleh sistem.

Status awal booking adalah Diproses.

## 7. Lihat Data Booking

<img width="442" height="370" alt="image" src="https://github.com/user-attachments/assets/464d5fb8-0bc7-4e76-a0fa-12426b39e9f3" />

Menampilkan data booking yang telah dibuat, termasuk pelanggan, sepatu, layanan, harga, tanggal, dan status booking.

## 8.Update Status Booking

<img width="477" height="367" alt="image" src="https://github.com/user-attachments/assets/1e8c65d2-22a7-463c-b2c7-19faa4e94233" />

Digunakan untuk mengubah status booking sesuai dengan proses pengerjaan.

Status booking terdiri dari:

-Diproses
-Selesai
-Diambil

## 9.Hapus Booking

<img width="385" height="205" alt="image" src="https://github.com/user-attachments/assets/567200d5-4107-4aa0-a5be-f5ee864b655b" />

Booking hanya dapat dihapus apabila statusnya sudah Diambil.

## 10. Keluar dari program

<img width="700" height="216" alt="image" src="https://github.com/user-attachments/assets/f0948c70-4c1d-4215-8989-acea793886b2" />

Menu ini digunakan untuk mengakhiri program.



struktur yang sudah tersedia pada class Layanan tanpa membuat ulang
class dasar layanan.
