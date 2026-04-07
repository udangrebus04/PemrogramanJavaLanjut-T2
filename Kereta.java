public class Kereta {
    private String nama;
    private String tujuan;
    private double harga;

    public Kereta(String nama, String tujuan, double harga) {
        this.nama = nama;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }
    public String getTujuan() {
        return tujuan;
    }
    public double getHarga() {
        return harga;
    }
}
