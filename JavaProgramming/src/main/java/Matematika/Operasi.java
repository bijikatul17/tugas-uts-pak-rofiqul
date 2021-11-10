/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematika;

/**
 *
 * @author User
 */
public class Operasi {
    public static void main(String[] args) {
        // Membuat object nya
        Matematika operasi= new Matematika();
        
        // Memanggil Atribut dan mengisi value di parameternya
        operasi.pertambahan(20, 20);
        operasi.pengurangan(10, 5);
        operasi.perkalian(10, 20);
        operasi.pembagian(21, 2);
        
    }
}
