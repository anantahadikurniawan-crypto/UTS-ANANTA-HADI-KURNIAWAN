
class Mahasiswa:
    def __init__(self, nama, nim):
        self.__nama = nama
        self.__nim = None
        self.set_nim(nim)
    
    def get_nama(self):
        return self.__nama
    
    def set_nama(self, nama):
        self.__nama = nama
    
    def get_nim(self):
        return self.__nim
    
    def set_nim(self, nim):
        if nim and len(nim) == 10 and nim.isdigit():
            self.__nim = nim
        else:
            raise ValueError("NIM harus 10 digit angka!")
    
    def display_info(self):
        print(f"Nama: {self.__nama}, NIM: {self.__nim}")
    
    def __str__(self):
        return f"Mahasiswa(nama='{self.__nama}', nim='{self.__nim}')"
    
if __name__ == "__main__":
    print("=" * 50)
    print("PROGRAM DATA MAHASISWA")
    print("=" * 50)
    print()
    
    daftar_mahasiswa = []
    
    try:
        print("Membuat 10 data mahasiswa...\n")
        
        daftar_mahasiswa.append(Mahasiswa("Budi Santoso", "2201234567"))
        daftar_mahasiswa.append(Mahasiswa("Ani Wijaya", "2201234568"))
        daftar_mahasiswa.append(Mahasiswa("Citra Dewi", "2201234569"))
        daftar_mahasiswa.append(Mahasiswa("Doni Pratama", "2201234570"))
        daftar_mahasiswa.append(Mahasiswa("Eka Putri", "2201234571"))
        daftar_mahasiswa.append(Mahasiswa("Fajar Rahman", "2201234572"))
        daftar_mahasiswa.append(Mahasiswa("Gita Sari", "2201234573"))
        daftar_mahasiswa.append(Mahasiswa("Hendra Gunawan", "2201234574"))
        daftar_mahasiswa.append(Mahasiswa("Indah Permata", "2201234575"))
        daftar_mahasiswa.append(Mahasiswa("Joko Susilo", "2201234576"))
        
        print("=" * 50)
        print("DAFTAR MAHASISWA")
        print("=" * 50)
        for i, mhs in enumerate(daftar_mahasiswa, 1):
            print(f"{i}. ", end="")
            mhs.display_info()
        
        print()
        print("=" * 50)
        print("DEMONSTRASI GETTER & SETTER")
        print("=" * 50)
        print()
        
        mhs = daftar_mahasiswa[0]
        print(f"Data awal: {mhs}")
        print()
        
        print("Menggunakan GETTER:")
        print(f"  Nama: {mhs.get_nama()}")
        print(f"  NIM: {mhs.get_nim()}")
        print()
        
        print("Menggunakan SETTER untuk mengubah nama:")
        mhs.set_nama("Budi Santoso Updated")
        print(f"  Data setelah update: {mhs}")
        print()
        
        print("=" * 50)
        print("TEST VALIDASI NIM")
        print("=" * 50)
        print()
        
        print("Test 1: NIM kurang dari 10 digit")
        try:
            mhs_invalid = Mahasiswa("Test User", "12345")
        except ValueError as e:
            print(f"  ✓ Error tertangkap: {e}")
        
        print()
        print("Test 2: NIM mengandung huruf")
        try:
            mhs_invalid2 = Mahasiswa("Test User 2", "12345ABC67")
        except ValueError as e:
            print(f"  ✓ Error tertangkap: {e}")
        
        print()
        print("Test 3: NIM valid (10 digit angka)")
        try:
            mhs_valid = Mahasiswa("Test User 3", "2201234599")
            print(f"  ✓ Berhasil membuat mahasiswa: {mhs_valid}")
        except ValueError as e:
            print(f"  ✗ Error: {e}")
        
        print()
        print("=" * 50)
        print("VALIDASI NIM BERHASIL BEKERJA!")
        print("=" * 50)
        
    except ValueError as e:
        print(f"Error: {e}")
    except Exception as e:
        print(f"Error tidak terduga: {e}")
    
    print()
    print("Program selesai.")
