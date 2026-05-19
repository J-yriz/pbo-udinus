package PERTEMUAN8.Polimorfisme;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Panjang:");
        double panjang = input.nextDouble();

        System.out.println("Masukkan Lebar:");
        double lebar = input.nextDouble();

        BangunDatar persegiPanjang = new PersegiPanjang(panjang, lebar);
        persegiPanjang.tampilLuas();

        System.out.println("Masukkan Panjang:");
        double alas = input.nextDouble();

        System.out.println("Masukkan Tinggi:");
        double tinggi = input.nextDouble();

        BangunDatar segitiga = new SegitigaSikuSiku(alas, tinggi);
        segitiga.tampilLuas();

        System.out.println("Masukkan Jari-jari Lingkaran:");
        double jariJari = input.nextDouble();

        BangunDatar lingkaran = new Lingkaran(jariJari);
        lingkaran.tampilLuas();

        input.close();
    }
}