public abstract class Tiket { //abstract
    protected Penumpang penumpang;
    protected String jenis;
    protected String tujuan;
    protected double harga;

    public Tiket(String jenis, String tujuan, double harga, Penumpang penumpang) {
        this.jenis = jenis;
        this.tujuan = tujuan;
        this.harga = harga;
        this.penumpang = penumpang;
    }

    abstract double hitungHarga();

    public void tampilInfo() {
        System.out.println("===== TIKET =====");
        System.out.println("Nama     : " + penumpang.getNama());
        System.out.println("Jenis    : " + jenis);
        System.out.println("Tujuan   : " + tujuan);
    }
}