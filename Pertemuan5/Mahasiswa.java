package Pertemuan5;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa{
    private String nrp;
    private String name;
    private List<MataKuliah> mataKuliahDiambil;
    private int total;
    private static final int sksLimit = 24;

    public Mahasiswa(String nrp, String name){
        this.nrp = nrp;
        this.name = name;
        this.mataKuliahDiambil = new ArrayList<>();
        this.total = 0;
    }

    public void ambilMataKuliah(MataKuliah mk){
        if(total + mk.getSks() <= sksLimit){
            mataKuliahDiambil.add(mk);
            total += mk.getSks();
            System.out.println(name + " mengambil " + mk.getNamaMatkul());
        }else System.out.println("Gagal ambil " + mk.getNamaMatkul() + " (SKS melebihi " + sksLimit + ")");
    }

    public void dropMatkul(MataKuliah mk){
    if(mataKuliahDiambil.contains(mk)){
        mataKuliahDiambil.remove(mk);
        total -= mk.getSks();
        System.out.println(name + " berhasil drop " + mk.getNamaMatkul());
    }else System.out.println("Gagal drop: " + mk.getNamaMatkul() + " tidak ditemukan di FRS " + name);
    }

    public void tampilkanFRS(){
        System.out.println("FRS Mahasiswa: " + name + " (" + nrp + ")");
        for(MataKuliah mk : mataKuliahDiambil) System.out.println("- " + mk.getNamaMatkul() + " (" + mk.getSks() + " SKS), Dosen: " + mk.getDosen().getNama());
        System.out.println("Total SKS: " + total);
        System.out.println();
    }
}
