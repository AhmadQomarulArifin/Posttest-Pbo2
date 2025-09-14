# Posttest-Pbo2

# Program CRUD Klinik Hewan Peliharaan

Deskripsi Program

Program ini adalah aplikasi manajemen data hewan peliharaan di klinik yang dikembangkan dengan bahasa pemrograman Java menggunakan pendekatan Model-View-Controller (MVC). Program ini menerapkan konsep OOP seperti constructor, access modifier, package, dan validasi input.


###  terdapat 3 Class
- **Main** (`com.mycompany.klinikhewan.main`) → berisi menu utama.  
- **HewanService** (`com.mycompany.klinikhewan.service`) → berisi logika CRUD dan search.  
- **Hewan** (`com.mycompany.klinikhewan.model`) → berisi struktur data hewan.  

###  terdapat 6 Properties
Class `Hewan` memiliki **6 properti**:  
- `namaPemilik`  
- `noHP`  
- `namaHewan`  
- `jenisHewan`  
- `umurHewan`  
- `keluhan`  

### Menerapkan Constructor
Class `Hewan` memiliki constructor untuk inisialisasi data:
```java
public Hewan(String namaPemilik, String noHP, String namaHewan, String jenisHewan, int umurHewan, String keluhan) {
    this.namaPemilik = namaPemilik;
    this.noHP = noHP;
    this.namaHewan = namaHewan;
    this.jenisHewan = jenisHewan;
    this.umurHewan = umurHewan;
    this.keluhan = keluhan;
}

### Access Modifier
- Properti class Hewan dibuat private.
- Akses data menggunakan getter & setter public.
- Class juga menggunakan public.

### Struktur packages
src/com/mycompany/klinikhewan/
 ├── main/
 │    └── Main.java       (menu utama)
 ├── model/
 │    └── Hewan.java      (data hewan)
 └── service/
      └── HewanService.java (logika CRUD)

### MVC
- Model → Class Hewan yang merepresentasikan struktur data dengan properti, constructor, getter, dan setter.
- View → Class Main yang menangani tampilan menu utama pengguna dan input/output.
- Controller (Service) → Class HewanService yang menangani logika bisnis dan operasi CRUD.

### Validasi Input
Nomor HP tidak boleh kosong.
Umur hewan harus lebih dari 0.

### Fitur Search
Method cariHewan() memungkinkan pencarian data berdasarkan nama hewan (case-insensitive).

# Alur Program

Program memiliki 6 pilihan menu:




<img width="899" height="282" alt="image" src="https://github.com/user-attachments/assets/42cb1082-c1ed-4527-83d4-f9f440dc9d89" />








1. menu pertama yaitu tambah data, pada bagian ini user bakal diminta untuk mengisi data data seperti nama pemilik,nomor hp pemilik,nama hewan,jenis hewan,umur hewan, dan keluhan.











<img width="896" height="282" alt="image" src="https://github.com/user-attachments/assets/68cc6914-2822-4139-ae29-11dbe2d7eb89" />





2. menu yang kedua adalah lihat data, dimenu ini program bakal menampilkan semua data yang sudah di tambahkan.






<img width="728" height="212" alt="image" src="https://github.com/user-attachments/assets/ab16d0d3-e48b-4012-84ab-246c67d31f53" />





dan ini adalah tampilan menu ke 2 jika data belum ada









<img width="315" height="208" alt="image" src="https://github.com/user-attachments/assets/47be438a-d36f-4c5f-9685-ebd0429d8fb0" />











3.menu yang ketiga adalah ubah data, jadi pada menu ini user memilih nomor mana yang akan diubah, kemudian user mengubah datanya








<img width="839" height="338" alt="image" src="https://github.com/user-attachments/assets/d9854d6e-96f9-41a7-ada1-d356322a37be" />




tampilan menu ke 3 jika nomor yang diinput tidak ada di data







<img width="644" height="235" alt="image" src="https://github.com/user-attachments/assets/e1724a57-887b-4cc2-baa0-073299e15175" />









4. menu yang keempat adalah hapus data, jadi dimenu ini user dapat menghapus data dengan memilih nomor yang ingin dihapus.






<img width="654" height="251" alt="image" src="https://github.com/user-attachments/assets/9d859734-f36f-4604-9415-e377806c9886" />








tampilan menu ke 4 jika data belum ada







<img width="836" height="211" alt="image" src="https://github.com/user-attachments/assets/90f6000b-f77d-450d-8fff-4718e7113535" />









tampilan menu ke 4 jika data yang mau di hapus tidak ada dalam data








<img width="749" height="241" alt="image" src="https://github.com/user-attachments/assets/27d67305-26ff-485a-b5eb-9563cc10c941" />










<img width="350" height="218" alt="image" src="https://github.com/user-attachments/assets/ab4fb259-c356-451e-a0eb-30840f8a60a1" />









5. menu yang kelima adalah cari data hewan jadi disini user bisa mencari data hewan dengan menuliskan nama hewannya











<img width="628" height="192" alt="image" src="https://github.com/user-attachments/assets/b97d7f84-cff8-4e5b-9af0-3483099797fc" />







6. menu ke enam adalah keluar,  jika user memilih menu ini maka program yang dijalankan akan selesai.








<img width="531" height="277" alt="image" src="https://github.com/user-attachments/assets/a5bbe51a-62e3-4a0f-b79c-e6f30246cf52" />







jika user memilih angka 7 atau seterusnya maka pilihan tidak valid








<img width="426" height="173" alt="image" src="https://github.com/user-attachments/assets/7901e848-0ce1-4c73-a47a-06a3e3323b44" />











Program hanya akan berhenti jika user memilih menu Keluar (pilihan nomor 6).








