/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author User
 */
public class BankBeraksi {
    public static void main(String[] args) {
//      Membuat object baru dan memberi nilai di parameter method Bankku
//      dan menampilkannya
        Bank banku = new Bank(100000);
        banku.tampil();
        
//      Buat method simpan uang
        System.out.println("Simpang uang sebanyak 500000:");
        banku.simpanUang(500000);
        banku.getSaldo();
        
//      Buat Method ambil uang
        System.out.println("Ambil uang sebanyak : 150000");
        banku.ambilUang(150000);
        banku.getSaldo();
    }
}
