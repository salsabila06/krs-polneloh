package models;

import models.Person;

public class Mahasiswa extends Person{
    
    Person person;
    private String nim;
    private KRS krs;

    public Mahasiswa() {
    
    }

    public Mahasiswa(String nim,String nama) {
        this.nim = nim;
        person.setNama(nama);
    }
    

    public void cetakKRS(){
        System.out.print("");
    }

    public String setNim(String nim){
        
        boolean mengandungHuruf;
        try {
            int angka = Integer.parseInt(nim);
            mengandungHuruf = false;
        } 
        catch (Exception e) {
           mengandungHuruf = true;
        }
        
        if (nim.length()!=7){
            return "Panjang NIM harus 7!";
        }
        
        if(nim.equals("")||nim.isEmpty()){
            return "NIM tidak boleh kosong!";
        }
       
        if(mengandungHuruf){
            return "NIM harus berisi angka!";
        }

        return this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void pilihPaketKRS(KRS krs){
        this.krs = krs;
    }

    public KRS getKRS(){
        return krs;
    }
}
