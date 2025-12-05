public class Peminjaman {
    private Buku buku;
    private Anggota anggota;
    private String TglPeminjaman;

    public Peminjaman(Buku buku, Anggota anggota, String TglPeminjaman){
        this.buku = buku;
        this.anggota = anggota;
        this.TglPeminjaman = TglPeminjaman;
    }

    public void TampilkanInfo(){
        System.out.println("==Info Peminjaman==");
        System.out.println("Peminjam " + anggota.getNama());
        System.out.println("Buku "+ buku.getJudul());
        System.out.println("Tanggal Peminjaman " + TglPeminjaman);
    }
    public Buku getBuku(){
        return buku;
    }
    public Anggota getAnggota(){
        return anggota;
    }
    public String getTglPeminjaman(){
        return TglPeminjaman;
    }
}
