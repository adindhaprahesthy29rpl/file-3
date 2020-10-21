/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.pkg3;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class File3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String[] laptop = {"asus", "macbook", "acer", "hp", "lenovo"};
        double[] hargaLaptop = {8000, 20000, 3000, 6000, 5000};
        double totalHarga, totalPembayaran, jumlahPembayaran, potonganHarga, kembalian;
        Scanner input = new Scanner (System.in);
        
        System.out.println("===============================================");
        System.out.println("---SELAMAT DATANG DI TOKO SAMODRA ELEKTRONIK---");
        System.out.println("--Silahkan Mencari Barang Sesuai Pilihan Anda--");
        System.out.println("---------------SELAMAT BERBELANJA--------------");
        System.out.println("===============================================");
        
        System.out.println("--Daftar Harga Laptop--");
        for (int i=0; i<hargaLaptop.length; i++){
            System.out.println("No. " +i+ laptop[i] +" Harganya Sebesar "+hargaLaptop[i]);
        }
        System.out.println("Silahkan Masukkan No Pilihan Anda : ");
        int pilihan = input.nextInt();
        System.out.println("Laptop Pilihan Anda : "+laptop[pilihan]);
        System.out.println("Beli Berapa : ");
        int beli = input.nextInt();
        totalHarga = hargaLaptop[pilihan]*beli;
        System.out.println("Total Harga : "+ totalHarga);

        if (totalHarga < 10000){
            System.out.println("Maaf Anda Tidak Mendapatkan Diskon 20%");
            System.out.println(" --Silahkan Bayar di Sini-- ");
            System.out.println("Masukkan Nominal Uang Anda : ");
            totalPembayaran = input.nextDouble();
            kembalian = totalPembayaran-totalHarga;
            System.out.println("kembalian Anda Rp." +kembalian);
            System.out.println("<<<Terima Kasih Telah Berbelanja di Toko Samodra Elektronik>>>");
            
        }else if (totalHarga >= 10000){
                System.out.println("Selamat Anda Mendapatkan Diskon 20%");
                potonganHarga=0.2*totalHarga;
                System.out.println("Besarnya Potongan Harga Rp." + potonganHarga);
                jumlahPembayaran = totalHarga-potonganHarga;
                System.out.println("Nominal Uang yang Harus Dibayarkan Rp." + jumlahPembayaran);        
                System.out.println(" --Silahkan Bayar di Sini-- ");
                System.out.println("Masukkan Nominal Uang Anda : ");
                totalPembayaran = input.nextDouble();
                kembalian = totalPembayaran-jumlahPembayaran;
                System.out.println("kembalian Anda Rp." +kembalian);
                System.out.println("<<<Terima Kasih Telah Berbelanja di Toko Samodra Elektronik>>>");
        
       }
    }
    
}
