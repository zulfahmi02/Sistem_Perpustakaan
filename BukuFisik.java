public class BukuFisik extends Buku {
    private String lokasi;
    private int jumlahHalaman;

    public BukuFisik(String kodeBuku, String judul, String pengarang, String lokasi, int jumlahHalaman){
        super(kodeBuku, judul, pengarang);
        this.lokasi = lokasi;
        this.jumlahHalaman = jumlahHalaman;
    }
    public String getLokasi(){
        return lokasi;
    }
    public int getJumlahHalaman(){
        return jumlahHalaman;
    }
    @Override
    public void tampilkaninfo(){
        super.tampilkaninfo();
        System.out.println("Tipe: Buku Fisik");
        System.out.println("Lokasi Rak: " + lokasi);
        System.out.println("jumlah halaman : " + jumlahHalaman);
    }
}
