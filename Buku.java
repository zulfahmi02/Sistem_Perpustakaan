public class Buku {
    private String kodeBuku;
    private String judul;
    private String pengarang;
    private boolean status;

    public Buku(String kodeBuku, String judul, String pengarang){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.status = true;
    }

    public String getKodeBuku(){
        return kodeBuku;
    }
    public String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public boolean isStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public void tampilkaninfo(){
        System.out.println("Kode Buku " + kodeBuku);
        System.out.println("Judul Buku " + judul);
        System.out.println("Pengarang Buku " + pengarang);
        System.out.println("Status Buku " + (status ? "Tersedia":"Dipinjam"));
        System.out.println("----------------------------------------------");
    }
}
