class AlatMusik {
    protected String nama;
    protected String jenis;
    
    public AlatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void mainkan() {
        System.out.println("Memainkan alat musik: " + nama);
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Alat Musik: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

class Gitar extends AlatMusik {
    private int jumlahSenar;
    private String tipeGitar;
    
    public Gitar(String nama, int jumlahSenar, String tipeGitar) {
        super(nama, "Alat Musik Petik"); // Memanggil konstruktor parent
        this.jumlahSenar = jumlahSenar;
        this.tipeGitar = tipeGitar;
    }
    public void mainkan() {
        System.out.println("Memetik senar gitar " + nama + " dengan " + jumlahSenar + " senar");
    }
    
    public void tuning() {
        System.out.println("Melakukan tuning pada gitar " + tipeGitar);
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Senar: " + jumlahSenar);
        System.out.println("Tipe Gitar: " + tipeGitar);
    }
}
