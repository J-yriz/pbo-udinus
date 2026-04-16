package waktu;

class Main {
    public static void main(String[] args) {
        System.out.println("Fajar Aziz Kurniawan");
        System.out.println("A11.2024.15685");

        Waktu waktuMulai = new Waktu(30, 45, 12);
        Waktu waktuSelesai = new Waktu(15, 30, 8);
        Waktu selisih;

        selisih = Perbedaan.hitungPerbedaan(waktuMulai, waktuSelesai);

        System.out.println("Selisih waktu: " + waktuMulai.jam + ":" + waktuMulai.menit + ":" + waktuMulai.detik + " - " + waktuSelesai.jam + ":" + waktuSelesai.menit + ":" + waktuSelesai.detik + " = " + selisih.jam + ":" + selisih.menit + ":" + selisih.detik);

    }
}