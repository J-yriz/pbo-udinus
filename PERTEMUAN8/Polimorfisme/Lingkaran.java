package PERTEMUAN8.Polimorfisme;

public class Lingkaran extends BangunDatar {

    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public void tampilLuas() {
        System.out.printf("Luas Lingkaran adalah %.2f%n", luas());
    }
}