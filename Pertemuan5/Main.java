package Pertemuan5;

public class Main{
    public static void main(String[] args){
        Dosen d1 = new Dosen("D001", "Dr. Andi");
        Dosen d2 = new Dosen("D002", "Prof. Budi");

        MataKuliah mk1 = new MataKuliah("MK001", "PBO", 3, d1);
        MataKuliah mk2 = new MataKuliah("MK002", "Struktur Data", 4, d2);

        Mahasiswa m1 = new Mahasiswa("5025241101", "Hajendra");

        m1.ambilMataKuliah(mk1);
        m1.ambilMataKuliah(mk2);
        m1.tampilkanFRS();

        m1.dropMatkul(mk1);
        m1.tampilkanFRS();

        m1.dropMatkul(mk1);
    }
}

