import java.util.ArrayList;
public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;
    private ArrayList<Anggota> daftarAnggota;
    private ArrayList<Peminjaman> daftarPeminjaman;

    public Perpustakaan(){
        daftarBuku = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
        daftarPeminjaman = new ArrayList<>();
    }
    public void tambahBuku(Buku buku){
        daftarBuku.add(buku);
        System.out.println("Buku Berhasil Ditambahkan");
    }

    public void tambahAnggota(Anggota anggota){
        daftarAnggota.add(anggota);
        System.out.println("Anggota Berhasil Mendaftar");
    }
    public void TampilkanSemuaBuku(){
        System.out.println("==Daftar Buku==");
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum Ada Buku Terdaftar");
        } else {
            for (Buku buku:daftarBuku){
                buku.tampilkaninfo();
            }
        }
    }
    public void tampilkanSemuaAnggota(){
        System.out.println("==Daftar Anggota==");
        if (daftarAnggota.isEmpty()) {
            System.out.println("Belum Ada Anggota yang terdaftar");
        } else {
            for (Anggota anggota : daftarAnggota){
                anggota.TampilkanInfo();
            }
        }
    }
    public Buku cariBuku(String kodeBuku){
        for(Buku buku : daftarBuku){
            if (buku.getKodeBuku().equals(kodeBuku)) {
                return buku;
            }
        }
        return null; 
    }
    public Anggota cariAnggota(String idAnggota){
        for(Anggota anggota : daftarAnggota){
            if (anggota.getIdAnggota().equals(idAnggota)) {
                return anggota; 
            }
        }
        return null; 
    }
    public void pinjamBuku(String kodeBuku, String idAnggota, String Tanggal){
        Buku buku = cariBuku(kodeBuku);
        Anggota anggota = cariAnggota(idAnggota);

        if (buku == null) {
            System.out.println("Buku Tidak Ditemukan");
            return;
        }
        if (anggota==null) {
            System.out.println("Anggota Tidak Ditemukan");
            return;
        }
        if (!buku.isStatus()) {
            System.out.println("Buku Sedang Dipinjam");
            return;
        }
        buku.setStatus(false);
        Peminjaman peminjaman = new Peminjaman(buku, anggota, Tanggal);
        daftarPeminjaman.add(peminjaman);
        System.out.println("Buku Berhasil Dipinjam");
        peminjaman.TampilkanInfo();
    }
    public void kembalikanBuku(String kodeBuku){
        for (Peminjaman peminjaman : daftarPeminjaman){
            if (peminjaman.getBuku().getKodeBuku().equals(kodeBuku)) {
                peminjaman.getBuku().setStatus(true);
                daftarPeminjaman.remove(peminjaman);
                System.out.println("Buku Berhasil Dikembalikan");
                return;
            }
        }
        System.out.println("Peminjaman Tidak Ditemukan");
    }
    public void tampilkanPeminjaman(){
        System.out.println("==Daftar Peminjaman==");
        if (daftarPeminjaman.isEmpty()) {
            System.out.println("Tidak Ada Peminjaman Aktif");
        } else {
            for (Peminjaman peminjaman : daftarPeminjaman){
                peminjaman.TampilkanInfo();
            }
        }
    }
}
