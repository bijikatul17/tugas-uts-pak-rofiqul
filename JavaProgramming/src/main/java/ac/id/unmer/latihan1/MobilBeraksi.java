/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.unmer.latihan1;

/**
 *
 * @author User
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        // membuat objek mobilku
        Mobil mobilku = new Mobil();
        
        mobilku.Warna = "Merah";
        mobilku.TahunProduksi = 2018;
        
        // Mmebuat Objek Mobil Tono
        Mobil mobilTono = new Mobil();
        mobilTono.Warna = "Biru";
        mobilTono.TahunProduksi = 2006;
        
        System.out.println("Mobilku Berwarna " + mobilku.Warna);
        System.out.println("Mobilku Keluaran Tahun " + mobilku.TahunProduksi);
        
        
    }
}
