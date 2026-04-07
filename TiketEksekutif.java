public class TiketEksekutif extends Tiket {
    public TiketEksekutif(Kereta kereta, Penumpang penumpang) {
        super(kereta, penumpang);
    }

    @Override
    double hitungHarga() {
        return kereta.getHarga() + 100000;
    }
}