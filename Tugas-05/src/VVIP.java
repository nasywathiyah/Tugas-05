// Kelas untuk tiket VVIP
class VVIP extends Tiket {
    public VVIP(boolean presale) {
        super("VVIP", presale ? 160 : 200); // Jika presale, harga 160; jika tidak, harga 200
    }
}