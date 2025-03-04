// Kelas Abstrak AnggotaKampus
abstract class AnggotaKampus {
    protected String nama;
    protected String id;

    public AnggotaKampus(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    // Method abstrak yang harus diimplementasikan oleh subclass
    abstract void aktivitas();
}

// Kelas Mahasiswa (Turunan dari AnggotaKampus)
class Mahasiswa extends AnggotaKampus {
    private String jurusan;

    public Mahasiswa(String nama, String id, String jurusan) {
        super(nama, id);
        this.jurusan = jurusan;
    }

    @Override
    void aktivitas() {
        System.out.println("Mahasiswa " + nama + " belajar di jurusan " + jurusan);
    }
}

// Kelas Dosen (Turunan dari AnggotaKampus)
class Dosen extends AnggotaKampus {
    private String mataKuliah;

    public Dosen(String nama, String id, String mataKuliah) {
        super(nama, id);
        this.mataKuliah = mataKuliah;
    }

    @Override
    void aktivitas() {
        System.out.println("Dosen " + nama + " mengajar mata kuliah " + mataKuliah);
    }
}

// Kelas Tata Usaha (Turunan dari AnggotaKampus)
class TataUsaha extends AnggotaKampus {
    private String bagian;

    public TataUsaha(String nama, String id, String bagian) {
        super(nama, id);
        this.bagian = bagian;
    }

    @Override
    void aktivitas() {
        System.out.println("Tata Usaha " + nama + " bekerja di bagian " + bagian);
    }
}

// Kelas Main untuk Menjalankan Program
public class KampusPolimorfisme {
    public static void main(String[] args) {
        // Membuat array dari berbagai anggota kampus
        AnggotaKampus[] anggota = {
            new Mahasiswa("Azrieal", "M001", "Manajemen Informatika"),
            new Dosen("Bapak Erlin", "D001", "Pemrograman Dasar"),
            new TataUsaha("Bu Siti", "T001", "Administrasi Akademik")
        };

        // Menampilkan aktivitas setiap anggota kampus
        for (AnggotaKampus a : anggota) {
            a.aktivitas();
        }
    }
}
