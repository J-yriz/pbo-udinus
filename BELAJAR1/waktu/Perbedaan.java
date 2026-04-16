package waktu;

public class Perbedaan {
    public static Waktu hitungPerbedaan(Waktu waktuMulai, Waktu waktuSelesai) {
        int totalMulai = (waktuMulai.jam * 3600) + (waktuMulai.menit * 60) + waktuMulai.detik;
        int totalSelesai = (waktuSelesai.jam * 3600) + (waktuSelesai.menit * 60) + waktuSelesai.detik;

        int totalSelisih = Math.abs(totalSelesai - totalMulai);
        int jam = totalSelisih / 3600;
        int menit = (totalSelisih % 3600) / 60;
        int detik = totalSelisih % 60;

        return new Waktu(detik, menit, jam);
    }
}
