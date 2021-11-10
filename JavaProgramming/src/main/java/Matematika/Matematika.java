package Matematika;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Matematika {
    // buat string
    int a;
    int b;
        
    // Menyatakan Method nya
    void pertambahan(int a, int b){
        System.out.println("Hasil operasi pertambahannya " + a + "+" + b + " adalah : " + (a + b));
    }
    
    void pengurangan(int a, int b){
        System.out.println("Hasil operasi pengurangannya " + a + "-" + b + " adalah : " + (a - b));
    }
     
    void perkalian(int a, int b){
        System.out.println("Hasil operasi perkaliannya " + a + "*" + b + " adalah : " + (a * b));
    }
    
    void pembagian(int a, int b){
        System.out.println("Hasil operasi pembagiannya " + a + "/" + b + " adalah : " + (a / b));
    }
}