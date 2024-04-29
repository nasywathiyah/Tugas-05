import java.text.DecimalFormat;

// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama; // Variabel untuk menyimpan nama pembeli
    private String tahap; // Variabel untuk menyimpan tahap pembelian
    private Tiket tiket; // Variabel untuk menyimpan jenis tiket
    private int jumlah; // Variabel untuk menyimpan jumlah tiket

    // Konstruktor untuk inisialisasi informasi pemesanan
    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    // Metode untuk mencetak nota pemesanan
    public void cetakNota() {
        DecimalFormat df = new DecimalFormat("#.0"); // Membuat objek DecimalFormat untuk memformat angka desimal
        double totalHarga = tiket.hitungTotalHarga(jumlah); // Menghitung total harga dengan memanggil metode hitungTotalHarga dari objek tiket
        System.out.println("\n--- Nota Pemesanan ---"); // Mencetak header untuk nota pemesanan
        System.out.println("Nama Pembeli: " + nama); // Mencetak nama pembeli
        System.out.println("Tahap Pembelian: " + tahap); // Mencetak tahap pembelian (Presale/Reguler)
        System.out.println("Jenis Tiket: " + tiket); // Mencetak jenis tiket menggunakan metode toString() dari objek tiket
        System.out.println("Jumlah Tiket: " + jumlah); // Mencetak jumlah tiket yang dibeli
        System.out.println("Total Harga: Rp " + df.format(totalHarga)); // Mencetak total harga menggunakan objek DecimalFormat untuk memformat angka menjadi satu digit desimal
    }
}