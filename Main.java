import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Penumpang p1 = new Penumpang ("001", "Cellomita", 20);
        Penumpang p2 = new Penumpang ("002", "Hasyifa", 25);

        Map<String, Kereta> kereta = new HashMap<>();

        kereta.put("K1", new Kereta("Padjajaran", "Jakarta", 100000));
        kereta.put("K2", new Kereta("Pasundan", "Bandung", 100000));

        Pembayaran bayar1 = new BayarTunai();
        Pembayaran bayar2 = new BayarTransfer();

        PenjualanService service = new PenjualanService();

        try{
            Kereta k1 = kereta.get("K1");
            Kereta k2 = kereta.get("K2");

            Tiket t1 = new TiketEkonomi(k1, p1);
            Tiket t2 = new TiketEksekutif(k2, p2);

            service.proses(t1, bayar1);
            service.proses(t2, bayar2);

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan, silakan coba lagi.");
        } 
    }
}