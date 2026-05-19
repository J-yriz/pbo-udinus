package PERTEMUAN8.Polimorfisme;

public class SegitigaSikuSiku extends BangunDatar {

    private double alas;
    private double tinggi;

    public SegitigaSikuSiku(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public void tampilLuas() {
        System.out.println("Luas Segitiga siku-siku adalah " + luas());
    }
}