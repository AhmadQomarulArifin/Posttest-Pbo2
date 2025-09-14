/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.klinikhewan.main;

/**
 *
 * @author qomarul
 */
import com.mycompany.klinikhewan.service.HewanService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HewanService service = new HewanService();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU KLINIK HEWAN ===");
            System.out.println("1. Tambah Data Hewan");
            System.out.println("2. Lihat Data Hewan");
            System.out.println("3. Ubah Data Hewan");
            System.out.println("4. Hapus Data Hewan");
            System.out.println("5. Cari Data Hewan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> service.tambahHewan();
                case 2 -> service.lihatHewan();
                case 3 -> service.ubahHewan();
                case 4 -> service.hapusHewan();
                case 5 -> service.cariHewan();
                case 6 -> System.out.println("Terima kasih, program selesai.");
                default -> System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 6);

        input.close();
    }
}