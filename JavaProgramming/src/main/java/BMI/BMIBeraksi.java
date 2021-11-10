/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI;

/**
 *
 * @author User
 */
public class BMIBeraksi {
    public static void main(String[] args) {
        //Membuat Object Baru
        BMI bmiKu = new BMI();
        
        //Memasukkan angka kedalam parameter object bmiKu
        System.out.println("Masukkan Berat anda dalam Kg dan Tinggi anda dalam cm");
        bmiKu.rumusBMI(95, 185);
        System.out.println("Apabila BMI anda dibawah 18.5 maka anda dinyatakan Under Weight");
        System.out.println("Apabila BMI anda diantara 18.5 ~ 24.9 maka anda dinyatakan Normal Weight");
        System.out.println("Apabila BMI anda diantara 25.0 ~ 29.9 maka anda dinyatakan Over Weight");
        System.out.println("Apabila BMI anda diantara 30.0 ~ 34.9 maka anda dinyatakan Obese Class I");
        System.out.println("Apabila BMI anda diantara 35.0 ~ 39.9 maka anda dinyatakan Obese Class II");
        System.out.println("Apabila BMI anda diatas 40.0 maka anda dinyatakan Obese Class III");
    }
}
