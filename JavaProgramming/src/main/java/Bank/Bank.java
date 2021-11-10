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
public class Bank {
    //Membuat atribut variabel
    int saldo;
    int amount;
    
    //Ini adalah Konstruktor    
    public Bank(int saldo){
        this.saldo = saldo;
    }
    
    // Method getSaldo
    void getSaldo(){
        System.out.println("Saldo anda sekarang setelah transaksi adalah : " + this.amount);
    }
    
    void simpanUang(int uang){
        amount = this.saldo + uang;
    }
    
    void ambilUang(int uang){
        amount = this.amount - uang;
    }
    
    void tampil(){
        System.out.println("Selamat datang di Bank ABC");
        System.out.println("Saldo anda saat ini : " + this.saldo);
    }
}
