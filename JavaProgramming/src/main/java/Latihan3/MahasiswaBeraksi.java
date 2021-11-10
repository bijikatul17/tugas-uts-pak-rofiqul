/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author User
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // Membuat objek untuk memanggil method2 file mahasiswa
        Mahasiswa HariH = new Mahasiswa();
        
        // Memanggil attribut dan memberi nilai
        HariH.Kegiatan1 = "*Membuka buju pada halaman 11....*" +"*Memfokuskan pikiran"
                + "dan mulai membaca dalam hati...*"+"*Waktu berlalu 5 menit*";
        HariH.Kegiatan2 = "*Clingak..clinguk...*"+"*Melihat kanan kiri untuk memastikan"
                + "keadaan aman*"+"*Kepala mulai mencondong ke arah buku teman sebangku...*"; 
        HariH.Kegiatan3 = "*Tangan mulai bergerak untuk mengerjakan....*"+"'Hmm.. banyak yang aku harus "
                + "modifikasi agar tidak ketahuan jawaban hasil contekan...'";
        
        // Menjalankan method file Handphone
        HariH.membaca();
        HariH.menyontek();
        HariH.modifikasi();
    }
}
