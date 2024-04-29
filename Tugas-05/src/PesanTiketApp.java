import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        
        // Meminta nama pembeli
        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = scanner.nextLine();

        // Memilih tahap pembelian
        System.out.println("\nPilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int pilihanTahap = scanner.nextInt();

        // Menyimpan objek jenis tiket yang akan digunakan
        Tiket jenisTiket = null;

        // Jika presale dipilih, menampilkan jenis tiket yang tersedia untuk presale
        if (pilihanTahap == 1) {
            System.out.println("\nPilih jenis tiket yang tersedia untuk Presale:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            int pilihanTiket = scanner.nextInt();
            
            // Menentukan jenis tiket berdasarkan input pengguna
            if (pilihanTiket == 1) {
                jenisTiket = new VIP(true);
            } else if (pilihanTiket == 2) {
                jenisTiket = new VVIP(true);
            } else {
                System.out.println("Pilihan tidak valid.");
                return;
            }
        } 
        // Jika reguler dipilih, menampilkan semua jenis tiket yang tersedia
        else if (pilihanTahap == 2) {
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            int pilihanTiket = scanner.nextInt();

            // Menentukan jenis tiket berdasarkan input pengguna
            if (pilihanTiket == 1) {
                jenisTiket = new Festival();
            } else if (pilihanTiket == 2) {
                jenisTiket = new VIP(false);
            } else if (pilihanTiket == 3) {
                jenisTiket = new VVIP(false);
            } else {
                System.out.println("Pilihan tidak valid.");
                return;
            }
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        // Memasukkan jumlah tiket yang ingin dibeli
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = scanner.nextInt();

        // Membuat objek pemesanan dan mencetak nota
        Pemesanan pemesanan = new Pemesanan(namaPembeli, (pilihanTahap == 1) ? "Presale" : "Reguler", jenisTiket, jumlahTiket); // Membuat objek pemesanan dengan tahap pembelian sesuai input pengguna
        pemesanan.cetakNota(); // Mencetak nota pemesanan dengan informasi yang telah dimasukkan

        scanner.close();
    }
}