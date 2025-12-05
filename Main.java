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
            System.out.print("Pilih Menu (1-8)");
            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Tambah Buku: ");
                    System.out.println("Kode Buku: ");
                    String kode = input.nextLine();
                    System.out.println("Judul: ");
                    String judul = input.nextLine();
                    System.out.println("Pengarang: ");
                    String pengarang = input.nextLine();
                    perpus.tambahBuku(new Buku(kode, judul, pengarang));
                    break;
                case 2:
                    System.out.println("Tambah Anggota");
                    System.out.print("ID Anggota: ");
                    String id = input.nextLine();
                    System.out.println("Nama: ");
                    String nama = input.nextLine();
                    System.out.println("No telepon: ");
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
                    System.out.println("Kode Buku");
                    String kodebk = input.nextLine();
                    System.out.println("ID Anggota");
                    String idPeminjam = input.nextLine();
                    System.out.println("Tanggal (DD/MM/YYYY)");
                    String tanggal = input.nextLine();
                    perpus.pinjamBuku(kodebk, idPeminjam, tanggal);
                    break;
                case 6:
                    System.out.println(" Kembalikan Buku");
                    System.out.println("Kode Buku: ");
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