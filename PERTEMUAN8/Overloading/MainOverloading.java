package PERTEMUAN8.Overloading;

public class MainOverloading {
    public static void main(String[] args) {
        System.out.println("main(String[] args) dijalankan oleh JVM");

        main(10);
        main("Java Lab 9");
        main(5, 7);
    }

    public static void main(int angka) {
        System.out.println("main(int angka) dipanggil dengan nilai: " + angka);
    }

    public static void main(String teks) {
        System.out.println("main(String teks) dipanggil dengan teks: " + teks);
    }

    public static void main(int a, int b) {
        System.out.println("main(int a, int b) dipanggil. Hasil jumlah: " + (a + b));
    }
}
