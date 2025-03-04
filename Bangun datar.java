package pbo;
// Kelas abstrak BangunDatar
abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
}

// Kelas Persegi (Turunan dari BangunDatar)
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }
}

// Kelas Lingkaran (Turunan dari BangunDatar)
class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double luas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    double keliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Kelas Segitiga (Turunan dari BangunDatar)
class Segitiga extends BangunDatar {
    private double alas, tinggi, sisi1, sisi2, sisi3;

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double keliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

// Kelas Main untuk menjalankan program
public class Polymorphims {
    public static void main(String[] args) {
        // Array dari berbagai objek BangunDatar
        BangunDatar[] bangunDatar = {
            new Persegi(4),
            new Lingkaran(7),
            new Segitiga(3, 4, 3, 4, 5)
        };

        // Menampilkan luas dan keliling dari masing-masing objek
        for (BangunDatar bangun : bangunDatar) {
            System.out.println(bangun.getClass().getSimpleName() + 
                " -> Luas: " + bangun.luas() + 
                ", Keliling: " + bangun.keliling());
        }
    }
}
