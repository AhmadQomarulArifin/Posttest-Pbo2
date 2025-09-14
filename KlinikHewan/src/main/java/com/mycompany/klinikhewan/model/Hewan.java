/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.klinikhewan.model;

/**
 *
 * @author qomarul
 */
public class Hewan {
    private String namaPemilik;
    private String noHP;
    private String namaHewan;
    private String jenisHewan;
    private int umurHewan;
    private String keluhan;

    public Hewan(String namaPemilik, String noHP, String namaHewan, String jenisHewan, int umurHewan, String keluhan) {
        this.namaPemilik = namaPemilik;
        this.noHP = noHP;
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.umurHewan = umurHewan;
        this.keluhan = keluhan;
    }

    // Getter & Setter
    public String getNamaPemilik() { return namaPemilik; }
    public void setNamaPemilik(String namaPemilik) { this.namaPemilik = namaPemilik; }

    public String getNoHP() { return noHP; }
    public void setNoHP(String noHP) { this.noHP = noHP; }

    public String getNamaHewan() { return namaHewan; }
    public void setNamaHewan(String namaHewan) { this.namaHewan = namaHewan; }

    public String getJenisHewan() { return jenisHewan; }
    public void setJenisHewan(String jenisHewan) { this.jenisHewan = jenisHewan; }

    public int getUmurHewan() { return umurHewan; }
    public void setUmurHewan(int umurHewan) { this.umurHewan = umurHewan; }

    public String getKeluhan() { return keluhan; }
    public void setKeluhan(String keluhan) { this.keluhan = keluhan; }
}
