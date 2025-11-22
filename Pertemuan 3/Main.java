
class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        setNim(nim);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (nim != null && nim.length() == 10 && nim.matches("\\d{10}")) {
            this.nim = nim;
        } else {
            throw new IllegalArgumentException("NIM harus 10 digit angka!");
        }
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama + ", NIM: " + nim);
    }

    @Override
    public String toString() {
        return "Mahasiswa{nama='" + nama + "', nim='" + nim + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DATA MAHASISWA ===\n");

        Mahasiswa[] daftarMahasiswa = new Mahasiswa[10];

        try {
            daftarMahasiswa[0] = new Mahasiswa("Budi Santoso", "2201234567");
            daftarMahasiswa[1] = new Mahasiswa("Ani Wijaya", "2201234568");
            daftarMahasiswa[2] = new Mahasiswa("Citra Dewi", "2201234569");
            daftarMahasiswa[3] = new Mahasiswa("Doni Pratama", "2201234570");
            daftarMahasiswa[4] = new Mahasiswa("Eka Putri", "2201234571");
            daftarMahasiswa[5] = new Mahasiswa("Fajar Rahman", "2201234572");
            daftarMahasiswa[6] = new Mahasiswa("Gita Sari", "2201234573");
            daftarMahasiswa[7] = new Mahasiswa("Hendra Gunawan", "2201234574");
            daftarMahasiswa[8] = new Mahasiswa("Indah Permata", "2201234575");
            daftarMahasiswa[9] = new Mahasiswa("Joko Susilo", "2201234576");
            for (int i = 0; i < daftarMahasiswa.length; i++) {
                System.out.print((i + 1) + ". ");
                daftarMahasiswa[i].displayInfo();
            }
            System.out.println("\n=== DEMONSTRASI GETTER & SETTER ===\n");
            Mahasiswa mhs = daftarMahasiswa[0];
            System.out.println("Data awal: " + mhs);

            System.out.println("Nama (getter): " + mhs.getNama());
            System.out.println("NIM (getter): " + mhs.getNim());

            mhs.setNama("Budi Santoso Updated");
            System.out.println("\nSetelah update nama: " + mhs);

            System.out.println("\n=== TEST VALIDASI NIM ===\n");
            try {
                Mahasiswa mhsInvalid = new Mahasiswa("Test", "12345"); // NIM kurang dari 10 digit
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                Mahasiswa mhsInvalid2 = new Mahasiswa("Test2", "12345ABC67"); // NIM mengandung huruf
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("\nValidasi NIM berhasil bekerja!");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
