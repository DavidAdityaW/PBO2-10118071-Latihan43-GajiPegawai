/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan43.gajipegawai;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     gaji pegawai
 * 
 */
public class GajiPegawai {
    
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;
    
    public void set_nama(String nama) {
        this.nama = nama;
    }
    
    public String get_nama() {
        return nama;
    }
    
    public void set_alamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String get_alamat() {
        return alamat;
    }
    
    public void set_UangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }
    
    public int get_uangTransport() {
        return uangTransport;
    }
    
    public void set_uangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }
    
    public int get_uangTunjangan() {
        return uangTunjangan;
    }
    
    public void set_gajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public int get_gajiPokok() {
        return gajiPokok;
    }
    
    public void set_totalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int get_totalGaji() {
        return totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {
        totalGaji = uangTunjangan + uangTransport + gajiPokok;
        return totalGaji;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji) {
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("------------------------------------");
        System.out.println("Nama Karyawan \t : " + nama);
        System.out.println("Alamat \t\t : " + alamat);
        System.out.println("Uang Transport \t : Rp. " + uangTransport);
        System.out.println("Uang Tunjangan \t : Rp. " + uangTunjangan);
        System.out.println("Gaji Pokok \t : Rp. " + gajiPokok);
        System.out.println("Total Gaji \t : Rp. " + totalGaji(uangTunjangan, uangTransport, gajiPokok));
    }
    
}
