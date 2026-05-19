package PERTEMUAN8.Overloading;

// Overloading 1.1
public class Overloading1 { // Sum
    public int jumlah(int x, int y) {
        return x + y;
    }

    public int jumlah(int x, int y, int z) {
        return x + y + z;
    }

    public double jumlah(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        Overloading1 s = new Overloading1();

        System.out.println(s.jumlah(10, 20));
        System.out.println(s.jumlah(10, 20, 30));
        System.out.println(s.jumlah(10.5, 20.5));

        // Contoh salah:
        // System.out.println(s.jumlah(10));
        // Error karena tidak ada method jumlah dengan 1 parameter.
    }
}
