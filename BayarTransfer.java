public class BayarTransfer implements Pembayaran {

    @Override //polymorphism (dari bayar)
    public void bayar(double jumlah) {
        System.out.println("Pembayaran: Transfer");
        System.out.println("Total     : Rp " + (int)jumlah);
        System.out.println("======================\n");
    }
}