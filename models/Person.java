package models;
public abstract class Person {
    private String nama;

    public void showProfile(){
        System.out.print("Nama : " + nama);
    }

    public String setNama (String nama){
        boolean bukanAngka,hurufSpecial;
        try {
//            int huruf = Integer.valueOf(nama);
//            String kataDiLuarHuruf = nama.replaceAll(nama, "");
            bukanAngka = false;
            hurufSpecial = true;
        } 
        catch (Exception e) {
            bukanAngka = true;
            hurufSpecial = false;
        }
        
        if (!hurufSpecial){
            return "Nama tidak boleh mengandung huruf spesial!";
        }
        
        if(nama.equals("") || nama == null){
            return "Nama tidak boleh kosong!";
        }
       
        if(bukanAngka){
            return "Nama harus berisi huruf!";
        }
        
        return this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
}
