public class TiketEkonomi extends Tiket { //Inheritance
    public TiketEkonomi(String jenis, String tujuan, double harga, Penumpang penumpang) {
        super(jenis, tujuan, harga, penumpang); //panggil parent class
    }

    @Override //Polymorphism (dari hitungHarga)
    double hitungHarga(){
        return harga;
    }
}