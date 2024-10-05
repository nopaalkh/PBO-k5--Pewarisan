/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_Kendaraan;

/**
 *
 * @author hp
 */
// Kelas induk: Kendaraan
class Kendaraan {
    String merk;

    // Constructor
    public Kendaraan(String merk) {
        this.merk = merk;
    }

    // Method untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Merk Kendaraan: " + this.merk);
    }
}

// Kelas menengah: KendaraanDarat
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    // Constructor
    public KendaraanDarat(String merk, int jumlahRoda) {
        super(merk);
        this.jumlahRoda = jumlahRoda;
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + this.jumlahRoda);
    }
}

// Kelas turunan: Mobil
class Mobil extends KendaraanDarat {

    // Constructor
    public Mobil(String merk) {
        super(merk, 4);
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ini adalah sebuah mobil.");
    }
}

// Kelas turunan: SepedaMotor
class SepedaMotor extends KendaraanDarat {

    // Constructor
    public SepedaMotor(String merk) {
        super(merk, 2);
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ini adalah sebuah sepeda motor.");
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        mobil.tampilkanInfo();
        
        System.out.println();
        
        Kendaraan motor = new SepedaMotor("Honda");
        motor.tampilkanInfo();
    }
}

