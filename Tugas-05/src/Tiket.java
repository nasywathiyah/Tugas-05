// Kelas untuk tiket
class Tiket {
    protected String jenis; // Variabel untuk menyimpan jenis tiket
    protected double harga; // Variabel untuk menyimpan harga tiket

    // Konstruktor untuk inisialisasi jenis dan harga tiket
    public Tiket(String jenis, double harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    // Metode untuk menghitung total harga
    public double hitungTotalHarga(int jumlah) {
        return harga * jumlah;
    }

    // Metode untuk mendapatkan jenis tiket
    public String getJenis() {
        return jenis;
    }

    // Override metode toString() untuk mendapatkan jenis tiket dalam bentuk string
    @Override
    public String toString() {
        return jenis;
    }
}