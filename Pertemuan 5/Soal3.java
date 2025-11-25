class Pegawai {
    protected String nama;
    protected int id;
    protected double gajiPokok;
    
    public Pegawai(String nama, int id, double gajiPokok) {
        this.nama = nama;
        this.id = id;
        this.gajiPokok = gajiPokok;
    }
    
    public void tampilkanInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }
    
    public double hitungGaji() {
        return gajiPokok;
    }
}
class Manajer extends Pegawai {
    protected double tunjangan;
    protected String departemen;
    
    public Manajer(String nama, int id, double gajiPokok, double tunjangan, String departemen) {
        super(nama, id, gajiPokok);
        this.tunjangan = tunjangan;
        this.departemen = departemen;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jabatan: Manajer");
        System.out.println("Departemen: " + departemen);
        System.out.println("Tunjangan: Rp " + tunjangan);
    }

    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }
}
class Direktur extends Manajer {
    private double bonus;
    private int jumlahBawahan;
    
    public Direktur(String nama, int id, double gajiPokok, double tunjangan, 
                    String departemen, double bonus, int jumlahBawahan) {
        super(nama, id, gajiPokok, tunjangan, departemen);
        this.bonus = bonus;
        this.jumlahBawahan = jumlahBawahan;
    }

    public void tampilkanInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: Direktur");
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Jumlah Bawahan: " + jumlahBawahan);
    }
    public double hitungGaji() {
        return gajiPokok + tunjangan + bonus;
    }
    public void buatKeputusan() {
        System.out.println(nama + " membuat keputusan strategis untuk departemen " + departemen);
    }
    
    public void pimpinRapat() {
        System.out.println(nama + " memimpin rapat dengan " + jumlahBawahan + " bawahan");
    }
}
