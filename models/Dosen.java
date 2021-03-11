package models;

import java.util.ArrayList;

public class Dosen extends Person {
    
    Person person;
    private String nidn;
    private ArrayList<Matakuliah> listMataKuliahPengampu;
    private Matakuliah matakKuliahPengampu;

    public Dosen() {
    
    }

    public Dosen(String nidn,String nama){
        this.nidn = nidn;
        person.setNama(nama);
    }

    public void lihatListMataKuliahPengampu(){
        //Code Program
    }

    public void tambahMataKuliahPengampu(Matakuliah matakuliah){
        //Code Program
    }

    public String setNidn(String nidn){
        boolean mengandungHuruf;
        try {
            int angka = Integer.parseInt(nidn);
            mengandungHuruf = false;
        } 
        catch (Exception e) {
            mengandungHuruf = true;
        }
        
        if(nidn.equals("")||nidn.isEmpty()){
            return "NIDN tidak boleh kosong!";
        }
        
        if (nidn.length()!=7){
            return "Panjang NIDN harus 7!";
        }

        if(mengandungHuruf){
            return "NIDN harus berisi angka!";
        }

        return this.nidn = nidn;

    }

    public String getNidn(){
        return nidn;
    }

}

