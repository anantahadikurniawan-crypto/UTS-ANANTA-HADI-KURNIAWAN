class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    public Mahasiswa() {
        this.nama = "Belum diisi";
        this.nim = "00000000";
        this.ipk = 0.0;
    }

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public Mahasiswa(Mahasiswa mahasiswaLain) {
        this.nama = mahasiswaLain.nama;
        this.nim = mahasiswaLain.nim;
        this.ipk = mahasiswaLain.ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("------------------------");
    }
}

public class Main {
public static void main(String[] args) {
        System.out.println("=== SIMULASI KONSTRUKTOR JAVA ===\n");
        
        System.out.println("1. Konstruktor Default:");
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilkanInfo();
        
        System.out.println("2. Konstruktor Parameterized:");
        Mahasiswa mhs2 = new Mahasiswa("Budi Santoso", "12345678", 3.75);
        mhs2.tampilkanInfo();
        
        System.out.println("3. Copy Constructor:");
        Mahasiswa mhs3 = new Mahasiswa(mhs2);
        System.out.println("Salinan dari mhs2:");
        mhs3.tampilkanInfo();
        
        System.out.println("4. Modifikasi objek hasil copy:");
        mhs3.setNama("Ani Wijaya");
        mhs3.setNim("87654321");
        mhs3.setIpk(3.85);
        
        System.out.println("Objek asli (mhs2):");
        mhs2.tampilkanInfo();
        
        System.out.println("Objek salinan (mhs3) setelah dimodifikasi:");
        mhs3.tampilkanInfo();
        
        System.out.println("5. Mengubah data mhs1 dengan setter:");
        mhs1.setNama("Citra Dewi");
        mhs1.setNim("11223344");
        mhs1.setIpk(3.50);
        mhs1.tampilkanInfo();
