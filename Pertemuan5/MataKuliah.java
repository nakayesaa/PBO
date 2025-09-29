package Pertemuan5;

public class MataKuliah{
    private String kode;
    private String namaMatkul;
    private int sks;
    private Dosen dosen;

    public MataKuliah(String kode, String namaMatkul, int sks, Dosen dosen){
        this.kode = kode;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.dosen = dosen;
    }

    public String getNamaMatkul(){
        return namaMatkul;
    }

    public int getSks(){
        return sks;
    }

    public Dosen getDosen(){
        return dosen;
    }
}
