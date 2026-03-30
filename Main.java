public class Main {
    public static void main(String[] args) {
        Penumpang p1 = new Penumpang ("001", "Cellomita", 20);
        Penumpang p2 = new Penumpang ("002", "Hasyifa", 25);

        Tiket t1 = new TiketEkonomi("T1", "Jakarta",100000, p1);
        Tiket t2 = new TiketEksekutif("T2", "Bandung",100000, p2);

        Pembayaran bayar1 = new BayarTunai();
        Pembayaran bayar2 = new BayarTransfer();


        PenjualanService service = new PenjualanService();

        service.proses(t1, bayar1);
        service.proses(t2, bayar2);
    }
}