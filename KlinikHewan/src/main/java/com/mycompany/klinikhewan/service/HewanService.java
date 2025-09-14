/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.klinikhewan.service;

/**
 *
 * @author qomarul
 */
import com.mycompany.klinikhewan.model.Hewan;
import java.util.ArrayList;
import java.util.Scanner;

public class HewanService {
    private ArrayList<Hewan> daftarHewan = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // CREATE
    public void tambahHewan() {
        System.out.print("Nama Pemilik : ");
        String namaPemilik = input.nextLine();
        System.out.print("No HP Pemilik: ");
        String noHP = input.nextLine();
        if (noHP.isEmpty()) {
            System.out.println("No HP tidak boleh kosong!");
            return;
        }

        System.out.print("Nama Hewan   : ");
        String namaHewan = input.nextLine();
        System.out.print("Jenis Hewan  : ");
        String jenisHewan = input.nextLine();
        System.out.print("Umur Hewan   : ");
        int umurHewan = input.nextInt();
        input.nextLine();
        if (umurHewan <= 0) {
            System.out.println("Umur hewan harus lebih dari 0!");
            return;
        }

        System.out.print("Keluhan      : ");
        String keluhan = input.nextLine();

        daftarHewan.add(new Hewan(namaPemilik, noHP, namaHewan, jenisHewan, umurHewan, keluhan));
        System.out.println(" Data berhasil ditambahkan!");
    }

    // READ
    public void lihatHewan() {
        System.out.println("\n=== Daftar Data Hewan ===");
        if (daftarHewan.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            for (int i = 0; i < daftarHewan.size(); i++) {
                Hewan h = daftarHewan.get(i);
                System.out.println((i+1)+". Pemilik: " + h.getNamaPemilik() +
                        " (No HP: " + h.getNoHP() + ")" +
                        ", Hewan: " + h.getNamaHewan() +
                        ", Jenis: " + h.getJenisHewan() +
                        ", Umur: " + h.getUmurHewan() + " tahun" +
                        ", Keluhan: " + h.getKeluhan());
            }
        }
    }

    // UPDATE
    public void ubahHewan() {
        lihatHewan();
        if (daftarHewan.isEmpty()) return;

        System.out.print("Pilih nomor data yang akan diubah: ");
        int idx = input.nextInt(); input.nextLine();
        if (idx < 1 || idx > daftarHewan.size()) {
            System.out.println("Nomor tidak valid!");
            return;
        }

        Hewan h = daftarHewan.get(idx-1);
        System.out.print("Nama Pemilik baru ("+h.getNamaPemilik()+"): ");
        h.setNamaPemilik(input.nextLine());
        System.out.print("No HP baru ("+h.getNoHP()+"): ");
        h.setNoHP(input.nextLine());
        System.out.print("Nama Hewan baru ("+h.getNamaHewan()+"): ");
        h.setNamaHewan(input.nextLine());
        System.out.print("Jenis Hewan baru ("+h.getJenisHewan()+"): ");
        h.setJenisHewan(input.nextLine());
        System.out.print("Umur Hewan baru ("+h.getUmurHewan()+"): ");
        h.setUmurHewan(input.nextInt()); input.nextLine();
        System.out.print("Keluhan baru ("+h.getKeluhan()+"): ");
        h.setKeluhan(input.nextLine());

        System.out.println(" Data berhasil diubah!");
    }

    // DELETE
    public void hapusHewan() {
        lihatHewan();
        if (daftarHewan.isEmpty()) return;

        System.out.print("Pilih nomor data yang akan dihapus: ");
        int idx = input.nextInt(); input.nextLine();
        if (idx < 1 || idx > daftarHewan.size()) {
            System.out.println("Nomor tidak valid!");
            return;
        }

        daftarHewan.remove(idx-1);
        System.out.println(" Data berhasil dihapus!");
    }

    // SEARCH
    public void cariHewan() {
        System.out.print("Masukkan nama hewan yang dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (Hewan h : daftarHewan) {
            if (h.getNamaHewan().toLowerCase().contains(keyword)) {
                System.out.println("Ditemukan → Pemilik: " + h.getNamaPemilik() +
                        ", Hewan: " + h.getNamaHewan() +
                        ", Jenis: " + h.getJenisHewan() +
                        ", Umur: " + h.getUmurHewan() +
                        ", Keluhan: " + h.getKeluhan());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println(" Data tidak ditemukan.");
        }
    }
}