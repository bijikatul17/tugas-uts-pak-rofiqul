package BMI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BMI {
    //Membuat atribut variabel rumus
    int berat;
    int tinggi;
    
    //Membuat Method Menghitung BMI
    void rumusBMI(int berat, int tinggi){
        System.out.println("Hasil Perhitungan BMI Anda Adalah : " + (berat / (tinggi * tinggi / 10000)) );
    }
}
