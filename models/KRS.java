package models;

import java.util.ArrayList;

public class KRS {
    private String noKRS;
    private ArrayList<Matakuliah> paketMatakuliah = new ArrayList<Matakuliah>();

    public KRS(String noKRS) {
        this.noKRS = noKRS;
    }
    public KRS(){
        
    }
    public String getNoKRS() {
        return noKRS;
    }

    public void setNoKRS(String noKRS) {
        this.noKRS = noKRS;
    }
    public ArrayList<Matakuliah> showMatakuliahKRS() {
        return paketMatakuliah;
    }
    public void tambahMatakuliahKRS(Matakuliah mataKuliah) {
        paketMatakuliah.add(mataKuliah);
    }
    public ArrayList<Matakuliah> getPaketMatakuliah() {
        return paketMatakuliah;
    }
}
