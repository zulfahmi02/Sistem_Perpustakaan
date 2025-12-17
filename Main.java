import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        while (true) {
            System.out.println("Sistem Perpustakaan Mini");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Tampilkan Semua Buku");
            System.out.println("4. Tampilkan Semua Anggota");
            System.out.println("5. Pinjam Buku");
            System.out.println("6. Kembalikan Buku");
            System.out.println("7. Lihat Daftar peminjaman");
            System.out.println("8. Keluar");
            System.out.print("Pilih Menu (1-8): ");
            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Tambah Buku: ");
                    System.out.println("Pilih Tipe Buku");
                    System.out.println("1. Buku Fisik");
                    System.out.println("2. Buku Digital");
                    System.out.print("Pilihan (1/2): ");
                    int TipeBuku = input.nextInt();
                    input.nextLine();

                    System.out.print("Kode Buku: ");
                    String kode = input.nextLine();
                    System.out.print("Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Pengarang: ");
                    String pengarang = input.nextLine();
                    if (TipeBuku == 1) {
                        System.out.print("Lokasi Rak : ");
                        String lokasi = input.nextLine();
                        System.out.print("Jumlah Halaman : ");
                        int halaman = input.nextInt();
                        input.nextLine();
                        perpus.tambahBuku(new BukuFisik(kode, judul, pengarang, lokasi, halaman));
                    } else if (TipeBuku == 2) {
                        System.out.print("Format File(PDF/EPUB/MOBI: )");
                        String format = input.nextLine();
                        System.out.print("Ukuran File(MB): ");
                        int ukuran = input.nextInt();
                        input.nextLine();
                        perpus.tambahBuku(new BukuDigital(kode, judul, pengarang, format, ukuran));
                    } else{
                        System.out.println("Pilihan Tidak Valid");
                    }
                    perpus.tambahBuku(new Buku(kode, judul, pengarang));
                    break;
                case 2:
                    System.out.println("Tambah Anggota");
                    System.out.print("ID Anggota: ");
                    String id = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("No telepon: ");
                    String telp = input.nextLine();
                    perpus.tambahAnggota(new Anggota(id, nama, telp));
                    break;
                case 3:
                    perpus.TampilkanSemuaBuku();
                    break;
                case 4:
                    perpus.tampilkanSemuaAnggota();
                    break;
                case 5:
                    System.out.println("Pinjam Buku");
                    System.out.print("Kode Buku: ");
                    String kodebk = input.nextLine();
                    System.out.print("ID Anggota: ");
                    String idPeminjam = input.nextLine();
                    System.out.print("Tanggal (DD/MM/YYYY): ");
                    String tanggal = input.nextLine();
                    perpus.pinjamBuku(kodebk, idPeminjam, tanggal);
                    break;
                case 6:
                    System.out.println(" Kembalikan Buku");
                    System.out.print("Kode Buku: ");
                    String kodeKembali = input.nextLine();
                    perpus.kembalikanBuku(kodeKembali);
                    break;
                case 7:
                    perpus.tampilkanPeminjaman();
                    break;
                case 8:
                    System.out.println("Terima Kasih Telah Menggunakan Sistem Perpustakaan");
                    input.close();
                    return;
            
                default:
                    System.out.println("Pilihan Tidak Valid! Silahkan Pilih 1-8.");
            }
        }
    }
}