public class BukuDigital extends Buku {
    // super(kodeBuku, judul, pengarang);
    private String formatFile;
    private double ukuranFile;

    public BukuDigital(String kodeBuku, String judul, String pengarang, String formatFile, double ukuranFile){
        super(kodeBuku, judul, pengarang);
        this.formatFile = formatFile;
        this.ukuranFile = ukuranFile; 
    }
    public String getformatFile(){
        return formatFile;
    }
    public double getukuranFile(){
        return ukuranFile;
    }
    @Override
    public void tampilkaninfo(){
        System.out.println("Kode Buku = Buku Digital");
        System.out.println("Format File : "+ formatFile );
        System.out.println("Ukuran File : "+ukuranFile+"MB");
    }

}
