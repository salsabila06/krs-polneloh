package tests;

import models.Mahasiswa;

public class MahasiswaTest {
    public static void main(String [] args){
        Mahasiswa mhs = new Mahasiswa();
        
        //Test 1 - Uji panjang NIM != 7
        String hasilEkspestasi = "Panjang NIM harus 7!";
        if(mhs.setNim("12345678") == hasilEkspestasi){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
        
        //Test 2 - NIM tidak boleh kosong
        String hasilEkspestasi2 = "NIM tidak boleh kosong!";
        if(mhs.setNim("") == hasilEkspestasi2){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
        
        //Test 3 - NIM harus angka
        String hasilEkspestasi3 = "NIM harus berisi angka!";
        if(mhs.setNim("i2e4567") == hasilEkspestasi3){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
        
    }
}
