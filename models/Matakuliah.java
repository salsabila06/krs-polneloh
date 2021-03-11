package models;

public class Matakuliah {
    private String namaMatakuliah;
    private int sks;
    private int semester;
    private Dosen pengampu;

    public Matakuliah(){

    }
    public Matakuliah(String namaMatakuliah, int sks) {
        this.namaMatakuliah = namaMatakuliah;
        this.sks = sks;
    }
    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Dosen getPengampu() {
        return pengampu;
    }

    public void setPengampu(Dosen pengampu) {
        this.pengampu = pengampu;
    }
    
    public void showMatakuliah(){
        //
    }
    
}
