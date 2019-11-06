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
public class PBO210118071Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GajiPegawai gaji = new GajiPegawai();
        
        gaji.set_nama("Rizki Adam Kurniawan");
        gaji.set_alamat("Jalan semar dlm 4 No 72/66");
        gaji.set_UangTransport(250000);
        gaji.set_uangTunjangan(300000);
        gaji.set_gajiPokok(4500000);
        
        gaji.tampilData(gaji.get_nama(), gaji.get_alamat(), gaji.get_uangTunjangan(), gaji.get_uangTransport(), gaji.get_gajiPokok(), gaji.get_totalGaji());
        
    }
    
}
