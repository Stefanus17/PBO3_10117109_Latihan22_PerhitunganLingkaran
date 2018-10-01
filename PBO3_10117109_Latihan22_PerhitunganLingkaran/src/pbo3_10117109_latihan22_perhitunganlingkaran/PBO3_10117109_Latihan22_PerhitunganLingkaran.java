/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan22_perhitunganlingkaran;

import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Membuat Program Perhitungan Lingkaran
 */
public class PBO3_10117109_Latihan22_PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String d;
          double r,L,diameter,K;
          
          Scanner baca = new Scanner(System.in);
          
          System.out.println("=======PROGRAM PERHITUNGAN LINGKARAN=======");
          System.out.println("");
          
          do{
              System.out.print("Masukkan Nilai Diameter Lingkaran : ");
              d = baca.nextLine();
              
              System.out.println((!d.matches("[0-9]*"))?"Nilai Diameter Tidak" 
                      + "Sesuai\n":"");
          }
          while (!d.matches("[0-9]*"));
          
          System.out.println("\n====HASIL PERHITUNGAN LINGKARAN====");
            diameter = Double.parseDouble(d);
            r = diameter / 2; 
            System.out.printf("Jari-jari Lingkaran = %.0f cm %n",r);
            L = Math.PI*r*r;
            System.out.printf("Luas Lingkaran = %.2f cm %n",L);
            K = 2*Math.PI*r;
            System.out.printf("Keliling Lingkaran = %.2f cm %n", K);
    }
    
}
