/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import models.Dosen;

public class DosenTest {
    public static void main(String [] args){
        Dosen dsn = new Dosen();
        
        //Test 1 - Uji panjang NIDN != 7
        String hasilEkspestasi = "Panjang NIDN harus 7!";
        if(dsn.setNidn("12345678") == hasilEkspestasi){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
        
        //Test 2 - NIDN tidak boleh kosong
        String hasilEkspestasi2 = "NIDN tidak boleh kosong!";
        if(dsn.setNidn("") == hasilEkspestasi2){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
        
        //Test 3 - NIDN harus angka
        String hasilEkspestasi3 = "NIDN harus berisi angka!";
        if(dsn.setNidn("i2e4567") == hasilEkspestasi3){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
      
    }
}
