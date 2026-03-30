public class Penumpang { //Encapsulation (data dikunci)
    private String id;
    private String nama;
    private int umur;

    public Penumpang(String id, String nama, int umur){
        this.id = id;
        this.nama = nama;
        this.umur = umur;
    }


    public String getNama() {
        return nama;
    }
}