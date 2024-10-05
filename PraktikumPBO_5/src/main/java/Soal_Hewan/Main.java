/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_Hewan;

/**
 *
 * @author hp
 */
class Hewan {
    String nama;
    String jenis;

    // Constructor
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    // Method untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama + ", Jenis: " + this.jenis);
    }

    // Method suara hewan (bisa di-override)
    public void suara() {
        System.out.println("Hewan ini tidak memiliki suara spesifik.");
    }
}

// Kelas turunan: Kucing
class Kucing extends Hewan {

    // Constructor
    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();  // Memanggil method induk
        System.out.println("Ini adalah seekor kucing.");
    }

    // Override method suara
    @Override
    public void suara() {
        System.out.println("Meow");
    }
}

// Kelas turunan: Anjing
class Anjing extends Hewan {

    // Constructor
    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();  // Memanggil method induk
        System.out.println("Ini adalah seekor anjing.");
    }

    // Override method suara
    @Override
    public void suara() {
        System.out.println("Woof");
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing("Garfield");
        hewan1.tampilkanInfo();
        hewan1.suara();
        
        System.out.println();

        Hewan hewan2 = new Anjing("Odie");
        hewan2.tampilkanInfo();
        hewan2.suara();
    }
}

