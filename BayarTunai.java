public class BayarTunai implements Pembayaran{ 
    
    @Override //polymorphsim (dari bayar)
    public void bayar(double jumlah) {
        System.out.println("Pembayaran: Tunai");
        System.out.println("Total     : Rp " + (int)jumlah);
        System.out.println("======================\n");
    }
}
