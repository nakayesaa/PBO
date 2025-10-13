package week7;

import java.util.HashMap;
import java.util.HashSet;

public class ResponseReader{
    private HashMap<String, String> Response;

    public ResponseReader(){
        Response = new HashMap<>();
        fillResponseOption();
    }

    public String generateResponse(HashSet<String> responsee){
        for(String response :responsee){
            String result = Response.get(response);
            if(result != null) return result;
        }
        return "maaf, permasalahan tidak diketahui";
    }

    public void fillResponseOption(){
        String skripsi = "Untuk mengambil skripsi/tugas akhir, pastikan semua syarat SKS dan IPK sudah terpenuhi.";
        String lag = "Coba refresh halaman atau ganti jaringan ke WiFi kampus (ITS_Wifi) jika portal lambat.";
        String krs = "Jika tidak bisa mengisi KRS, pastikan periode KRS sudah dibuka dan tidak ada tunggakan UKT.";
        String ukt = "Untuk masalah pembayaran UKT, silakan cek status pembayaran di portal keuangan atau hubungi bagian BAAK.";
        String login = "Jika tidak bisa login ke portal, coba reset password di laman SSO atau hubungi helpdesk TIK.";
        String nilai = "Apabila nilai belum muncul, tunggu proses input dari dosen pengampu atau laporkan ke prodi.";
        String jadwal = "Jika jadwal kuliah bentrok, koordinasikan dengan dosen wali atau bagian akademik.";
        String cuti = "Untuk pengajuan cuti akademik, isi formulir cuti dan minta persetujuan dosen wali serta kaprodi.";
        String presensi = "Presensi minimal 75% agar bisa ikut ujian. Jika ada kendala, lampirkan surat keterangan resmi.";
        String wisuda = "Untuk mendaftar wisuda, pastikan sudah lulus sidang akhir dan menyelesaikan administrasi akademik.";

        Response.put("skripsi", skripsi);
        Response.put("ta", skripsi);
        Response.put("tugas", skripsi);
        Response.put("akhir", skripsi);

        Response.put("lag", lag);
        Response.put("lemot", lag);
        Response.put("lambat", lag);
        Response.put("error", lag);

        Response.put("krs", krs);
        Response.put("frs", krs);

        Response.put("ukt", ukt);
        Response.put("pembayaran", ukt);

        Response.put("login", login);
        Response.put("akun", login);
        Response.put("password", login);

        Response.put("nilai", nilai);
        Response.put("transkrip", nilai);

        Response.put("jadwal", jadwal);
        Response.put("bentrok", jadwal);

        Response.put("cuti", cuti);

        Response.put("presensi", presensi);
        Response.put("absensi", presensi);
        Response.put("kehadiran", presensi);

        Response.put("wisuda", wisuda);
        Response.put("kelulusan", wisuda);

    }
}