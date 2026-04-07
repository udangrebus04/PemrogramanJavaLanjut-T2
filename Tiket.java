public abstract class Tiket { //abstract
    protected Penumpang penumpang;
    protected Kereta kereta;

    public Tiket(Kereta kereta, Penumpang penumpang) {
        this.kereta = kereta;
        this.penumpang = penumpang;
    }

    abstract double hitungHarga();

    public void tampilInfo() {
        System.out.println("===== TIKET =====");
        System.out.println("Nama    : " + penumpang.getNama());
        System.out.println("Kereta  : " + kereta.getNama());
        System.out.println("Tujuan  : " + kereta.getTujuan());
    }
}