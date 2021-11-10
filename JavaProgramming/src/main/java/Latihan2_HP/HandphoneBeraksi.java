/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2_HP;

/**
 *
 * @author User
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
        // Membuat Objek untuk Memanggil File Handphone
        Handphone JalankanSistem = new Handphone();
        
        // memanggil attribut dan memberikan value
        JalankanSistem.Hidupkan = "FFzzzz.... BZZZT...., Handphone hidup...";
        JalankanSistem.Panggilan = "*Ringtone Handphone berbunyi*.. Melakukan panggilan.";
        JalankanSistem.Kirim = "Cklak cklik cklak cklik.... SMS berhasil dikieim.";
        JalankanSistem.Matikan = "*Menekan lama power button Handphone*..... Handphone mati.";
        
        /* Menjalankan method dari file handphone dengan cara meamanggilnya 
           melalui object.methoddarifilehandphone();
        */
        JalankanSistem.Hidupkan();
        JalankanSistem.lakukanPanggilan();
        JalankanSistem.kirimSMS();
        JalankanSistem.matikan();
    }
}
