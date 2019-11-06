/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan56.umurbarangantik;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     nama dan umur barang antik
 * 
 */
public class PBO210118071Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Radio r = new Radio(234);
        
        r.setName("Radio AM");
        System.out.println("Nama Barang Antik : " + r.getName());
        r.tampilUmur();
    }
    
}
