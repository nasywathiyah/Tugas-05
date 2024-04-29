// Kelas untuk tiket VIP
class VIP extends Tiket {
    public VIP(boolean presale) {
        super("VIP", presale ? 120 : 150); // Jika presale, harga 120; jika tidak, harga 150
    }
}