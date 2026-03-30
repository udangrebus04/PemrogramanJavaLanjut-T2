public class PenjualanService {
    public void proses(Tiket tiket, Pembayaran pembayaran) {
        double total = tiket.hitungHarga();
        tiket.tampilInfo();
        pembayaran.bayar(total);
    }
}
