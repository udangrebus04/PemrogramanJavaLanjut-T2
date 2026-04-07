public class TiketEkonomi extends Tiket {
    public TiketEkonomi(Kereta kereta, Penumpang penumpang) {
        super(kereta, penumpang);
    }

    @Override
    double hitungHarga() {
        return kereta.getHarga();
    }
}