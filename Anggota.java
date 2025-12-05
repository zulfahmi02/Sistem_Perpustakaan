public class Anggota {
    private String idAnggota;
    private String nama;
    private String noTelepon;

    public Anggota(String idAnggota, String nama, String noTelepon){
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.noTelepon = noTelepon;
    }
    public String getIdAnggota(){
        return idAnggota;
    }
    public String getNama(){
        return nama;
    }
    public String getNoTelepon(){
        return noTelepon;
    }
    public void TampilkanInfo(){
        System.out.println("ID anggota " + idAnggota);
        System.out.println("Nama Anggota " + nama);
        System.out.println("Nomor Telepon " + noTelepon);
        System.out.println("-----------------------------");
    }
}
