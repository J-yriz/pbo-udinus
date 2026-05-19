package PERTEMUAN8.Polimorfisme;

public class PersegiPanjang extends BangunDatar {

    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public void tampilLuas() {
        System.out.println("Luas Persegi panjang adalah " + luas());
    }
}